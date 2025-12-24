import java.util.*;
public class Sum
{
    public static int sumofthedigits(int m)
    {
        if(m==0)
            return 0;
        return (m%10+sumofthedigits(m/10));
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int s=sumofthedigits(m);
        System.out.println(s);
    }
    
}
