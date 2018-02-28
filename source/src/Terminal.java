import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Terminal {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 4, 2);
        List<String> strings = Arrays.asList("A", "D", "C", "B");

        long count = numbers.stream().count();
        int sum1 = numbers.stream().mapToInt(i -> i.intValue()).sum();
        OptionalInt first1 = numbers.stream().mapToInt(i -> i.intValue()).findFirst();
        int first2 = numbers.stream().mapToInt(i -> i.intValue()).findFirst().getAsInt();
        int[] arr = numbers.stream().mapToInt(i -> i.intValue()).toArray();

        int sum2 = numbers.stream().reduce(0, (a, e) -> (a + e));
        long sum3 = numbers.stream().map(i -> i.longValue()).reduce(0l, (a, e) -> (a + e));

    }
}

