package Lab1_JavaBasics.B3_10;

public class Reverse {

    public static void reverse(int[] array) {
        for (int fIdx = 0, bIdx = array.length - 1; fIdx < bIdx; ++fIdx, --bIdx) {
            int temp = array[fIdx];
            array[fIdx] = array[bIdx];
            array[bIdx] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        
        System.out.print("Original array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        reverse(array);
        
        System.out.print("Reversed array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
