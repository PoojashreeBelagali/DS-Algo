

public class Test {

    /*
    Write a function, add, which adds two large numbers together and returns their sum:
// Returns sum of two numbers
    String add(String a, String b)
     */

    public static void main(String[] args) {


        System.out.println(calculateSum("2222222222222222222222222222222222","444422222222222222222222222222222222"));

        System.out.println(calculateSum("1,111,111","2,222,222,222"));
        System.out.println(calculateSum("99","1"));
        System.out.println(calculateSum("1",""));
        System.out.println(calculateSum("",""));
        System.out.println(calculateSum(null,""));
    }
    public static String calculateSum(String a, String b) {


        if (null == a || null==b){
            return null;
        }
            int carry = 0;
            boolean containsComma = a.contains(",");
            a=a.replace(",","");
            b=b.replace(",","");
            int i = a.length() - 1;
            int j = b.length() - 1;
            StringBuilder st = new StringBuilder();
            while (i >= 0 || j >= 0) {

                int m = 0;
                int n = 0;

                if (i >= 0) {

                    m = a.charAt(i) - '0';
                }

                if (j >= 0) {
                    n = b.charAt(j) - '0';
                }

                int sum = m + n + carry;
                carry = sum / 10;

                st.append(sum % 10);

                i--;
                j--;
            }
            if (carry != 0) {
                st.append(carry);
            }

            StringBuilder r = new StringBuilder();

            if(containsComma) {
                //append , for every 1000
                String comStr = st.reverse().toString();
                int k = comStr.length()-1;
                int count = 0;
                while (k >= 0) {
                    if (count == 3) {
                        r.append(",");
                        count=0;
                    }
                    r.append(comStr.charAt(k));
                    count++;
                    k--;
                }
            }else {
                return st.reverse().toString();
            }

            return r.reverse().toString();

    }


}
