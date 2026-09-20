import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



public class InterviewJava8 {
    public static void main(String arg[]){

        Service service = new Service();

        System.out.println("Second Highest Salary: "+service.secondHigestSalary());

        System.out.println("Hello");

        // Interface created NewInterf using lambda expression implement

        NewInterf aded = (a, b) -> a + b;

        System.out.println(aded.add(10,20));

        // fins Second Higest salary using java 8



        //input WELCOME output WE@LC@OM@E

        String str = "WELCOME";

        String outpu = IntStream.range(0, str.length())
                .mapToObj( i ->{
                     if(i == 2 || i == 6 || i ==4){
                         return  "@" + str.charAt(i);
                     }

                     return  String.valueOf(str.charAt(i));
                })
                .collect(Collectors.joining());

        System.out.println(outpu);

        //  find non repeting charector first using java 8

        String str1 = "avdhut";

       // Map<String, Integer> map = str1.toCharArray()





    }


}
