import java.util.HashMap;
import java.util.Map;

public class SUbArray0And1 {

    public static void main(String[] args) {
        int[] a ={1,1,0,1,0,1,0,1,0,1,0,1,1};
        System.out.println(findMaxLength(a));
    }

    public static int findMaxLength1(int[] nums) {
        int maxlen = 0;
        for (int i = 0; i < nums.length; i++) {
            int zeroes = 0, ones = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == 0) {
                    zeroes++;
                } else {
                    ones++;
                }
                if (zeroes == ones) {
                    maxlen = Math.max(maxlen, j - i + 1);
                }
            }
        }
        return maxlen;
    }

    public static int findMaxLength(int[] nums) {
        Map< Integer, Integer > map = new HashMap<>();
        map.put(0, -1);
        int maxlen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {

            
            count = count + (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(count)) {
                maxlen = Math.max(maxlen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxlen;
    }
}
