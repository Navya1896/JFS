//Write a program to read an integer and check if the given number is even or odd

import java.util.Scanner;
public class EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt();
        if(number%2 == 0){
            System.out.println("The number "+number+" is an even number");
        }else{
            System.out.println("The number "+number+" is an odd number");
        }
    }
}
