interface addition{
    int add(int a,int b);
}
public class AdditionUsingLambdaExpression {

    public static void main(String[] args) {
        addition obj=(a,b)->a+b;
        int result=obj.add(10,20);
        System.out.println(result);
    }
}
