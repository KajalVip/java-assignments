class Print {

    boolean flag = true;

    synchronized void printA() throws Exception {

        for (int i = 0; i < 5; i++) {

            while (!flag)
                wait();

            System.out.print("A ");

            flag = false;

            notify();
        }
    }

    synchronized void printB() throws Exception {

        for (int i = 0; i < 5; i++) {

            while (flag)
                wait();

            System.out.print("B ");

            flag = true;

            notify();
        }
    }
}

public class AlternateCharacterPrintingUsingThread {

    public static void main(String[] args) {

        Print p = new Print();

        // Thread for A
        Thread t1 = new Thread(() -> {
            try {
                p.printA();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        // Thread for B
        Thread t2 = new Thread(() -> {
            try {
                p.printB();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
    }
}