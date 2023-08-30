import java.util.Scanner;

public class counti 
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a string: ");
String inputString = scanner.nextLine();
   
int count = counti(inputString, 'i');
        
System.out.println("the letter 'i' appears " + count + " times in the input string.");
}
public static int counti(String inputString, char targetChar)
{
int count = 0;
for (int i = 0; i < inputString.length(); i++)
{
if (inputString.charAt(i) == targetChar)
{
count++;
}
}
return count;
}
}
