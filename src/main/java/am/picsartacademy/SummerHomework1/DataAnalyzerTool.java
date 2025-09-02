package am.picsartacademy.SummerHomework1;

import java.util.*;

class GenericAnalyzer<T extends Number & Comparable<T>> {
    private List<T> numbers;

    public GenericAnalyzer(T... nums) {
        numbers = new ArrayList<>(Arrays.asList(nums));
    }

    public int countEven() {
        int count = 0;
        for (T num : numbers) {
            if (num.intValue() % 2 == 0) count++;
        }
        return count;
    }

    public int countOdd() {
        int count = 0;
        for (T num : numbers) {
            if (num.intValue() % 2 != 0) count++;
        }
        return count;
    }

    public int countDivisibleBy3() {
        int count = 0;
        for (T num : numbers) {
            if (num.intValue() % 3 == 0) count++;
        }
        return count;
    }

    public List<T> sortAscending() {
        List<T> sorted = new ArrayList<>(numbers);
        Collections.sort(sorted);
        return sorted;
    }

    public List<T> sortDescending() {
        List<T> sorted = new ArrayList<>(numbers);
        sorted.sort(Comparator.reverseOrder());
        return sorted;
    }
}

public class DataAnalyzerTool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Մուտքագրեք թվերը (բաժանված բացատով):");
        String[] input = sc.nextLine().split(" ");

        Integer[] nums = new Integer[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        GenericAnalyzer<Integer> analyzer = new GenericAnalyzer<>(nums);

        System.out.println("Զույգերի քանակը: " + analyzer.countEven());
        System.out.println("Կենտերի քանակը: " + analyzer.countOdd());
        System.out.println("Բաժանվում է 3-ի: " + analyzer.countDivisibleBy3());
        System.out.println("Աճման կարգով: " + analyzer.sortAscending());
        System.out.println("Նվազման կարգով: " + analyzer.sortDescending());
    }
}

