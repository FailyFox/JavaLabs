/**
 * Lab №1
 * @author Matviy Utieshev
 * @version 1.0
 */
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello World");

        Task2 obj = new Task2();
        System.out.println(obj.a + "\n" + obj.b);

        int x1 = in.nextInt(), x2 = in.nextInt(), x3 = in.nextInt();
        System.out.println(x1 + ", " + x2 + ", " + x3);

        Interval interval = new Interval();
        System.out.print("Enter beginning of the interval: ");
        interval.beginning = in.nextInt();
        System.out.print("Enter end of the interval: ");
        interval.end = in.nextInt();

        System.out.print("Odd numbers: ");
        interval.Odd();
        System.out.print("Even numbers: ");
        interval.Even();

        System.out.println("Sum of odd numbers: " + interval.SumOdd());
        System.out.println("Sum of even numbers: " + interval.SumEven());

        System.out.print("Enter length of Fibonacci: ");
        int length = in.nextInt();
        if (interval.end % 2 != 0) {
            System.out.print("Fibonacci: " + interval.end + " ");
            interval.even++;
        }
        else if (interval.end % 2 == 0) {
            System.out.print("Fibonacci: " + (interval.end - 1) + " ");
            interval.odd++;
        }
        for (int i = 0; i < length - 1; ++i)
            System.out.print(interval.Fibonacci(i) + " ");

        System.out.println("\nRate of odd numbers: " + interval.rateOdd(length) + "%");
        System.out.println("Rate of even numbers: " + interval.rateEven(length) + "%");
    }
}