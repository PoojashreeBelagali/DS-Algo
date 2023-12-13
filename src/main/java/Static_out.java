import java.util.Arrays;
import java.util.List;

public class Static_out {
    static int x;
    static int y;
    void add(int a, int b){
        x=a+b;
        y=x+b;
    }

    public static void main(String[] args) {
        Static_out obj1 = new Static_out();
        Static_out obj2 = new Static_out();
        int a =2;
        obj1.add(a, a+1);
      //  obj2.add(5, a);
        System.out.println(obj1.x+" "+obj2.y);
        obj2.add(5, a);
        System.out.println(obj1.x+" "+obj2.y);

        List<String> list = Arrays.asList("Hello ",
                "G", "E", "E", "K", "S!");

        // using parallelStream()
        // method for parallel stream
        list.stream().parallel().forEach(System.out::print);
        System.out.println();
        list.parallelStream().forEach(System.out::print);
        System.out.println();
        list.stream().forEach(System.out::print);
        Math.random();
    }
}
