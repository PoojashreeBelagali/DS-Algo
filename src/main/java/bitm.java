public class bitm {
    public static void main(String[] args) {
        int a=4;
        //a=a<<1;
       /* System.out.println(a>>1);
        System.out.println(a>>2);
        System.out.println(a<<3);
        System.out.println(a<<4);

        System.out.println(1^1);*/
        int n= 01000001;
        int count=0;
        while(n>0){
            //System.out.println(n&1);
         /* n&=(n-1);
          count++;
*/

            count+=n&1;

        }
        System.out.println("cp "+count);


    }
}
