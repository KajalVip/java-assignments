import java.util.Arrays;

public class FindDuplicateUsingSorting {
    public static void main(String[] args) {

        int[] arr = {1, 5, 7, 9, 3, 5, 10};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[i + 1]) {
                System.out.println("Duplicate number is: " + arr[i]);
                break;
            }
        }
    }
}