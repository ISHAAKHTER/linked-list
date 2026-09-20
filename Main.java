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
        third.next=first;
        Node current=first;
        do{
            System.out.print(current.data +" -> ");
            current=current.next;
        }while (current!= first);
        System.out.println("BACK TO HEAD");
    }

}
