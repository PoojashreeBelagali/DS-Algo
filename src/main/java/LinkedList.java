public class LinkedList {


  public static void removeNthNode(Node head, int n)
  {
      Node node = head;
      int size = getSize(node);

      int i =  size-n+1;
      int j=1;

      Node prev=head;
       while(j<size-n){

            prev = prev.next;

           j++;
       }

      prev.next=prev.next.next;
      printLinkedList(head);

  }

    private static void printLinkedList(Node prev) {
        while (prev !=null){
            System.out.print(prev.n+"->");
            prev = prev.next;
        }
    }

    private static int getSize(Node node) {
        int size = 0;
        while(node !=null){
            size++;
            node = node.next;
        }
        return size;
    }

    static class Node{


        int n;
        Node next;

        public  Node(int n, Node next){
            this.n=n;
            this.next = next;
        }
        public Node(){

        }

        public Node(int n){
            this.n=n;
        }



    }

    public static void main(String[] args) {
        Node node = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node.next = node2;
                node2.next=node3;
                node3.next=node4;



        removeNthNode(node, 3);

    }



}
