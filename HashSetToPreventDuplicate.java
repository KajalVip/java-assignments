import java.util.HashSet;

public class HashSetToPreventDuplicate {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicate ignored

        System.out.println(set);
    }
}