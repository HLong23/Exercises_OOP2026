package Lab9_.B2;

import java.util.*;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>();

        for (Integer value : first) {
            if (second.contains(value)) {
                result.add(value);
            }
        }

        return result;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>();

        for (Integer value : first) {
            result.add(value);
        }

        for (Integer value : second) {
            result.add(value);
        }

        return result;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>(first);
        result.retainAll(second);
        return result;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>(first);
        result.addAll(second);
        return result;
    }

    public static List<Integer> toList(Set<Integer> source) {
        return new ArrayList<>(source);
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        return new ArrayList<>(new HashSet<>(source));
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        List<Integer> result = new ArrayList<>();

        for (Integer value : source) {
            if (!result.contains(value)) {
                result.add(value);
            }
        }

        return result;
    }

    public static String firstRecurringCharacter(String s) {
        Set<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                return String.valueOf(c);
            }
            set.add(c);
        }

        return "";
    }

    public static Set<Character> allRecurringChars(String s) {
        Set<Character> visited = new HashSet<>();
        Set<Character> result = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (visited.contains(c)) {
                result.add(c);
            } else {
                visited.add(c);
            }
        }

        return result;
    }

    public static Integer[] toArray(Set<Integer> source) {
        return source.toArray(new Integer[0]);
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.higher(value);
    }
}
