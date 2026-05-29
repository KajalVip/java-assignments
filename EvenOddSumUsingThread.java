/*
class Printer{
    private int odd=1;
    private  int even=2;
    private final int max=10;
    private int turn=1;
    synchronized void printOdd(){
        while(odd<=max){
            while(turn!=1){
                try{
                    wait();
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.print(odd+"\n");
            turn=2;
            notifyAll();
        }
    }
    synchronized void printEven(){
        while(even<=max){
            while(turn!=2){
                try{
                    wait();
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.print(even+"\n");
            turn=3;
            notifyAll();
        }
    }
    synchronized void printSum(){
        while(odd<=max && even<=max){
            while(turn !=3){
                try{
                    wait();
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
                System.out.print("sum="+(odd+even)+"\n");
                odd+=2;
                even+=2;
                turn=1;
                notifyAll();
            }
        }
    }

}
public class EvenOddSumUsingThread {
    public static void main(String[] args) {
        Printer printer=new Printer();
        Thread t1=new Thread(()->{ printer.printOdd();});
        Thread t2=new Thread(()->{printer.printEven();});
        Thread t3=new Thread(()->{printer.printSum();});
        t1.start();
        t2.start();
        t3.start();
    }
}
*/
class Printer {

    private int odd = 1;
    private int even = 2;
    private final int MAX = 10;

    // Flag values
    // 1 -> Odd turn
    // 2 -> Even turn
    // 3 -> Sum turn
    private int turn = 1;

    synchronized void printOdd() {

        while (odd <= MAX) {

            while (turn != 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Thread-odd : " + odd);

            turn = 2;

            notifyAll();
        }
    }

    synchronized void printEven() {

        while (even <= MAX) {

            while (turn != 2) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Thread-even: " + even);

            turn = 3;

            notifyAll();
        }
    }

    synchronized void printSum() {

        while (odd <= MAX && even <= MAX) {

            while (turn != 3) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Thread-sum : " + (odd + even));

            odd += 2;
            even += 2;

            turn = 1;

            notifyAll();
        }
    }
}

public class EvenOddSumUsingThread {

    public static void main(String[] args) {

        Printer printer = new Printer();

        Thread t1 = new Thread(() -> {
            printer.printOdd();
        });

        Thread t2 = new Thread(() -> {
            printer.printEven();
        });

        Thread t3 = new Thread(() -> {
            printer.printSum();
        });

        t1.start();
        t2.start();
        t3.start();
    }
}