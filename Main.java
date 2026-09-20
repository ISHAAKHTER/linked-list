class Node{
    int data;
    Node next;
    Node (int data){
        this.data=data;
        this.next=null;
    }
}

public class Main {
    public static void main(String []args){
        Node first= new Node(10);
        Node sec= new Node(20);
        Node third=new Node(30);
        first.next=sec;
        sec.next= third;
        Node current=first;
        while (current!= null){
            System.out.print(current.data +" -> ");
            current=current.next;
        }
        System.out.println("NULL");
    }

}
