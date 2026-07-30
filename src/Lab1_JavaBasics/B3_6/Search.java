package Lab1_JavaBasics.B3_6;

public class Search {

    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int key = 3;
        int index = search(array, key);
        System.out.println("Index of " + key + ": " + index);
        
        key = 6;
        index = search(array, key);
        System.out.println("Index of " + key + ": " + index);
    }
}
