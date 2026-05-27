
class GenerateThread_R implements Runnable {
    int number;
    GenerateThread_R(int number) {
        this.number = number;
    }
    @Override
    public void run() {
        System.out.println("Thread 0 generate->"+number);
    }
}
class PrintThread_R implements Runnable {
    int number;
    PrintThread_R(int number) {
        this.number = number;
    }
    @Override
    public void run() {
        System.out.println("Thread 1 print->"+number);
    }
}
public class GenerateAndPrintUsingRunnable {
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
