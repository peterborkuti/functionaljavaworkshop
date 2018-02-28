import java.io.*;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo {
    public static void sort1() {
        List<String> names = Arrays.asList("liza", "Joe", "Dean");
        //stream: A sequence of elements supporting sequential and parallel aggregate operations.
        names.stream().sorted().forEach(System.out::println);
        //source, intermediate operations, terminal operation
    }

    public static void sort2() {
        List<Integer> numbers = Arrays.asList(5, 1, 3);
        numbers.stream().sorted().forEach(System.out::println);
        //numbers is not sorted. no side effect (no mutation of outer world)
        numbers.stream().forEach(System.out::println);
    }

    public static List<Integer> sort3(List<Integer> input) {
        //no side effect (no mutation of outer world)
        return input.stream().sorted().collect(Collectors.toList());
    }

    public static void sources() {
        Arrays.stream(new Integer[]{1, 2, 3});
        List<Integer> l = Arrays.asList(1, 2, 3); l.stream(); //Collections.stream()
        try {
            InputStream fileStream = new FileInputStream("text1.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            InputStream webStream = new URL("file::text1.txt").openStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader in = new BufferedReader(new FileReader("text1.text"));
            in.lines();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Stream.of("A", "B", "C");
        IntStream.of(1, 2, 3);
        IntStream.range(0, 10);
        Stream.concat(Stream.of("A", "B"), Stream.of(1,2));
        Random r = new Random();
        r.ints(); // doubles, longs
        Stream.iterate(0, i -> 2 * i);
        IntStream.rangeClosed(0, 10).parallel();
    }

    public static void grouping() {
        List<Integer> list = Arrays.asList(1,1,1,2,2,2,2,3,3,3,2,2,1);

        Map<Integer, Long> map =
        list.stream().collect(Collectors.groupingBy(i->i, Collectors.counting()));

        map.forEach((k,v)->System.out.println(k + ":" + v));

        list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k,v)->System.out.println(k + ":" + v));

        list.stream().collect(Collectors.groupingBy(i -> i % 2 == 0, Collectors.counting()))
                .forEach((k,v)->System.out.println(k + ":" + v));

    }
}
