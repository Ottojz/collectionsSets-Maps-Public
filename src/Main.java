import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 12, 10, 8, 12, 18));
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        System.out.println("List nums = " + nums);
        System.out.println();
//Task 1
        System.out.println("Task 1");
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.print(nums.get(i) + ", ");
            }
        }
        System.out.println();

//Task 2
        System.out.println();
        System.out.println("Task 2");
        Set<Integer> nums2 = new TreeSet<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                nums2.add(nums.get(i));
            }
        }
        System.out.println(nums2);

//Task 3
        System.out.println();
        System.out.println("Task 3");
        Set<String> strings2 = new HashSet<>(List.of("один", "два", "три", "четыре", "четыре", "три", "два"));
        System.out.println(strings2);

//Task 4
        System.out.println();
        System.out.println("Task 4");
        Set<String> uniqueWords = new HashSet<>(strings);
        System.out.println(uniqueWords);
        Map<String, Integer> uniqueWordsCount = new HashMap<>();
        for (int i = 0; i < strings.size(); i++) {
            uniqueWordsCount.put(strings.get(i), 0);
        }
        for (int i = 0; i < strings.size(); i++) {
            if (uniqueWords.contains(strings.get(i))) {
                uniqueWordsCount.put(strings.get(i), uniqueWordsCount.get(strings.get(i)) + 1);
            }
        }
        System.out.println(uniqueWordsCount.toString());
    }
}