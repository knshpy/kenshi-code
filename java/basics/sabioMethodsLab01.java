/* Note for bug!
 * printReport("Ben", 92, 85, 88);
 * you cant println a method you just call it 
*/ 

import java.util.Scanner;

public class sabioMethodsLab01 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Call problem 1 method (greetings)
        greetings("Kenshi", 19);
        greetings("Ana", 18);

        // Problem 2:
        System.out.print("\nEnter length: ");
        double length = scanner.nextInt();

        System.out.print("Enter width: ");
        double width = scanner.nextInt();

        // Output
        System.out.println("Area:" + area(length, width));
        System.out.println("Perimeter: " + perimeter(length, width));

        System.out.println();
        scanner.close();

        // Problem 3:
        //Part a
        int num = 8;
        System.out.println("Result: " + isEven(num));

        //Part b
        int[] numbers = {3, 4, 2, 8, 7, 9, 1};
        System.out.println("Result: " + countEven(numbers));

        // Problem 4:
        System.out.println();
        printReport("Ben", 92, 85, 88);
        printReport("Ana", 80, 72, 91);
    }
    /*
     * Problem 1: Greeting Method
     */
    public static void greetings(String name, int age) {
        // declare variable for adding person's age 
        int newAge = age + 1;
        System.out.println("Hello, " + name + "! " + "You will be " + newAge + " next year");
    }
    /*
     * Problem 2: Rectangle Area and Perimeter (2 methods)
     */
    public static double area(double length, double width) {
        // multiple input
        return(length * width);
    }
    public static double perimeter(double length, double width) {
        // add input and multiply to 2
        return 2 * (length + width);
    }
    /*
     * Problem 3: Even or odd checker part a
     */

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
    /*
     * Problem 3: part b
     */
    public static int countEven(int[] numbers) {
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (isEven(numbers[i])) {
                count++;
            }
        }
        return count;
    }
    /*
     * Problem 4: Grade calculator 
     */
    public static double average(int a, int b, int c) {
        return(a + b + c) / 3.0;
    }
    // Return if A B C D or F grade 
    public static char letterGrade(double avg) {
        if (avg >= 90) {
            return 'A';
        } else if (avg >= 80) {
            return 'B';
        } else if (avg >= 70) {
            return 'C';
        } else if (avg >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    // Report card
    public static void printReport(String name, int a, int b, int c) {
        double avg = average(a, b, c);
        char grade = letterGrade(avg);

        System.out.println("Student: " + name);
        System.out.println("Average: " + average(a, b, c));
        System.out.println("Grade: " + letterGrade(avg));
    }
}
   