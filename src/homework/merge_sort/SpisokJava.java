package src.homework.merge_sort;

import java.util.*;

public class SpisokJava {
    private static List<String> noDuplicateList(List<String> stringList) {
        Set<String> set = new HashSet<>(stringList);
        List<String> noDuplicateList = new ArrayList<>(set);
        return noDuplicateList;
    }

    private static List<Integer> oddList(List<Integer> integerList) {
        List<Integer> newIntegerList = new ArrayList<>();
        for (Integer value : integerList) {
            if (value % 2 != 0) {
                newIntegerList.add(value);
            }
        }
        return newIntegerList;
    }

    private static List<Integer> stringListElementCounter(List<String> stringList) {
        List<Integer> lengthList = new ArrayList<>();
        for (String string : stringList) {
            lengthList.add(string.length());
        }
        return lengthList;
    }

    private static List<Integer> listMultiplier(List<Integer> integerList) {
        for (int i = 0; i < integerList.size(); i++) {
            integerList.set(i, integerList.get(i) * 2);
        }
        return integerList;
    }
    public static void main(String[] args) {
        List<Integer> intOneList = Arrays.asList(5, 10, 2, 3, 4);
        System.out.println(listMultiplier(intOneList));

        List<Integer> intTwoList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(oddList(intTwoList));


        List<String> strOneList = Arrays.asList("my name", "abc", "wonka", "abc");
        System.out.println(stringListElementCounter(strOneList));
        System.out.println(noDuplicateList(strOneList));

    }
}
