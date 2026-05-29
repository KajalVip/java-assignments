class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data=data;
    }
}
public class LinkedListRotation {
    public static Node1 rotate(Node1 head,int rotationCount){
        if (head==null||head.next==null||rotationCount==0){
            return head;
        }
        //find length and last node of linkedlist
        int length=1;
        Node1 temp=head;
        while(temp.next!=null){
            temp=temp.next;
            length++;
        }
        Node1 last=temp;
        //conver negative rotation
        if(rotationCount<0){
            rotationCount=length+rotationCount;
        }
        //if rotationcount is greater that length of linkedlist
        if(rotationCount>length){
            rotationCount=rotationCount%length;
        }
        //find new tail
        int steps=length-rotationCount;
        Node1 current=head;
        for(int i=0;i<steps;i++){
            current=current.next;
        }
        Node1 newHead=current.next;
        current.next=null;
        last.next=head;
        return newHead;
    }
    public static void printlist(Node1 head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }

    }
    static void main(String[] args) {
        Node1 head=new Node1(1);
        head.next=new Node1(2);
        head.next.next=new Node1(3);
        head.next.next.next=new Node1(4);
        head.next.next.next.next=new Node1(5);
        System.out.println("original list");
        printlist(head);
        System.out.println("rotate list");
        head=rotate(head,3);
        printlist(head);
    }
}
