package LickedList;

public class Palindrome {

    private LinkedList linkedList;
    private ReverseLinkedList reverseLinkedList;
    public boolean isPalindrome(LinkedList.Node head){

        if(head==null || head.next==null){
            return true;
        }
        linkedList = new LinkedList();
        reverseLinkedList = new ReverseLinkedList();
        LinkedList.Node middle = getMiddleNode(head);
        middle =  reverseLinkedList.reverse(middle);
        System.out.println(middle.next);

        while (middle!=null){
            if(head.value!=middle.value){
                return false;
            }
          head= head.next;
            middle=middle.next;
        }
        return true;
    }

    private LinkedList.Node getMiddleNode(LinkedList.Node head) {

        LinkedList.Node slow = head;
        LinkedList.Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next;
            slow= slow.next;
        }
        return slow;

    }

    public static void main(String[] args) {
        LinkedList.Node node = new LinkedList.Node(1);
        LinkedList.Node node1 =  new LinkedList.Node(2);
        LinkedList.Node node2 =  new LinkedList.Node(1);
      //  LinkedList.Node node3 =  new LinkedList.Node(2);
     //   LinkedList.Node node4 =  new LinkedList.Node(2);
        node.next=node1;
        node1.next=node2;
       // node2.next=node3;
      //  node3.next=node4;
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(node));

    }
}
