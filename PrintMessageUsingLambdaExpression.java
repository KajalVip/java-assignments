interface print{
    void printer();
}
public class PrintMessageUsingLambdaExpression {
    static void main(String[] args) {
        print obj=()->System.out.println("Print something");
        obj.printer();
    }
}
