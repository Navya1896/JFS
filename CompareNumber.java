//Write a Java program that accepts four integers from the user and
// prints equal if all four are equal, and not equal otherwise.
import java.util.Scanner;
public class CompareNumber {
    public static void main(String[] args) {
        int num1, num2, num3, num4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number : ");
        num1 = sc.nextInt();
        System.out.println("Enter the Second number : ");
        num2 = sc.nextInt();
        System.out.println("Enter the Third number : ");
        num3 = sc.nextInt();
        System.out.println("Enter the Fourth number : ");
        num4 = sc.nextInt();
        if(num1 == num2 && num1 == num3 && num1 == num4){
            if(num2 == num3 && num2 == num4){
                if(num3 == num4){
                    System.out.println("All the numbers are equal");
                }
            }
        }
        else{
            System.out.println("All the numbers are not equal");
        }


    }
}
