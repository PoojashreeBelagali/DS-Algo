public class InorderTraversal {


    private static class Node{
        private int data;
        private Node left;
        private Node right;
        public Node(int value){
           this.data=value;
           this.left=this.right=null;
        }
    }

     public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right= new Node(3);
        root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.right = new Node(7);
         root.right.left = new Node(6);

         printInOrder(root);

     }

    private static void printInOrder(Node node) {
        if(node==null){
            return;
        }

        printInOrder(node.left);
        System.out.print(node.data+" ");
        printInOrder(node.right);
    }
}