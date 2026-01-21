import java.util.Scanner;

class Person {
    int id;
    String name;
    String passport;

    Person(int id, String name, String passport) {
        this.id = id;
        this.name = name;
        this.passport = passport;
    }
}

public class OnetoOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        sc.nextLine();

        Person[] persons = new Person[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of person " + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Passport Number: ");
            String passport = sc.nextLine();

            persons[i] = new Person(id, name, passport);
        }

        System.out.print("\nEnter Person ID to search: ");
        int searchId = sc.nextInt();

        boolean found = false;

        for (Person p : persons) {
            if (p.id == searchId) {
                System.out.println("\nPerson Found!");
                System.out.println("ID: " + p.id);
                System.out.println("Name: " + p.name);
                System.out.println("Passport: " + p.passport);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Person not found");
        }

        sc.close();
    }
}
