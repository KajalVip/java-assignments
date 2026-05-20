import java.util.HashSet;

public class FindDuplicate {
    public static void main(String[] args) {

        int[] arr = {1, 5, 7, 9, 3, 5, 10};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {

            // If number already exists, it's duplicate
            if (set.contains(num)) {
                System.out.println("Duplicate number is: " + num);
                break;
            }

            set.add(num);
        }
    }
}