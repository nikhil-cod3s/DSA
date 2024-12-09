@SuppressWarnings("unused")
public class ListNode{

    private Node head;    //this defines a node that will be pointing towards the first node of the linked list
    
    private Node tail;//tail will be pointing towards the end node of a linked list

    private int size;//the size of a linked list shall remain defined 

    
    public ListNode(){//public constructor for a customized linked list class
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    //A Node is defined as the value that is stored at a certain position in the linked list that also points towards the next node as well

    
}