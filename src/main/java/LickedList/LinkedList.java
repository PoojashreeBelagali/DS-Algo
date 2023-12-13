package LickedList;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

public class LinkedList {

    public void insertNode(Node head, int position, int value){
        if(head==null){
            return;
        }
        Node cur = head;
        if(position==1){
            Node node = new Node(value);
            node.next = cur;
            cur = node;
        } else {
            Node node = new Node(value);
            int i = 1;

            while (i < position - 1) {
                cur = cur.next;
                i++;
            }
            Node next = cur.next;
            cur.next = node;
            node.next = next;
        }

    }
    public int getSize(Node head){
        if(head==null){
            return 0;
        }
        if(head.next==null){
            return 1;

        }
        int i=0;
        while(head!=null){
            head=head.next;
            i++;
        }
        return i;
    }

    public void printLinkedList(Node node) {

        while(node!=null){
            System.out.print(node.value+" ");
            node=node.next;
        }
    }

    @NoArgsConstructor
    @AllArgsConstructor
    static class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value=value;
        }
    }
}
