//Write a Java program that reads a number in inches and converts it to meters.
import java.util.Scanner;
public class InchesToMeters {
    public static void main(String[] args) {
        float number, result;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number in inches : ");
        number = obj.nextFloat();
        result = number * 0.0254f;
        System.out.println("Number " + number + " inches is converted to meters. \nThe result is = "+ result+" meters");



    }
}
