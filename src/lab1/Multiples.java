package lab1;

public class Multiples {
    public static void main(String[] args) {
        // Linear time
        System.out.println(multiplesLinear());
        System.out.println(multiplesLinear(1000, 3, 5));

        // Constant time
        System.out.println(multiples(1000, 3, 5));
    }

    public static int multiples(int n, int a, int b) {
        // we are only considering number of ints less than n
        if (a == b) {
            return (n - 1) / a;
        }

        int multOfA = (n - 1) / a; // counts number of numbers divisible by a (...if you think about it, it makes sense)
        int multOfB = (n - 1) / b; // counts number of numbers divisible by b
        int multOfAB = (n - 1) / (a * b); // counts number of numbers divisible by ab

        // picture a venn diagram where:
        // the sample space is numbers less than n
        // A is the set of numbers divisible by a
        // B is the set of numbers divisible by b
        // A \cap B is the set of numbers divisible by both ab
        // What we are looking for here is A \cup B, which is |A| + |B| - |A \cap B|

        return multOfA + multOfB - multOfAB;
    }

    public static int multiples() {
        // we are only considering number of ints less than n
        int multOfA = (1000 - 1) / 3;
        int multOfB = (1000 - 1) / 5;
        int multOfAB = (1000 - 1) / (3 * 5);

        return multOfA + multOfB - multOfAB;
    }

    public static int multiplesLinear(int n, int a, int b) {
        int total = 0; // 1
        for (int i = 1; i < n; i++) { // 1 (check true) run over n times (linear)
            if (i % a == 0 || i % b == 0) { // 2 (check ea case)
                total++; // 1
            }
        }
        return total; // 1

        // step count worst case: 3n + 2
        // CONSIDER: Set theory
    }

    public static int multiplesLinear() {
        int total = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                total++;
            }
        }
        return total;
    }
}
