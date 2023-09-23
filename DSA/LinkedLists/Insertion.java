class LinkedList {
    Node head;      // at starting node has only head value

    class Node{
        int data;
        Node next;   // to store pointer

        // defining constructor
        Node(int d){
            data = d;
            next = null;
        }
    }

    // insert the node at the very end in the linked list
    public void insertAtEnd(int newData){
        // newData is the data entered by user

        // intialize the Node constructor with the newData entered by the user
        // object/node creation by initialising constructor
        Node newNode = new Node(newData);

        // LinkedList is empty
        if(head == null){
            head = new Node(newData);
            return;
        }

        // LinkedList is not empty
        newNode.next = null;     // intially value of pointer is null in newNode
        // traversing the linkedlist to the end of the node
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

      //  implementation of insertion of node at the beginning
    public void insertAtBeginning(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

      // implementation of insertion of a node after any given node
    public void insertAfter(Node prev_node, int newData){
        // if given prev_node don't exist
        if(prev_node == null){
            System.out.println("The previous node cannot contain the null values");
            return;
        }

        Node newNode = new Node(newData);
        newNode.next = prev_node.next;
        prev_node.next = newNode;

    }

    // display all the nodes after the insertion
    public void printNodes(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;

        }
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.insertAtEnd(2);
        llist.insertAtEnd(4);
        llist.insertAtEnd(8);
        

        System.out.println("Before insertion of 10, 1 and 19");
        llist.displayLL();
        System.out.println();

        llist.insertAtEnd(10);
        llist.insertAtBeginning(1);
        llist.insertAtBeginning(19);

    
        System.out.println("After insertion of 10, 1 and 19");
        llist.displayLL();
        System.out.println();

        llist.insertAfter(llist.head.next.next.next, 13);
        // we define the position of node in this way -- here we defined 3rd node
        llist.displayLL();
        System.out.println();
    }
}