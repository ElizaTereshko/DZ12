import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        for (int a: list) {
            System.out.print(a + " ");
        }
        System.out.println();

        long count = list.stream()
                .filter(value -> value %2 == 0)
                .count();
        System.out.println(count);

        List<Integer> list1 = list.stream()
                .sorted()
                .collect(Collectors.toList());
        for (int a: list1){
            System.out.print(a + " ");
        }
        System.out.println();

        List<Integer> list2 = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        for (int a: list2){
            System.out.print(a + " ");
        }
        System.out.println();

        Optional<Integer> minim =  list.stream()
                .min(Integer::compareTo);
        minim.ifPresent(System.out::println);

        Optional<Integer> maxim = list.stream()
                .max(Integer::compareTo);
        maxim.ifPresent(System.out::println);

        List<Integer> list3 = list.stream()
                .filter(value -> value > 20)
                .sorted()
                .collect(Collectors.toList());
        for (int a : list3) {
            System.out.print(a*10 + " ");
        }
        System.out.println();

        Optional <Integer> maximum = list.stream()
                .skip(5)
                .limit(10)
                .distinct()
                .max(Integer::compareTo);
        maximum.ifPresent(System.out::println);

        List<Integer> list4 = list.stream()
                .skip(5)
                .limit(10)
                .map(x -> x*10)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        for (int a : list4) {
            System.out.print((a + 5) + " ");
        }
    }
}
