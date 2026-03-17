class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class insertAtPos
{
    Node head;
    public void insert(int data,int pos)
    {
        Node newnode=new Node(data);
        if(pos==1)
        {
            newnode.next=head;
            head=newnode;
            return;
        }
        Node temp=head;
        for(int i=1;i<pos-1;i++)
        {
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        insertAtPos list= new insertAtPos();
        list.insert(10,1);
        list.insert(20,2);
        list.insert(30,3);
        list.insert(25,3);
        list.display();
    }
}