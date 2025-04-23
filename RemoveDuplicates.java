import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 3, 1};

        Set<Integer> unique = new HashSet<>();
        for (int num : arr) {
            unique.add(num);
        }

        System.out.print("Array without duplicates: ");
        for (int num : unique) {
            System.out.print(num + " ");
        }
    }
}
