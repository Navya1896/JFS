import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class ArthimeticOperations {

    int a, b, c, d;
    public static void main(String[] args){
        ArthimeticOperations sum1 = new ArthimeticOperations();
        sum1.a = -5;
        sum1.b = 8;
        sum1.c = 6;
        System.out.println("Problem 1 Solution(-5+8*6) = " + (sum1.a+sum1.b* sum1.c));

       sum1.a = 55;
       sum1.b = 9;
       System.out.println("Problem 2 Solution(55+9)%9 = " + ((sum1.a+sum1.b)% sum1.b));

       sum1.a = 20;
       sum1.b = -3;
       sum1.c = 5;
       sum1.d = 8;
       System.out.println("Problem 3 Solution(20 + -3 * 5/8) = " + (sum1.a+sum1.b*sum1.c/sum1.d));

       System.out.println("Problem 4 Solution(5+15/3*2-8%3) = " + (5+15/3*2-8%3));

    }

}
// -5 + 8 * 6
//         b. (55+9) % 9
//         c. 20 + -3*5 / 8
//         d. 5 + 15 / 3 * 2 - 8 % 3

