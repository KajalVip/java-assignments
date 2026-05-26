interface maximum{
    int max(int a,int b);
}
public class MaximumNumberUsingLambdaExpression {
    static void main(String[] args) {
        maximum obj=(a,b)->(a>b?a:b);
        int result=obj.max(200,201);
        System.out.println(result);
    }
}
