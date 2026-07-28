package Lab9_.B1;

import java.util.*;

public class Lists {
    public static void insertFirst(List<Integer> list, int value) {
        list.addFirst(value);
    }

    public static void insertLast(List<Integer> list, int value) {
        list.add(value);
    }

    public static void replace(List<Integer> list, int value) {
        if (list.size() >= 3) {
            list.set(2, value);
        }
    }

    public static void removeThird(List<Integer> list) {
        if (list.size() >= 3) {
            list.remove(2);
        }
    }

    public static void removeEvil(List<Integer> list) {
        list.remove(Integer.valueOf(666));
    }

    public static List<Integer> generateSquare() {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i * i);
        }

        return list;
    }

    public static boolean contains(List<Integer> list, int value) {
        return list.contains(value);
    }

    public static void copy(List<Integer> source, List<Integer> target) {
        target.clear();

        for (Integer value : source) {
            target.add(value);
        }
    }

    public static void reverse(List<Integer> list) {
        Collections.reverse(list);
    }

    public static void reverseManual(List<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            Integer temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }
}
