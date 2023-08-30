public class lcmnum
{  
public static void main(String[] args)   
{  
int n1 = 80, n2 = 140, lcm;
lcm = (n1 > n2) ? n1 : n2;
    
while(true) 
{
if( lcm % n1 == 0 && lcm % n2 == 0 ) 
{
System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
break;
}
++lcm;
}

int x = 10, y = 11, gcd = 1;  
for(int i = 1; i <= x && i <= y; i++)  
{  
if(x%i==0 && y%i==0)  
gcd = i;  
}  
System.out.printf("\nGCD of %d and %d is: %d.", x, y, gcd);  
}  
}  