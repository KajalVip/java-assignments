class NumberPrinter {

    private int number = 1;
    private final int MAX = 10;

    // Print odd numbers
    public synchronized void printOdd() {

        while (number <= MAX) {

            // Wait if number is even
            while (number % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if (number <= MAX) {
                System.out.println("Odd Thread : " + number);
                number++;
                notify();
            }
        }
    }

    // Print even numbers
    public synchronized void printEven() {

        while (number <= MAX) {

            // Wait if number is odd
            while (number % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if (number <= MAX) {
                System.out.println("Even Thread: " + number);
                number++;
                notify();
            }
        }
    }
}

public class EvenOddUsingThread {
    public static void main(String[] args) {

        NumberPrinter printer = new NumberPrinter();

        // Odd Thread
        Thread oddThread = new Thread(() -> {
            printer.printOdd();
        });

        // Even Thread
        Thread evenThread = new Thread(() -> {
            printer.printEven();
        });

        oddThread.start();
        evenThread.start();
    }
}