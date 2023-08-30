import java.util.Arrays;

public class matrixaddition
{
public static void main(String[] args)
{
int a[][]={{1,8,3},{4,4,6},{7,4,9}};
int b[][] ={{9,5,7},{6,8,7},{3,9,1}};
int c[][]=new int[3][3];
int i,j,k;

for(i=0; i<3; i++)
{
for(j=0; j<3; j++)
{
c[i][j] = a[i][j] + b[i][j];
System.out.print(" "+c[i][j]);
}
System.out.print(" \n");
}
}
}