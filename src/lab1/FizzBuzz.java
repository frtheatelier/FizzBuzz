package lab1;

/**
 * Solve the lab1.FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        fizzbuzzFor();
        fizzbuzzWhile();
    }

    private static void fizzbuzzFor() {
        for (int i = 1; i < 100; i++) { // for loop in java is reminiscent of cpp ; brackets and require defining var
            doFizzBuzz(i);
        }
    }

    private static void fizzbuzzWhile() {
        int i=0;
        while (i < 100) {
            doFizzBuzz(i);
            i++;
        }
    }

    private static void doFizzBuzz(int i) {
        // the curly brackets are used in place of colon

        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0; // mod is the same lol, equivalent thing is also the same
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) { // and: &&

            System.out.println("Fizz Buzz"); // println: print new line i think

        } else if (divisibleBy3) { // elif -> else if lol

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
    }
}
