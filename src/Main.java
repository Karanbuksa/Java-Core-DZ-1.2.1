import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> intListModified = new LinkedList<>();


        for (Integer integer : intList) {
            if (integer > 0 && integer % 2 == 0) {
                intListModified.add(integer);
            }
        }

        IntegerComparator integerComparator = new IntegerComparator();
        intListModified.sort(integerComparator);
        System.out.println(intListModified);
    }
}

