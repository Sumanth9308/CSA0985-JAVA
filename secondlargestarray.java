class secondlargestarray 
{
 public static void main(String[] args) 
{
int[] arr = { 10, 23, 6, 45, 3, 17, 32 };
int largest = Integer.MIN_VALUE;
int secondLargest = Integer.MIN_VALUE;

for (int num : arr) 
{
if (num > largest) 
{
secondLargest = largest;
largest = num;
} 
else if (num > secondLargest && num != largest) 
{
secondLargest = num;
}
}
if (secondLargest != Integer.MIN_VALUE) 
{
System.out.println("Second largest element: " + secondLargest);
}
else 
{
System.out.println("No second largest element found.");
}
}
}