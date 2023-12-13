public class
BST {


    public static void main(String[] args){

        Node node = new Node(2);
        node.left= new Node(1);
        node.right=new Node(0);

        Boolean isValid=true;

         checkBST( node);
        //System.out.println(isValid);
    }

    public static void checkBST(Node node){

        if(node.left==null && node.right==null){
            System.out.println("valid");
            return ;
        }

        if(node.left!=null && node.right!=null) {

            if (node.left.value < node.value && node.right.value > node.value) {

                //node = node.left;
                checkBST(node.left);
                checkBST(node.right);
            } else {
                System.out.println("invalid");
            }




        }

    }

         private static class Node{



            private int value;
            private Node left;
            private Node right;

            public Node(int value) {
                this.value = value;
                this.left=null;
                this.right=null;
            }


        }
    }
