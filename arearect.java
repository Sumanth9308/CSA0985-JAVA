import java.util.Scanner;

public class arearect 
{
    private double length;
    private double breadth;

    public void setDim(double length, double breadth) 
{
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }

    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
        arearect areaObj = new arearect();

        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();

        System.out.println("Enter the breadth of the rectangle:");
        double breadth = scanner.nextDouble();

        areaObj.setDim(length, breadth);
        double area = areaObj.getArea();

        System.out.println("Area of the rectangle: " + area);
    }
}