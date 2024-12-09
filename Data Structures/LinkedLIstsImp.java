// A data structure just like an array, the difference is that , its elements keeps the address of its next elements 
// we can either remove an element from a linked list just by giving the position <index> of our new element! unlike array, where we moves all the elements to either left or right to make space for our new element to get inserted.

import java.util.LinkedList;

public class LinkedLIstsImp {
    public static void main(String[] args){ 
        //initializing a linked list 
        LinkedList<String> grades = new LinkedList<String>();

        //adding elements to out linked list
        grades.offer("A");
        grades.offer("B");
        grades.offer("C");
        grades.offer("E");

        //adding the element "D" at the position 4!
        grades.add(3,"D");

        //removing an element from the linked list
        grades.remove("E");

        System.out.println(grades);
    }
}
