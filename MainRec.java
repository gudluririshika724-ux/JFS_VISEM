import java.util.*;
public class MainRec {
    public static boolean pali_fun(String s,int i,int j)
    {
        if(i>=j){
            return true;
        }
        else if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        else{
            return pali_fun( s,i+1,j-1);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        int n=ch.length;
         int i=0,j=n-1;
        if (pali_fun(s,i,j))
        {
            System.out.println("palindrome");
        }
        else{
             System.out.println("Not a palindrome");
        }
    }
}
    

