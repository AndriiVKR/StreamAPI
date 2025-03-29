import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(1);
//            }
//        }).start();

//        Director director = new Director();
//        Worker worker = (n) -> {
//            for (int i = 0; i < n; i++) {
//                System.out.println("Working ...");
//            }
//            return "Success";
//        };
//
//        String result = director.force(worker, 5);
//        System.out.println(result);

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add((int)(Math.random() * 1000));
        }
//        List<Integer> filtered = filter(numbers, (n) -> n % 2 == 0);
//        List<String> mapped = map(filtered);
        List<String> list = numbers.stream()
                .filter((n) -> n % 2 == 0)
                .map((integer -> "Number: " + integer))
                .filter((string) -> string.endsWith("0"))
                .map((string) -> string + "!")
                .collect(Collectors.toList());

        for (String s : list) {
            System.out.println(s);
        }

//        for (String i : mapped) {
//            System.out.println(i);
//        }
    }

    private static List<String> map(List<Integer> numbers) {
        List<String> result = new ArrayList<>();
        for (int number : numbers) {
            result.add("Number " + number);
        }
        return result;
    }

    private static List<Integer> filter(List<Integer> list, Predicate predicate) {
        List<Integer> result = new ArrayList<>();
        for (int i : list) {
            if (predicate.test(i)) {
                result.add(i);
            }
        }
        return result;
    }
}
