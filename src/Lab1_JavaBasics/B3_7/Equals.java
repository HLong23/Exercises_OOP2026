package Lab1_JavaBasics.B3_7;

public class Equals {

    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 4, 6};
        
        System.out.println("array1 equals array2: " + equals(array1, array2));
        System.out.println("array1 equals array3: " + equals(array1, array3));
    }
}
