import java.util.ArrayList;

public class ArrayListWithoutDuplicateUsingContains {
    static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        addElement(al,"Java");
        addElement(al,"Python");
        addElement(al,"Java");
    }
    public static void addElement(ArrayList<String> al, String str){
        if(!al.contains(str)){
            al.add(str);
            System.out.println(str+" added");
        }
        else{
            System.out.println(str +" Duplicate element");
        }


    }
}
