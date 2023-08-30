public class reverseword
{
public static void main (String[] args) 
{
String str= "temple", nstr="";
char ch;
System.out.print("Original word: ");
System.out.println("temple");
	
for (int i=0; i<str.length(); i++)
{
ch= str.charAt(i); 
nstr= ch+nstr; 
}
System.out.println("Reversed word: "+ nstr);
}
}