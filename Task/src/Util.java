import java.util.List;

public class Util {

    public static final String LINE = "========================================";

    public static boolean notInIncreaseOrder(final List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            Integer prev = list.get(i);
            Integer next = list.get(i + 1);
            if (prev > next)
                return true;
        }
        return false;
    }

}
