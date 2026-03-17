class Node{
    int data;
    Node next;
    Node(int data){
        this.data= data;
        this.next=null;
    }   
}
public class insertAtEnd {
    Node head;
    public void insert(int data){
        Node newnode= new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        insertAtEnd list= new insertAtEnd();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.display();
    }
}