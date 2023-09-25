class LinkedList {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    }// deletion of a node in the linkedlist
      void deleteNode(int position){
        // linkedlist is empty
        if(head == null){
            return;
        }
        Node temp = head;

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
    
    // implementation of displaying the linkedlist
    public void displayLL(){
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

        llist.deleteNode(3);
        System.out.println("Linked List after deletion of the node: ");
        llist.displayLL();
        System.out.println();
    }