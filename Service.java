import java.util.Comparator;
import java.util.List;

public class Service {


    public int secondHigestSalary()

    {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 8, 454, 3, 4, 5);

        Integer list2 = list1.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow();

        return list2;

    }



}
