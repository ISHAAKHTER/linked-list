class Node{
    int data;
    Node next;
    Node (int data){
        this.data=data;
        this.next=null;
    }

}
class LinkedList{
    Node head;
    Node tail;
    int size;

    public void addHead(Node temp){
        temp.next=head;
        head=temp;

    }
    public void addTail(Node temp2){
tail.next=temp2;
temp2=tail;
    }
    public void addInBetween(Node temp, int position){
        Node current=head;
        for (int i=0; i<position; i++){
            current=current.next;
        }
        temp.next=current.next;

    }
}
public class Main {
    public static void main(String []args){
        Node first= new Node(10);
        LinkedList a= new LinkedList();
        a.head=first;
        a.tail=first;
        a.addHead(new Node (100));
        a.addHead(new Node (200));
        a.addHead(new Node (300));
        a.addHead(new Node (400));
        a.addTail(new Node (1000));

        Node current=a.head;
        while (current!= null){
            System.out.print(current.data +" -> ");
            current=current.next;
        }
        System.out.println("NULL");
    }

}
