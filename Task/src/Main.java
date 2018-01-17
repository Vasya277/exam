import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        final InputReader reader = new InputReader();
        final List<String> list = reader.getLinesList();

        List<List<Integer>> lists = Converter.getNumberListFrom(list);

        for (List<Integer> integerList : lists) {
            if ((Util.notInIncreaseOrder(integerList)))
                System.out.println(integerList);
        }
    }
}