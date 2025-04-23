import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8, 4};

        Set<Integer> printed = new HashSet<>();

        System.out.print("Common elements: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && !printed.contains(arr1[i])) {
                    System.out.print(arr1[i] + " ");
                    printed.add(arr1[i]);
                    break;
                }
            }
        }
    }
}
