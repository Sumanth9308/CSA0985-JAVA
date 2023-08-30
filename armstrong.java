public class armstrong
{
public static void main(String args[])
{
int num=114,orgnum,remain,result=0;

orgnum=num;

while(orgnum !=0)
{
remain = orgnum % 10;
result += (remain*remain*remain);
orgnum /=10;
}

if(result == num)
System.out.println(num + " is a armstrong num.");
else
System.out.println(num + " is an  armstrong num.");
}
}
