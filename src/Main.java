import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("hello", "hello", "have", "good", "bad", "bad", "day", "boy", "boy"));
        task1(nums);
        task2(nums);
        task3(words);
        task03(words);
        task4(words);
    }

    private static void task1(List<Integer> nums) {
        System.out.println("Задание 1");
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }
        System.out.println();
    }

    private static void task2(List<Integer> nums) {
        System.out.println("Задание 2");
        Set<Integer> set = new TreeSet<>(nums);
        for (Integer num : set) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        System.out.println();
    }

    private static void task3(List<String> words) {
        System.out.println("Задание 3");
        Map<String, Integer> map = new HashMap();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
        System.out.println();
    }

    private static void task03(List<String> words) {
        System.out.println("Задание 03");
        Map<String, Integer> map = new HashMap();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
        System.out.println();
    }

    private static void task4(List<String> words) {
        System.out.println("Задание 4");
        Map<String, Integer> map = new HashMap();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        System.out.println(map);
    }
}