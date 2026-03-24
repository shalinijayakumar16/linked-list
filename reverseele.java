class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class reverseele {

    static Node reverse(Node head) {
        Node prev = null;
        Node temp = head;
        Node front = null;

        while (temp != null) {
            front = temp.next;   // store next
            temp.next = prev;    // reverse link
            prev = temp;         // move prev
            temp = front;        // move forward
        }

        return prev;
    }

    // helper to print
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        System.out.print("Original: ");
        printList(head);

        head = reverse(head);

        System.out.print("Reversed: ");
        printList(head);
    }
}