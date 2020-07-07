package JavaCollections.OptionalTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class rearrangeNegativePositive {
    public static List<Integer> createRandomList(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 15; i++) {
            int number =random.nextInt(num*2)-num;
            list.add(number);
        }
        return list;
    }
    public static void main(String[] args) {
        List<Integer> list = createRandomList(50);
        System.out.println("Созданный список:\n"+list);
        List<Integer> result = list.stream().sorted((o1, o2) -> o2).collect(Collectors.toList());
        System.out.println("Отсортированный список с положительными элементами в начале и отрицательными в конце:\n"+result);
    }
}
