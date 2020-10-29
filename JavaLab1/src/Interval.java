public class Interval
{
    /** fields: the beginning of the interval, end of interval,
     * number of odd numbers, number of even numbers
     */
    public int beginning, end, odd = 0, even = 0;

    /** constructor - creation of a new object */
    Interval()
    {
        beginning = 0;
        end = 0;
        odd = 0;
        even = 0;
    }

    /** odd number output function */
    public void Odd() {
        for (int i = beginning; i <= end; ++i)
            if (i % 2 != 0)
                System.out.print(i + " ");
        System.out.println();
    }
    /** even number output function */
    public void Even() {
        for (int i = end; i >= beginning; --i)
            if (i % 2 == 0)
                System.out.print(i + " ");
        System.out.println();
    }
    /**
     * function of adding odd numbers
     * @return returns the sum of odd numbers
     */
    public int SumOdd() {
        int sum = 0;
        for (int i = beginning; i <= end; ++i)
            if (i % 2 != 0)
                sum += i;
        return sum;
    }
    /**
     * function of adding even numbers
     * @return returns the sum of even numbers
     */
    public int SumEven() {
        int sum = 0;
        for (int i = beginning; i <= end; ++i)
            if (i % 2 == 0)
                sum += i;
        return sum;
    }
    /**
     * Fibonacci series output function
     * @return returns the second number of a series
     */
    public int Fibonacci(int length) {
        int first = beginning, second = end, cache;
        if (end % 2 != 0) {
            first = end;
            second = end - 1;
        }
        else if (end % 2 == 0) {
            first = end - 1;
            second = end;
        }
        for (int i = 0; i < length; ++i) {
            cache = first + second;
            first = second;
            second = cache;
        }
        if (second % 2 != 0)
            odd++;
        else if (second % 2 == 0)
            even++;
        return second;
    }
    /**
     * the function of calculating the percentage of odd numbers
     * @return returns the percentage of odd numbers
     */
    public int rateOdd(int length) {
        return odd * 100 / length;
    }
    /**
     * the function of calculating the percentage of even numbers
     * @return returns the percentage of even numbers
     */
    public int rateEven(int length) {
        return even * 100 / length;
    }
}