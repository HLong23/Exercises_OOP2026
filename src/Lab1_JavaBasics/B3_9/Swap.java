package Lab1_JavaBasics.B3_9;

public class Swap {

    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        
        for (int i = 0; i < array1.length; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }
        
        return true;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        
        System.out.println("Before swap:");
        System.out.print("array1: ");
        for (int num : array1) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("array2: ");
        for (int num : array2) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        boolean result = swap(array1, array2);
        System.out.println("Swap successful: " + result);
        
        System.out.println("After swap:");
        System.out.print("array1: ");
        for (int num : array1) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("array2: ");
        for (int num : array2) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        int[] array3 = {1, 2, 3};
        int[] array4 = {4, 5, 6, 7};
        result = swap(array3, array4);
        System.out.println("Swap arrays of different lengths successful: " + result);
    }
}
