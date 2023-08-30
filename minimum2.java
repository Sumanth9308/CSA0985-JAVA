import java.util.Arrays;

public class mini2element
{
public static void main(String[] args)
{
int a[] = {1,3,4,7,9};
int min=a[0];
int secmin = a[1];

for(int i=0; i<a.length; i++)
{
if (a[i] < min)
{
secmin = min;
min = a[i];
}
}

System.out.println(" "+min);
System.out.println(" "+secmin);
}
}