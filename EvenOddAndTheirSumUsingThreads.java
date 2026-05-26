class EvenThread extends Thread {

    int evenSum = 0;

    public void run() {

        System.out.println("Even Numbers:");

        for (int i = 2; i <= 10; i += 2) {

            System.out.print(i + " ");

            evenSum += i;
        }

        System.out.println();
    }
}

class OddThread extends Thread {

    int oddSum = 0;

    public void run() {

        System.out.println("Odd Numbers:");

        for (int i = 1; i <= 9; i += 2) {

            System.out.print(i + " ");

            oddSum += i;
        }

        System.out.println();
    }
}

class SumThread extends Thread {

    int total;

    SumThread(int evenSum, int oddSum) {

        total = evenSum + oddSum;
    }

    public void run() {

        System.out.println("Total Sum = " + total);
    }
}

public class EvenOddAndTheirSumUsingThreads {

    public static void main(String[] args)
            throws Exception {

        EvenThread t1 = new EvenThread();

        OddThread t2 = new OddThread();

        // Start even thread
        t1.start();

        // Wait until t1 completes
        t1.join();

        // Start odd thread
        t2.start();

        // Wait until t2 completes
        t2.join();

        // Start sum thread
        SumThread t3 =
                new SumThread(t1.evenSum, t2.oddSum);

        t3.start();
    }
}