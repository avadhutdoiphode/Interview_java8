import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class InterviewJava8 {
    public static void main(String arg[]){
        System.out.println("Hello");

        // fins Second Higest salary using java 8

        List<Integer> list1 = List.of(1,2,3,4,5,6,8,454,3,4,5);

        Integer list2 = list1.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow();

        System.out.println("find second higest satay is: "+ list2);

        //input WELCOME output WE@LC@OM@E

        String str = "WELCOME";


        NewInterf aded = (a, b) -> a + b;

        System.out.println(aded.add(10,20));


    }


}
