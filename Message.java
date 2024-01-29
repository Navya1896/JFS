import java.awt.*;

//5. Write a Java program to print message using class
public class Message {
    public Message() {
        System.out.println("This is Default Constructor");
    }

    public Message(String msg) {
        System.out.println("This is Parameterized constructor");
    }

    public static void main(String[] args) {


            int[] inputArray = {1, 2, 3, 4, 5};
            int rows = 4;
            int cols = inputArray.length;

            int[][] rotatedArray = new int[rows][cols];

            // Rotate the input array in the specified pattern
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    rotatedArray[i][j] = inputArray[(cols + j - i) % cols];
                }
            }

            // Print the rotated array
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(rotatedArray[i][j] + " ");
                }
                System.out.println();
            }
        }


    }


