public class LinkedListDD {
    int size; 

    Node head;
    
    Node tail;

    public LinkedListDD() {
        this.size = 0;
    }
    
    private class Node{
        private int val;
        private Node next;
        private Node prev;
        public Node(int val){
            this.prev = prev;
            this.val = val;
            this.next = next;
        }
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(tail == null){
            tail = head;
        }
        size ++;
    }

}
