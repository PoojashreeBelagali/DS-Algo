import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectTe {

    /*
            Sprint velocity problem You have list of Projects

and the efforts for each projects as
P[i].You have total no of sprintS by
 which you have to complete these projects.
 In a sprint, you don’t work on
 multiple projects.
 If you have completed one project, you can
 wait till the next sprint to start the next project.
 Find the lowest sprint velocity(integer value of effort per sprint ),
 that you can put for these projects to complete all of them on time.

Project efforts P[i]=[3, 6, 7, 11] = 27/8 = 3-4
Total no of sprint S= 8

/     /Total effort TotaL sum(p) = 27
            total of number i can effort I can take = 27/8 , minumum  velocity = 4  3.4 =4,

         1-    p[0] = 3
         2 & 3 - p[1] - 3,3 (4,2)
         4 & 5 - p[2] - 4, 3
         6, 7,,8 -  3,3,4
     */


    public static void main(String[] args) {

        int[] p = {3, 6, 7, 11};
        int sprint = 8;
        int sum = 0;

        for (int i = 0; i < p.length; i++) {
            sum += p[i];
        }


        int minVelocity = (sum / sprint);

        int min = 0;
        while (min != sprint) {


            for (int i = 0; i < p.length; i++) {

                if (p[i] <= minVelocity) {
                    min++;
                } else {
                    int k = p[i];
                    while (k > 0) {
                        k = k - minVelocity;
                        min++;
                    }

                }

            }

            if (min > sprint) {
                minVelocity++;
                min = 0;
            }
            if (min == sprint)
                break;
        }



        System.out.println(minVelocity);
}


}
