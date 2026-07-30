package Lab1_JavaBasics.B3_5;

public class Contains {

    public static boolean contains(int[] array, int key) {
        for (int element : array) {
            if (element == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int key = 3;
        System.out.println("Contains " + key + ": " + contains(array, key));
        
        key = 6;
        System.out.println("Contains " + key + ": " + contains(array, key));
    }
}
