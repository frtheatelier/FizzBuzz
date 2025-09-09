package lab1;

public class Reduce {
    public static void main(String[] args) {
        System.out.println(reduce(100));
        System.out.println(reduceRecurse(100));
    }

    public static int reduce(int n) {
        int steps = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
            }

            steps++;
        }

        return steps;
    }

    public static int reduceRecurse(int n) {
        if (n == 0) {
            return 0;
        }

        if (n % 2 == 0) {
            int steps = reduceRecurse(n / 2);
            return steps + 1;
        } else {
            int steps = reduceRecurse(n - 1);
            return steps + 1;
        }
    }
}
