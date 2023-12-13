import java.util.Arrays;
import java.util.Collections;

public class NextPermu {
    public static void main(String[] args) {
       // int[] p={6,7,4,8,6,5,3,2};
        int[] p={4,5,2,6,7,3,1};

        int firstDecresing=-1;
        for(int i=p.length-2; i>=0;i--){
            if(p[i]<p[i+1]){
                firstDecresing=i;
                break;
            }
        }
        System.out.println(firstDecresing);
        if(firstDecresing!=-1){
            int temp=-1;
            for(int i=firstDecresing+1;i<p.length;i++){
                if(p[i]>p[firstDecresing]){
                    temp=  temp!=-1 && p[temp]<p[i]?temp:i;
                    //temp=i;
                } else{
                    break;
                }


            }
            System.out.println(temp);
            int current=p[temp];
            p[temp]=p[firstDecresing];
            p[firstDecresing]=current;
            for(int i=temp;i<p.length;i++){

            }
        }
       // Collections.reverse(Arrays.asList(x));


        System.out.println(Arrays.toString(p));
    }
}
