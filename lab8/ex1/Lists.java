package lab8.ex1;

import java.util.*;

public class Lists {
    public static void insertFirst(ArrayList<Integer> list, int value) {
        list.add(0, value);
    }

    public static void insertLast(ArrayList<Integer> list, int value) {
        list.add(list.size() - 1, value);
    }

    public static void replace(ArrayList<Integer> list, int value) {
        list.set(3, value);
    }

    public static void removeThird(ArrayList<Integer> list) {
        list.remove(3);
    }

    public static void removeEvil(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 666) {
                list.remove(list.get(i));
            }
        }
    }

    public static ArrayList<Integer> gennerateSquare() {
        ArrayList<Integer> list1 = new ArrayList<>();
        int i = 1;
        while (list1.size() < 10) {
            list1.add(i * i);
            i++;
        }
        return list1;
    }

    public static boolean contains(ArrayList<Integer> list, int value) {
        return list.contains(value);
    }

    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
        for (int i = 0; i < target.size(); i++) {
            target.set(i, source.get(i));
        }
    }

    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);

    }

    public static void reverseManual(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int j = list.size() - 1;
            list.add(i, list.remove(j));
            j--;
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }
}