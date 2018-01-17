import java.util.ArrayList;
import java.util.List;

public class Converter {
    public static List<List<Integer>> getNumberListFrom(List<String> list) {
        List<List<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String [] arr = list.get(i).split(",");
            List<Integer> numbers = new ArrayList<>();
            for (String s : arr) {
                Integer val = Integer.parseInt(s.trim());
                numbers.add(val);
            }
            lists.add(numbers);
        }
        return lists;
    }
}
