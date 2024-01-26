//If the marks of Robert in three subjects are 78,45 and 62
//respectively (each out of 100 ), write a program to calculate
//his total marks and percentage marks.

public class TotalScore {
    public static void main(String[] args) {
        int m1 = 78, m2 = 45, m3 = 62;
        float totalMarks = m1 + m2 + m3;
        float percentage = totalMarks/300 * 100;
        System.out.println("Total Marks of Robert is : " + totalMarks);
        System.out.println("Percentage Marks of Robert is : " + percentage);
    }
}
