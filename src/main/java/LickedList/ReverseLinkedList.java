package LickedList;

public class ReverseLinkedList {

    public LinkedList.Node reverse(LinkedList.Node head){


        LinkedList.Node prev = null;
        LinkedList.Node cur = head;
        while(cur!=null){
            LinkedList.Node temp = cur.next;
            cur.next = prev;
            prev= cur;
            cur = temp;
        }


 return prev;


    }
}
