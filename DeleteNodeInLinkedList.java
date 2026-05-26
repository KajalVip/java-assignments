public class DeleteNodeInLinkedList {
}
class Node{
    int value;
    Node next;
    Node(int value){
        this.value=value;
    }

}
class LinkedListDemo{
    public static Node deleteNode(int value,Node startNode){
        //If list is empty
        if(startNode==null){
            System.out.println("List is empty");
            return null;
        }
        if(startNode.value==value){
            return startNode.next;

        }
        Node current=startNode;
        while(current.next!=null){
            if (current.next.value==value){
                current.next=current.next.next;
                break;
            }
            current=current.next;

        }
        return startNode;

    }
    // print list
    public static void printList(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;

        }
    }

   public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        System.out.println("Before delete");
        printList(head);
        head=deleteNode(30,head);
        System.out.println("After delete");
        printList(head);
    }
}
