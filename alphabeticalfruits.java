import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class alphabeticalfruits 
{
public static void main(String[] args) 
{
List<String> fruits = new ArrayList<>();
fruits.add("apple");
fruits.add("fig");
fruits.add("banana");
fruits.add("orange");
fruits.add("mango");
fruits.add("grape");
fruits.add("kiwi");

Collections.sort(fruits);

System.out.println("fruits in alphabetical order:");
for (String fruit : fruits) 
{
System.out.println(fruit);
}
}
}
