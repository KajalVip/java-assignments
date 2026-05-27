import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GenerateAndPrintUsingExecutorService {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newSingleThreadExecutor();
        for(int i=0;i<=5;i++){
            int num=i;
            executor.execute(()->{
                System.out.println("Thread 0 generates->"+num);
            });
            executor.execute(()->{
                System.out.println("Thread 1 prints->"+num);
            });
        }

}}
