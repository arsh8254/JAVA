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






        }// deletion of a node in the linkedlist
      void deleteNode(int position){
        // linkedlist is empty
        if(head == null){
            return;
        }
        Node temp = head;   // we created temp to hold the address of first node

        // deletion from the beginning
        if(position == 0){
            head = temp.next;
            return;
        }

        // deletion is from other positions apart from the beginning
        for(int i=0; temp != null && i<position-1; i++){
            temp = temp.next;
        }

        if(temp == null && temp.next == null){
            return;
        }
        temp.next = temp.next.next;
    }





        // implementation of reversal of a linkedlist using an iterative approach
    public void reverseLL(){
        Node curr = head;
        Node prev = null;
        Node nextPtr = null;

        while(curr != null){
            nextPtr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextPtr;
        }
        head = prev;
        return;
    }




    // implementation of reversal of a linked list using a recursive approach
    public void reversalRec(Node curr, Node prev){
        // last node of the linked list
        if(curr.next == null){
            head = curr;
            curr.next = prev;
            return;
        }

        Node nextPtr = curr.next;
        curr.next = prev;
        // recursion concept
        reversalRec(nextPtr, curr);
    }




    // implementation of finding out the middle node in a linked list
    // two-pointer approach
    public void middleNode(){
        Node slowPtr = head, fastPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        System.out.println("Middle data of a given linked list is: "+slowPtr.data);
    }




    // implementation of finding out the cycle in a linked list
    // floyd's cycle detection algorithm - interview based question
    public void detectLoop(){
        Node slow=head, fast=head;
        int flag = 0;
        while(slow!=null && fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = 1;
                break;
            }
        }

        if(flag == 0){
            System.out.println("No loop detected");
        }
        else{
            System.out.println("Loop is detected");
        }

    }



    // display all the nodes after the insertion
    public void printNodes(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;

        }
    }

        // calling all the functions
        public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.insertAtEnd(2);
        llist.insertAtEnd(4);
        llist.insertAtEnd(8);
        

        System.out.println("Before insertion of 10, 1 and 19");
        //llist.displayLL();
        System.out.println();

        llist.insertAtEnd(10);
        llist.insertAtBeginning(1);
        llist.insertAtBeginning(19);

    
        System.out.println("After insertion of 10, 1 and 19");
        //llist.displayLL();
        System.out.println();

        llist.insertAfter(llist.head.next.next.next, 13);
        llist.displayLL();
        System.out.println();

        /* 
        llist.deleteNode(0);
        System.out.println("Deletion of a node from a linkedlist");
        llist.displayLL();
        System.out.println();
        */

        //llist.reverseLL();
        //llist.reversalRec(llist.head, null);
    
        //System.out.println("Reversal of a Linked List is");
        //llist.displayLL();
        //llist.middleNode();

        // circular linked list
        Node temp = llist.head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = llist.head;
        
        llist.detectLoop();
        System.out.println();
}