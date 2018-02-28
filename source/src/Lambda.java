import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Lambda {

    public static void iterate() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

    }



    public static void main(String[] args) {

        iterate();

    }



















/*
    public static void iterate1() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }

    public static void iterate2() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        for (int e : numbers) {
            System.out.println(e);
        }
    }

    public static void iterate3() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream().forEach(
                new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) {
                        System.out.println(integer);
                    }
                }
        );
    }

    public static void iterate4() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream().forEach(
                (Integer integer) -> {
                    System.out.println(integer);
                }

        );
    }


    public static void iterate5() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream().forEach(
                (Integer integer) ->
                        System.out.println(integer)
        );
    }

    public static void iterate6() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream().forEach(
                (integer) -> System.out.println(integer)
        );
    }

    public static void iterate7() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream().forEach(
                integer -> System.out.println(integer)
        );
    }

    public static void iterate8() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream().forEach(System.out::println);
    }
    */
}
