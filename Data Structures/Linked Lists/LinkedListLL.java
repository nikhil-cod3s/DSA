

public class LinkedListLL {

    private Node head;    //this defines a node that will be pointing towards the first node of the linked list
    
    private Node tail;//tail will be pointing towards the end node of a linked list

    private int size;//the size of a linked list shall remain defined 

    
    public LinkedListLL(){//public constructor for a customized linked list class
        this.size = 0;
    }

//A Node is defined as the value that is stored at a certain position in the linked list that also points towards the next node as well
    private class Node{
        private int val;//values here is the value that wil be stored in the node eg 3
        private Node next;// the next node here will be the address of the next node that will pointed to by this node
        public Node(int value){//public constructor for a node 
            this.val = value;
            this.next = next;
        }
    }
    //let's create a method to add a node at the first position of the list
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        //if the linkedlist is being initialised rn, we can assume that the first element being added can be considered both head nd tail
        if(tail == null){
            tail = head;
        }
        size++;//we have to make space for the next node to get inserted

    }
    //Displaying the linked list
    public void display(){
        Node temp = head;
        while( temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    //inserting an element at the tail of the element!
    public void insertLast(int value){
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    //to insert at a particular index of a linked list
    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;

    }
    //DELETION IN LINKED LISTS

    public int deleteFirst(){
        int temp = head.val;
        head = head.next;
        size--;
        if(head == null){
            tail = null;
        }
        return temp;
    }
    public Node get(int index){
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }//this get method will help us get a reference pointer for our second last node in the linked list so that we can point it to null as it will remove the last node from the linked list and making the second last node a new tail as well as a last element
    //deletion from the last node
    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size - 2 );
        int val = tail.val;
        tail = secondLast;
        tail.next = null;
        return val;
    }
    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size - 1 ){
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        return val;
    }

    //Searching in a linked list
    public Node search(int value){
        Node node = head;
        for(int i = 0; i < size; i++){
           node = node.next;
           if(node.val == value){
            return node;
           } 
        }
        return null;
    }
    
}
