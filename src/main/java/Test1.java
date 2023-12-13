import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {


       int[] a = {1,2,3,4,5,6};
        //output [[1,2],[3,4],[5,6]]';

        int n = a.length;
        int chunks = n/2;
        List<int[]> result = new ArrayList<>();


        int i=0;
        while(i<=chunks+1){
            int[] part = {a[i], a[i+1]};
            i+=2;
            result.add(part);
        }

        for(int[] b:result){
            Arrays.stream(b).forEach(System.out::print);
            System.out.println("----------------");
        }

        Stream<Integer>
                s = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // using Collectors partitioningBy()
        // method to split the stream of elements into
        // 2 parts, greater than 3 and less than 3.
        Map<Boolean, List<Integer> >
                map = s.collect(
                Collectors.partitioningBy(num -> num > 3));

        // Displaying the result as a map
        // true if greater than 3, false otherwise
        System.out.println("Elements in stream "
                + "partitioned by "
                + "less than equal to 3: \n"
                + map);



    }}