import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("John", 25));
        users.add(new User("Alex", 35));
        users.add(new User("Max", 28));
        users.add(new User("Jack", 35));
        users.add(new User("Nick", 42));
        users.add(new User("Alice", 15));
        users.add(new User("Helen", 64));

//        long count = users.stream()
//                .filter(user -> user.getAge() > 30)
//                .count();
//        System.out.println(count);

//        boolean result = users.stream()
//                .allMatch((user -> user.getAge() > 18));
//        System.out.println(result);

//        boolean res2 = users.stream()
//                .anyMatch((user -> user.getAge() > 18));
//        System.out.println(res2);

//        boolean res3 = users.stream()
//                .noneMatch(user -> user.getAge() <= 18);
//        System.out.println(res3);

//        List<User> res4 = users.stream()
//                .sorted((o1, o2) -> Integer.compare(o2.getAge(), o1.getAge()))
//                .limit(3)
//                .collect(Collectors.toList());
//        for (User user : res4) {
//            System.out.println(user);
//        }

//        users.stream()
//                .sorted((o1, o2) -> Integer.compare(o2.getAge(), o1.getAge()))
//                .limit(3)
////                .forEach(user -> System.out.println(user));
//                .forEach(System.out::println);

//        Optional<User> oldest = users.stream()
////                .filter(user -> user.getAge() < 5)
//                .max((Comparator.comparingInt(User::getAge)));
////        oldest.ifPresent(System.out::println);
//        oldest.ifPresentOrElse(System.out::println, () -> System.out.println("User not found"));

//        Optional<User> userWithL =
                /*
        users.stream()
                .filter(user -> user.getName().contains("l"))
                .findFirst()
                .ifPresentOrElse(System.out::println, () -> System.out.println("User not found"));
                */
//        userWithL.ifPresentOrElse(System.out::println, () -> System.out.println("Not user found"));



//        int[] array = {4, 3, 6, 8, 2, 9, 2, 1};
////        Arrays.stream(array)
////                .findFirst().ifPresentOrElse(System.out::println, () -> System.out.println("Not found"));
//
//        Stream.of(4, 3, 6, 8, 2, 9, 2, 1)
//                .findAny().ifPresentOrElse(System.out::println);



        List<Float> numbers = new ArrayList<>();
        for (int i = 0; i < 30_000_000; i++) {
            numbers.add((float)i);
        }
        long before = System.currentTimeMillis();
        numbers.parallelStream()
                .map((number) -> Math.sin(0.22f + number / 5) * Math.cos(0.2f + number / 5) * Math.cos(0.4f + number / 2))
                .collect(Collectors.toList());
        long after = System.currentTimeMillis();
        System.out.println(after - before);

    }
}
