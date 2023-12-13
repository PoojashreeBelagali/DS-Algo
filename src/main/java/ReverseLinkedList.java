import javax.sound.midi.Soundbank;

public class ReverseLinkedList {
   //private Node head;

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next= new Node(0);


      /* while (node!=null){
           System.out.print(node.value+"->");
           node=node.next;
       }*/
       
       reverseLinkedList(node);
    }


    private static void reverseLinkedList(Node head) {

        Node prev= null;  //1

        Node curr=head; //
        prev.next=null; //1->null


        while(curr!=null){

            Node temp= curr.next; //3 == null
            curr.next=prev;
            prev=curr; //2->1 , 3->2
          ;// 2 -> 3
            curr=temp; //3

        }
        head=prev;

        Node temp= head;
        while (temp.next!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }

    }




    private static class Node{

        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
            this.next=null;
        }

        public Node(int value, Node node){
            this.value=value;
            this.next=node;
        }


    }

    public void re(Node head){
        //5>4->3>2

        Node prev= null;
        Node cur = head;
        prev.next = null;
        while (cur!=null){
            Node temp = cur.next; //5

            cur.next=prev; // 5->null
            prev=cur; //4
            cur=temp;//


        }
        head=prev;



    }
}
