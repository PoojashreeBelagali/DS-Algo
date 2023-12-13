package TwoPinter;

public class SumOfArrayElementsEqualsToK {
    public static void main(String[] args) {
       /* int[] a = {-3,0,1,3,1,6,7,17,0,12,16,14,18,25};

        int k=17;*/
        int[] a = {1,3,4,4,5,5,5,5,6,6,7,10};

        int k=10;


        /*
            Here we have 2 pointers i & j
             i =0
             j = last index
             first make sum of i+j and check if its equals to K
             if not , check if it's less than K then increse i
             otherwise decrease J
             And in case of duplicate elements need to check for the pairs of x &  y and count = count(x) * count(y);
             and in case of duplicated and same elemetnst count x  = countC2;
         */

        int i=0;
        int j= a.length-1;
        int count=0;
        while(i<j){


            int value  = a[i]+a[j];
            int countX=0;
            int countY=0;

            if(value==k){



                   int p = i;
                   while (a[p] == a[i]) {
                       countX++;
                       p++;

                   }
                   int q = j;
                   while (a[q] == a[j] && p<j) {
                       countY++;
                       q--;

                   }

                   if(a[i]==a[j]) {
                       count += countX * (countX - 1) / 2;
                       i=p;
                       j=q;
                   }

               else if (countX != 0 || countY != 0) {
                       count += countX * countY;
                       countX = 0;
                       countY = 0;
                       i=p;
                       j=q;
                   }
               else {
                   count++;

               }


             //   i++;

                //j--;
            } else if(value>k){
                j--;
            }else {
                i++;
            }
        }
        System.out.println(count);
    }
}
