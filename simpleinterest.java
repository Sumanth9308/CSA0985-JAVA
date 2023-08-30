import java.util.Scanner;

class simpleinterest 
{
void display() 
{
Scanner input = new Scanner(System.in);
        
System.out.print("Enter the principal amount: ");
int principal = input.nextInt();

System.out.print("Enter the rate of interest: ");
int rate = input.nextInt();

System.out.print("Enter the time period in years: ");
int time = input.nextInt();

if (rate > 12) 
{
System.out.println("Senior citizen: yes");
}
else 
{
System.out.println("Senior citizen: no");
}

int interest = (principal * rate * time) / 100;
System.out.println("The simple interest is " + interest);
}
public static void main(String[] args) {
simpleinterest si = new simpleinterest();
si.display();
}
}
