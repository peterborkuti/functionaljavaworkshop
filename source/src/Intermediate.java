import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Intermediate {
    public static void intermediateOperators() {
        //Stateless
        IntStream.range(0,100).filter(i -> i % 2 == 0);

        (new java.util.Random()).doubles().map(d -> Math.round(d * 5) + 10);

        Stream.of("First line of paragraph", "Second line of paragraph").flatMap(l -> Arrays.stream(l.split(" ")));

        //stateful
        IntStream.of(1, 5, 3).sorted();

        IntStream.of(1, 5, 5, 3, 3, 1).distinct();

        IntStream.of(1,2,3,4,5).limit(3);
    }
}
