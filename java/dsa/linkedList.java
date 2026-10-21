class Node { // linkedList constructor
    int data;
    Node next;

    Node(int new_data) {
        this.data = new_data;
        this.next = null;
    }
}

public class linkedList {
    void main() {

        Node head = new Node(10);
        head.next = new Node(35);
        head.next.next = new Node(43);
        head.next.next.next = new Node(56);
        head.next.next.next.next = new Node(67);

        System.out.println("Singly linkedlist");
        Node temp = head; // output linkedList
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}