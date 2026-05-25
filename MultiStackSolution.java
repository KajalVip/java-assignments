import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MultiStackSolution {
    private int capacity;
    private List<Stack<Integer>>stacks;
    public MultiStackSolution(int capacity){
        this.capacity=capacity;
        stacks=new ArrayList<>();
    }
    // push
    public void push(int value){
        Stack<Integer>lastStack=getLastStack();
        if(lastStack==null ||lastStack.size()==capacity){
            Stack<Integer>newStack=new Stack();
            newStack.push(value);
            stacks.add(newStack);
        }
        else{
            lastStack.push(value);
        }
    }
    //getLastStack
    private Stack<Integer>getLastStack(){
        if (stacks.isEmpty()){
            return null;
        }
        return stacks.get(stacks.size()-1);
    }
    //pop
    public int pop(){
        Stack<Integer>lastStack=getLastStack();
        if (lastStack==null){
            throw new RuntimeException("Stack is empty");

        }
        int value=lastStack.pop();
        if (lastStack.isEmpty()){
            stacks.remove(stacks.size()-1);
        }
        return value;
    }
    public void display(){
        System.out.println(stacks);
    }
}
class Test{
    public static void main(String[] args){
        MultiStackSolution solution=new MultiStackSolution(3);
        solution.push(1);
        solution.push(2);
        solution.push(3);
        solution.push(4);
        solution.push(5);
        solution.push(6);
        solution.push(7);
        solution.display();
        solution.pop();
        solution.pop();
        solution.display();
    }
}