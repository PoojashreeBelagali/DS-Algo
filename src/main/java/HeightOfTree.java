public class HeightOfTree {
    private Node root;
    public static void main(String[] args) {
        Node node= new Node(1);
        node.left=new Node(2);
        node.right=new Node(3);
        node.left.left=new Node(4);
        node.left.right=new Node(5);
        node.left.left.left=new Node(6);
        node.left.left.right=new Node(7);
       System.out.println(heightOfTree(node));
    }

    private static int heightOfTree(Node node) {

        if(node==null){
            return -1;
        } else {
            int lheight = heightOfTree(node.left);
            int rheight = heightOfTree(node.right);

            if (lheight > rheight) {
                return lheight+1;
            }else{
                return rheight+1;
            }
        }

    }

    private static class Node{
        private int value;
        private Node left;
        private Node right;
        public Node(int value){
            this.value=value;
            this.left=null;
            this.right=null;
        }

    }
}
