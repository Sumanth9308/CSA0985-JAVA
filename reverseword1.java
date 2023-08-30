public class reverseword1
{
public static void main(String[] args)
{
String word = "temple";
String reversedWord = reverseWord(word);
System.out.println("Original word: " + word);
System.out.println("Reversed word: " + reversedWord);
}
public static String reverseWord(String word) 
{
StringBuilder reversed = new StringBuilder();
for (int i = word.length() - 1; i >= 0; i--) 
{
reversed.append(word.charAt(i));
}
return reversed.toString();
}
}
