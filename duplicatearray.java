import java.util.*;

class duplicatearray 
{
public static void removeDuplicates(int[] a)
{
LinkedHashSet<Integer> set
            = new LinkedHashSet<Integer>();
 
for (int i = 0; i < a.length; i++)
set.add(a[i]);
 
System.out.print(set);
}
public static void main(String[] args)
{
int a[] = {1,4,4,5,2,4,5,6,9,0};
removeDuplicates(a);
}
}