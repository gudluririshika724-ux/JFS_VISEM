import java.util.*;

class Employee 
{
    int id;
    String name;
    float salary;

    Employee(int id, String name, float salary) 
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

class Department   // (One → Many)
{  
    int deptId;
    String deptName;
    List<Employee> emplst;

    Department(int did, String dname, List<Employee> emplst) 
    {
        this.deptId = did;
        this.deptName = dname;
        this.emplst = emplst;
    }
}

public class OneToManyDemo 
{
    public static void main(String[] args) 
    {
        Employee e1 = new Employee(1, "Ravi", 10000);
        Employee e2 = new Employee(2, "Anita", 11000);

        List<Employee> empList = new ArrayList<Employee>();
        empList.add(e1);
        empList.add(e2);

        Department dept = new Department(101, "CSE", empList);

        System.out.println("Department: " + dept.deptName);

        float total = 0;

        // ✅ initialize highestPaid
        Employee highestPaid = dept.emplst.get(0);

        for (Employee e : dept.emplst) 
        {
            System.out.println(e.id + " " + e.name + " " + e.salary);
            total += e.salary;

            if (e.salary > highestPaid.salary)
            {
                highestPaid = e;
            }
        }

        System.out.println("Average salary: " + (total / dept.emplst.size()));

        System.out.println("Highest Paid Employee:");
        System.out.println(highestPaid.id + " " + highestPaid.name + " " + highestPaid.salary);
    }
}
