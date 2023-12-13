public class WaterInContainer {
    public static void main(String[] args) {
        int[] a={1,8,6,2,5,4,8,3,7};

        int i=0, j=a.length-1, res=0;

                while(i<j){

                    res = Math.max(res, Math.min(a[i], a[j])*(j-i));

                    if(a[i]>a[j]){
                        j--;
                    }else if(a[j]>a[i]){
                        i++;
                    }else {
                        i++;
                        j--;
                    }
                }

        System.out.println(res);
    }
}
