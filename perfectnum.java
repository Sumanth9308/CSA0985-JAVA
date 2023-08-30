import java.util.*;

public class perfectnum
{
public static void main(String[] args)
{
int num,sum=0,rem,i;

Scanner sc = new Scanner(System.in);

System.out.print("ente rthe number: ");
num = sc.nextInt();

for(i=1; i<num; i++)
{
if(num % i == 0)
{
sum = sum+i;
}
}
if (sum == num)
{
System.out.print("is a perfect num "+num);
}
else
{
System.out.print("is not a perfect num "+num);
}
}
}