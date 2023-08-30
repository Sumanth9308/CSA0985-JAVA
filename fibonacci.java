import java.util.Scanner;
class fibonacci
{  
public static void main(String args[])  
{    
int n1=0,n2=1,n3,i,num;    

Scanner input = new Scanner(System.in);

System.out.print("enter the fibonzcci:");
num = input.nextInt();

System.out.print(" "+n1);
System.out.print(" "+n2);

for(i=2;i<=num;i++)
{
n3=n1+n2;
n1=n2;
n2=n3;
System.out.print(" "+n3);
}
}
}

