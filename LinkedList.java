public class LinkedList {
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            return;
        }

        Node last = head;
        while(last.next != null){
            last = last.next;
        }

        last.next = newNode;
    }

    public void deleteNode(int key) {
        Node temp = head, prev = null;

        if(temp != null && temp.data == key){
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }

        if(temp == null){
            return;
        }

        prev.next = temp.next;
    }
    
    public void display() { 
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();

        linkedList.insertAtEnd(5);
        linkedList.insertAtEnd(6);
        linkedList.insertAtEnd(7);
        linkedList.insertAtEnd(1);

        linkedList.display(); // 5 6 7 1 

        linkedList.insertAtBeginning(3);
        linkedList.insertAtBeginning(2);
    }
}
