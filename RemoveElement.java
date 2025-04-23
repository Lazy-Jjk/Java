public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int elementToRemove = 3;
        
        int[] newArr = new int[arr.length - 1];
        int index = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != elementToRemove) {
                newArr[index++] = arr[i];
            }
        }
        
        System.out.print("Array after removing " + elementToRemove + ": ");
        for(int num : newArr) System.out.print(num + " ");
    }
} 