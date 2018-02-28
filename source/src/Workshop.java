import java.util.*;
import java.util.stream.*;
import java.util.concurrent.*;

public class Workshop {
    public static String intArrayJoin(int[] arr) {
        return Arrays.stream(arr).
                boxed().
                map(Object::toString).
                collect(Collectors.joining(","));
    }

    public static long intArraySum1(int[] arr) {
        return Arrays.stream(arr).boxed().collect(Collectors.summingInt(i->i));
    }

    public static List<Integer> stringToList(String s) {
        return Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
    }

    public static String compareTheTriplets(String[] lines) {
        List<Integer> a = stringToList(lines[0]);
        List<Integer> b = stringToList(lines[1]);
        int[] points = {0,0};

        IntStream.range(0, a.size()).
                forEach(
                        i -> {
                            if (a.get(i) > b.get(i)) {
                                points[0]++;

                            }
                            else {
                                points[1] += Math.signum(b.get(i)-a.get(i));

                            }
                        }
                );

        return Arrays.stream(points).boxed().map(Object::toString).collect(Collectors.joining(","));
    }

    public static List<Integer> doubleTheElements(int [] arr) {
        return IntStream.of(arr).flatMap(i -> IntStream.of(i, i)).boxed().collect(Collectors.toList());
    }

    public static String[] initializeStringArray(String s, String splitter) {
        String[] arr = Stream.of(s.split(splitter), new String[]{"","",""}).flatMap(Stream::of)
                .toArray(String[]::new);

        return arr;
    }

    public static String sortGrid(String[] grid) {
        return Arrays.stream(String.join("", grid).split("")).sorted().collect(Collectors.joining());
    }

    public static String[] stringToGrid(String string, int length) {
        //\G: start at the end of the previous match
        //?<=: via zero-width positive lookbehind
        //.{n}:exactly n characters
        return string.split(String.format("(?<=\\G.{%1$d})", length));
    }

    public static String stringSort(String s) {
        return Arrays.stream(s.split("")).sorted().reduce("", (x,y) -> x + y);

    }

    public static String[] sortRows(String[] grid) {
        return Arrays.stream(grid).map(Workshop::stringSort).toArray(String[]::new);
    }

    public static long intArraySum2(int[] arr) {
        return Arrays.stream(arr).mapToLong(Long::new).sum();
    }

    public static String countConsecutiveZeroesAndOnes(String input) {
        return Arrays.stream(input.replace("01", "0,1").replace("10", "1,0").split(",")).
                map(s -> s.length()).map(i -> i.toString()).collect(Collectors.joining(","));
    }

    /**
     * Find the first even number's double which is greater the 3
     */
    public static int findTheFirst(List<Integer> l) {
        return l.stream().filter(i -> i > 3 && i % 2 == 0).limit(1).findFirst().map( i -> 2 * i).get();
    }

    public static String findTheFirstInRandStream() {
        return
        (new Random().ints()).filter(i -> i > 3 && i % 2 == 0).limit(1).mapToObj(i -> new Long(i)).map(l -> 2l * l).
                map(l -> l.toString()).findFirst().orElseGet(() -> {return "Not found";});
    }
    public static void findTheFirstInRandStream2() {
                 (new Random().ints()).limit(1)
                         .filter(i -> i > 3 && i % 2 == 0)
                         .limit(1)
                         .mapToLong(l -> 2l * l)
                         .mapToObj(l -> Long.toString(l))
                         .forEach(System.out::println);
    }
}
