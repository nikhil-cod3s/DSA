

class BinarySearchTree {
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;
        public Node(int value){
            this.value = value;
        }
        public int getVal(){
            return value;
        }
        // public BinarySearchTree(){

        // }
        public Node root;
        public int height(Node node){
            if(node ==  null){
                return -1;
            }
            return node.height;
        }
        public boolean isEmpty(){
            return root == null;
        }
        public void display(){
            display(root, "Root Node: ");
        }
        private void display(Node node, String details){
            if(node == null){
                return;
            }
            System.out.println(details + node.value);
        }
       


    }
}
