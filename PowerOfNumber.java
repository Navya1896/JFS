import java.util.Scanner;

//Write a Java program that reads a number and displays the square, cube, and fourth power.
public class PowerOfNumber {
    public static void main(String[] args) {
        Integer number, prod;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the square, cube and fourth power : ");
        number = sc.nextInt();
        prod = number;
        System.out.println("The Square of the number "+number+" is = "+ (number*number));
        System.out.println("The Cube of the number "+number+" is = "+(Math.pow(number,3)));
        System.out.println("The fourth power of the number "+number+" is = "+(Math.pow(number,4)));


        for(int i = 1; i<=100; i++){
            prod = prod*number;
        }
        System.out.println("Power of 100 = "+ prod);

    }
}
