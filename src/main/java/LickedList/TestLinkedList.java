package LickedList;

import lombok.RequiredArgsConstructor;

public class TestLinkedList {


    public static void main(String[] args) {
        LinkedList.Node node = new LinkedList.Node(1);
        LinkedList.Node node1 =  new LinkedList.Node(2);
        LinkedList.Node node2 =  new LinkedList.Node(3);
        LinkedList.Node node3 =  new LinkedList.Node(5);

        node.next=node1;
        node1.next=node2;
        node2.next=node3;

        LinkedList  testLinkedList = new LinkedList();
        testLinkedList.insertNode(node, 1, 0);
        //System.out.println(testLinkedList.getSize(node));
       // testLinkedList.insertNode(node, 4, 4);
        //System.out.println(testLinkedList.getSize(node));
      //  testLinkedList.insertNode(node, 6, 6);

        testLinkedList.printLinkedList(node);

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.reverse(node);



    }


}
