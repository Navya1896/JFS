import java.util.Scanner;

//"1. Write a program to print 4th table using for loop
//        2. Write a program to return month if i give a value between 1-12
//        3. Write a program to return the sum of first 10 even number and odd numbers
//        4. Write a Program to check whether the give number is prime number or not
//        5. Write a program to find the factorial of any given number"
class FourthTable{
    public FourthTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Below is the Fourth Table: ");
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}

class Month{
    public void month(){
        int monthNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from 1 - 12 to get the month");
        monthNumber = sc.nextInt();
        switch (monthNumber){
            case 1:
                System.out.println(monthNumber+ " is January Month");
                break;
            case 2:
                System.out.println(monthNumber+ " is Febraury Month");
                break;
            case 3:
                System.out.println(monthNumber+ " is March Month");
                break;
            case 4:
                System.out.println(monthNumber+ " is April Month");
                break;
            case 5:
                System.out.println(monthNumber+ " is May Month");
                break;
            case 6:
                System.out.println(monthNumber+ " is June Month");
                break;
            case 7:
                System.out.println(monthNumber+ " is July Month");
                break;
            case 8:
                System.out.println(monthNumber+ " is August Month");
                break;
            case 9:
                System.out.println(monthNumber+ " is September Month");
                break;
            case 10:
                System.out.println(monthNumber+ " is October Month");
                break;
            case 11:
                System.out.println(monthNumber+ " is November Month");
                break;
            case 12:
                System.out.println(monthNumber+ " is December Month");
                break;
            default:
                System.out.println("You have entered invalid number. Enter from 1 - 12 ");

        }
    }
}
class EvenOddSum{
    public void sumOfEvenOdd(){
        int sumOfEven = 0, sumOfOdd = 0;
        for(int i = 1; i<=10; i++){
            if(i%2 == 0){
                sumOfEven = sumOfEven + i;
            }
            else{
                sumOfOdd = sumOfOdd + i;
            }
        }
        System.out.println("Sum of Even Numbers is: "+sumOfEven);
        System.out.println("Sum of Odd Numbers is: "+sumOfOdd);
    }
}

class PrimeNumber{
    public void primeNumberCheck(int num){
        int count = 0;
        for(int i = 2; i<=num; i++){
            if(num%i == 0){
                count++;
            }
        }
        if(count > 1){
            System.out.println("The given number is not Prime Number");
        }
        else {
            System.out.println("The given number is Prime Number");
        }
    }
}
class FactorialOfNumber{
    public void factorialNum(int num){
        int factorial = num;
        for(int i = num; i>1; i--){
            factorial = factorial * (i-1);
        }
        System.out.println("The Factorial of Number = "+factorial);
    }

}
public class Loops {
    public static void main(String[] args) {
        FourthTable fourthTable = new FourthTable(4);

        Month month = new Month();
        month.month();

        EvenOddSum evenOddSum = new EvenOddSum();
        evenOddSum.sumOfEvenOdd();

        PrimeNumber primeNumber = new PrimeNumber();
        primeNumber.primeNumberCheck(23);

        FactorialOfNumber factorialOfNumber = new FactorialOfNumber();
        factorialOfNumber.factorialNum(8);



    }

}
