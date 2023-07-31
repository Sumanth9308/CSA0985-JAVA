import java.util.Scanner;
import java.util.*;
public class greatest
{
    public static void main(String[] args)
    {
        int a,b,c,greatest,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");  
        a = sc.nextInt(); 
        System.out.println("Enter the sceond number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();
        temp=a>b?a:b;
        greatest = c > temp? c:temp;
        System.out.println("The greatest number is: "+greatest);
    }
}
