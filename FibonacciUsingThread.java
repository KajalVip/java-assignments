class Fib implements Runnable {

    public void run() {

        int a = 0, b = 1;

        for (int i = 0; i < 5; i++) {

            System.out.println(a);

            int c = a + b;
            a = b;
            b = c;
        }
    }
}

public class FibonacciUsingThread {

    public static void main(String[] args) {

        Fib fib = new Fib();

        Thread t1 = new Thread(fib);

        t1.start();
    }
}