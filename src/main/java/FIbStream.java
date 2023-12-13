import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FIbStream {
    public static void main(String[] args) {
        List<Integer> list =
                Stream.iterate(new int[]{0,1},  f-> new int[]{f[1], f[0]+f[1]})
                                .   limit (2)
                                        .map(n->n[0])
                                                .collect(Collectors.toList());
        System.out.println(list);
    }
}
