package Trees;

public class Tree {


    public static void main(String[] args) {
        Node node = new Node(1);
        node.left= new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        System.out.println("In order");
        inOrderTraversal(node);
        System.out.println("Pre order");
        preOrderTarversal(node);
        System.out.println("post order");
        postOrderTraversal(node);
    }

    private static void postOrderTraversal(Node node) {
        if(node==null){
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.value+" ");
    }

    private static void preOrderTarversal(Node node) {
        if(node==null){
            return;
        }
        System.out.print(node.value+" ");
        preOrderTarversal(node.left);
        preOrderTarversal(node.right);
    }

    private static void inOrderTraversal(Node node) {

        if(node==null){
            return;
        }

        inOrderTraversal(node.left);
        System.out.print(node.value+" ");
        inOrderTraversal(node.right);
    }


    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int v){
            this.value=v;
            left=right=null;
        }
    }

}
