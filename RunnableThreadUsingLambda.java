public class RunnableThreadUsingLambda {
    static void main(String[] args) {
        Runnable r=()->{
            for (int i=1;i<8;i++){
                System.out.println(i);
            }
        };
        r.run();
    }
}
