
import java.util.LinkedList;
import java.util.Queue;

public class QueueImp {
    // QUEUE - FIFO data structure ( Firt in First out)
    // we can either poll an element into our queue or we can offer an element intpo the queue
    // the  poll stands for dequeue where as offer stands for enqueue
    // dequeue means removal of element
    // enqueue means addition of element 
    public static void main(String[] args){
        //initializing a queue
        //a queue is an interface so we can not create it's instances
        //but we can creae a linked list and it will act as an instance for queue
        
        Queue<String> names = new LinkedList<String>();

        // adding elements to the queue - enqueue
        names.offer("Huny");
        names.offer("Elisha");
        names.offer("Nikhil");
        names.offer("Priya");
        names.offer("Muskan");

        //removing an element from our queue - dequeue
        names.poll();
        //again it donot require any parameters as it remvoes the top element, or the first element

        names.peek();
        //peek method returns the top element without removing that

        System.out.println(names);
    }
}
