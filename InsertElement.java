public class InsertElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int elementToInsert = 10;
        int position = 2;
        
        int[] newArr = new int[arr.length + 1];
        
        for(int i = 0; i < position; i++) newArr[i] = arr[i];
        newArr[position] = elementToInsert;
        for(int i = position; i < arr.length; i++) newArr[i + 1] = arr[i];
        
        System.out.print("Array after inserting " + elementToInsert + " at position " + position + ": ");
        for(int num : newArr) System.out.print(num + " ");
    }
} 