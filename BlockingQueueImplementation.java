import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueueImplementation {
    Queue<Integer> queue=new LinkedList<>();
    int capacity;
    BlockingQueueImplementation(int capacity){
        this.capacity=capacity;
    }
    public synchronized void put (int value) throws InterruptedException{
        while(queue.size()==capacity){
            wait();
        }
        queue.add(value);
        System.out.println(Thread.currentThread().getName()+"put "+value);
        notify();
    }
    public synchronized int take() throws InterruptedException{
        while(queue.isEmpty()){
            wait();
        }
        int value=queue.remove();
        System.out.println(Thread.currentThread().getName()+" take "+value);
        notify();
        return value;
    }

    static void main(String[] args) {
        BlockingQueueImplementation bq=new BlockingQueueImplementation(3);
        Thread producer=new Thread(()->{
                try {
                    for (int i = 1; i <= 5; i++) {
                        bq.put(i);
                    }
                }
                catch(Exception e){

                    }
        });
        Thread consumer=new Thread(()->{
            try {
                    for (int i = 1; i <= 5; i++) {
                        bq.take();
                    }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });
        producer.start();
        consumer.start();

    }
}
