import java.util.Stack;

public class BalancedString {

    public static void main(String[] args) {
       /* from Rakesh Tirumala to everyone:    12:37 PM
        String - “[()]{}{[()()]()}” 
        Output: Balanced

        String -“[(])” 
        Output: Not Balanced */

        String a =  "[()]{}{[()()]()";
        Stack<Character> stack = new Stack<>();
        int n = a.length();
        int i=0;
        while (i<n){
            if(a.charAt(i)=='{' || a.charAt(i)=='(' ||a.charAt(i)=='[' ){
                stack.push(a.charAt(i));
            } else {
                if((stack.peek()=='(' && a.charAt(i)==')') || (stack.peek()=='{' && a.charAt(i)=='}')
            || (stack.peek()=='[' && a.charAt(i)==']')) {
                    stack.pop();
                }
            }

        i++;
        }
        if(stack.empty()){
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }



    }
}
