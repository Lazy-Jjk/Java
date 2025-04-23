public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {20, 20, 30, 40, 50, 50, 50};
        int j = 0;
        for(int i = 1; i < arr.length; i++)
            if(arr[i] != arr[j]) arr[++j] = arr[i];
        System.out.println("New length of array after removing duplicates: " + (j + 1));
    }
} 