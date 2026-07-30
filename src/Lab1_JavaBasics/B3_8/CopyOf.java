package Lab1_JavaBasics.B3_8;

public class CopyOf {

    public static int[] copyOf(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static int[] copyOf(int[] array, int newLength) {
        int[] newArray = new int[newLength];
        int length = Math.min(array.length, newLength);
        
        for (int i = 0; i < length; i++) {
            newArray[i] = array[i];
        }
        
        // Remaining elements are already 0 by default
        
        return newArray;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        
        int[] copy1 = copyOf(original);
        System.out.print("Copy of original: ");
        for (int num : copy1) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        int[] copy2 = copyOf(original, 3);
        System.out.print("Copy with length 3: ");
        for (int num : copy2) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        int[] copy3 = copyOf(original, 7);
        System.out.print("Copy with length 7: ");
        for (int num : copy3) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
