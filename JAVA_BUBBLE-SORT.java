public class Bubble {
    public static void generateArray(int[] arr1){
        for(int i=0;i<arr1.length;i++) {
            arr1[i] = (int) (Math.random() * 100 + 1);
        }
    }
    public static void bubbleSort(int[] arr2){
        int tmp=0;
        for(int i=0;i<arr2.length-1;i++) {
            for (int j = 0; j < arr2.length - 1; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    tmp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = tmp;
                }
            }
        }
    }
    public static void printArray(int[] arr3){
        for(int i=0;i<arr3.length;i++) {
            System.out.print(arr3[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] val = new int[5];
        generateArray(val);
        System.out.print("Before Bubble Sorting: ");
        printArray(val);
        bubbleSort(val);
        System.out.print("\nAfter Bubble Sorting: ");
        printArray(val);
    }
}