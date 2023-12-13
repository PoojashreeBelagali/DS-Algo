package Games;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[] a =  new char[9];
        int[][] ref = {{0,1,2}, {3,4,5},{6,7,8}, {0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
        for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }

        boolean isGameOver = false;
        int count =0;
        while(!isGameOver && count<=8) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the 0 position");

            int index = scan.nextInt();
            if(a[index]=='X'){
                System.out.println("Please enter valid number");
                index = scan.nextInt();
            }
            a[index] = 'O';

            ++count;
            System.out.println("Enter the X position");

             index = scan.nextInt();


            if(a[index]=='O'){
                System.out.println("Please enter valid number");
                index = scan.nextInt();
            }
            a[index] = 'X';

            ++count;
            if(count>4 && checkGameOver(a, ref)){
                int j=0;
                for(int i=0;i<a.length;i++){
                    j++;
                    if(j==2){
                        System.out.println();
                        j=0;
                    }
                    System.out.print(a[i]+" ");
                }
                isGameOver=true;

            }

        }
        if(!isGameOver){
            System.out.println("Game is a tie");
        }

    }

    private static boolean checkGameOver(char[] a, int[][] ref) {

        List<int[]> list = Arrays.asList(ref);
        for(int[] d :list){
            int first = d[0];
            int second = d[1];
            int third = d[2];
            if(a[first]==a[second] && a[second]==a[third]){
                if(a[first]=='O'){
                    System.out.println("O won");
                } else {
                    System.out.println("X won");
                }
                return true;
            }
        }

        return false;

    }
}
