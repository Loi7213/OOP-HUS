package lab8.ex2;

import java.util.*;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersection = new HashSet<>();
        for (Integer element : first) {
            if (second.contains(element)) {
                intersection.add(element);
            }
        }
        return intersection;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> union = new HashSet<>(first);
        union.addAll(second);
        return union;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersection = new HashSet<>(first);
        intersection.retainAll(second);
        return intersection;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> union = new HashSet<>(first);
        union.addAll(second);
        return union;
    }

    public static List<Integer> toList(Set<Integer> source) {
        return new ArrayList<>(source);
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        Set<Integer> uniqueSet = new LinkedHashSet<>(source);
        return new ArrayList<>(uniqueSet);
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        for (Integer element : source) {
            if (!seen.contains(element)) {
                result.add(element);
                seen.add(element);
            }
        }
        return result;
    }

    public static String firstRecurringCharacter(String s) {
        Set<Character> seen = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (seen.contains(c)) {
                return String.valueOf(c);
            }
            seen.add(c);
        }
        return "";
    }

    public static Set<Character> allRecurringChars(String s) {
        Set<Character> recurringChars = new HashSet<>();
        Set<Character> seen = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (seen.contains(c)) {
                recurringChars.add(c);
            }
            seen.add(c);
        }
        return recurringChars;
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
        Integer greater = source.higher(value);
        if (greater != null) {
            return greater;
        }
        throw new NoSuchElementException();
    }
}