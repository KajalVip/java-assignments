class GenerateThread extends Thread {
    int number;
    GenerateThread(int number) {
        this.number = number;
    }
    @Override
    public void run() {
        System.out.println("Thread 0 generate->"+number);
    }
}
class PrintThread extends Thread {
    int number;
    PrintThread(int number) {
        this.number = number;
    }
    @Override
    public void run() {
        System.out.println("Thread 1 print->"+number);
    }
}
public class GenerateAndPrintUsingThread {
    static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <= 5; i++) {
            GenerateThread gt = new GenerateThread(i);
            PrintThread pt = new PrintThread(i);
            gt.start();
            gt.join();
            pt.start();
            pt.join();

        }
    }
}
