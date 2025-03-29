import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SomeTask {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            numbers.add((int)(Math.random() * 100 + 100));
        }

        List<String> result = numbers.stream()
                .filter((integer) -> integer % 2 == 0 && integer % 5 == 0)
//                .map(integer -> Math.sqrt(integer))
              .map(Math::sqrt)
//                .map((sqrt) -> "Sqrt: " + sqrt)
               .map(SomeTask::mapToString)
                .collect(Collectors.toList());

        for (String s : result) {
            System.out.println(s);
        }
    }
    private static String mapToString(double a) {
        return "Sqrt: " + a;
    }
}
