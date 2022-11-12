public class LL {
    // Define a variable named head at LL level
    // [head is throwing error that's why we make a private node head at class
    // level]
    private Node head;

    // cratea Node class

    public class Node {
        // we need two things to create a node.

        String data;
        Node next;

        // now we declare the node.
        Node(String data) {
            this.data = data;
            this.next = null;
        }

    }
    // add any node in the first node.

    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    // Add node in the last position

    public void addLast(String data) {
        // if head is pointed to the null
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        // if head is not pointed to the null or pointed to any node.

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // print Linked-List

    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");

    }

    public static void main(String[] args) {

        LL list = new LL();
        list.addFirst("vivek");
        list.addFirst("is");
        list.addFirst("a");
        list.addLast("boy");

        list.printList();

    }
}