import java.util.*;

class Functions1 {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();

        // to add the data inside the queue - enqueue operation
        for(int i=0; i<10; i++){
            q.add(i);
        }

        System.out.println("Queue data looks like: " +q);

        // to display the top element present in the queue
        System.out.println("The top element in the queue before deletion is: " +q.peek());

        // to remove the element from the queue - dequeue operation
        q.remove();

        // to display the top element present in the queue
        System.out.println("The top element in the queue after deletion is: " +q.peek());

        // to check the size of the queue
        System.out.println("The current size of the queue is: " +q.size());
    
    }
}