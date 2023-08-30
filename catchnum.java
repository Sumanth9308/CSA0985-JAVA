class catchnum 
{
public static void main(String[ ] args) 
{
int a[] = {1,2,3,4,5};
int i;
try
{
for(i=0;i<a.length;i++)
{
System.out.println(a[i]+"");
}
}
catch(Exception e)
{
System.out.println("something went wroung");
}
}
}