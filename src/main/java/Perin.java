import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Perin {

    public static void main(String[] args) {
        Integer[] a={3,0,2};
        List<Integer> b=  new ArrayList<>(Arrays.asList(a));
        int n=7;
        for(int i=3;i<n;i++){
            Integer c = Math.addExact(b.get(i-2),b.get(i-3));
            b.add(c);

        }
        System.out.println(b.get(6));


    }





}
