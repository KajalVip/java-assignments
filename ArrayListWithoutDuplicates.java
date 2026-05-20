import java.util.ArrayList;

public class ArrayListWithoutDuplicates {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        addElement(list, "Apple");
        addElement(list, "Banana");
        addElement(list, "Apple"); // Duplicate

        System.out.println(list);
    }

    public static void addElement(ArrayList<String> list, String element) {

        // Check duplicate before adding
        if (!list.contains(element)) {
            list.add(element);
        } else {
            System.out.println(element + " already exists.");
        }
    }
}