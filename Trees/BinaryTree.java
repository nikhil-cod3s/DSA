import java.util.Scanner;

class BinaryTree{

    void populate(Scanner scanner) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    private static class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
            
        }
        private Node root;
        private void display() {
            display(root, "");
        }
        //insertion of elements
        public void populate(Scanner scanner){
            System.out.println("Enter the root node value: ");
            int value = scanner.nextInt();
            populate(scanner,root);
        }
        public void populate(Scanner scanner, Node node){
            System.out.println("Do you want to enter the left of " + node.value);
            boolean left = scanner.nextBoolean();
            if(left){
                System.out.println("Enter the value of the left of the node: ");
                int value = scanner.nextInt();
                node.left = new Node(value);
                populate(scanner,node.left);
            }
            System.out.println("Do you want to enter the Right of " + node.value);
            boolean right = scanner.nextBoolean();
            if(right){
                System.out.println("Enter the value of the left of the node: ");
                int value = scanner.nextInt();
                node.right = new Node(value);
                populate(scanner,node.right);
            }
        }
            //display

        private void display(Node node, String indent){
            if(node == null){
                return;
            }
            System.out.println(indent + node.value);
            display(node.left , indent + '\t');
            display(node.right , indent + '\t');

            
        }
    }

    
    public static void main(String[] args){
        BinaryTree tree= new BinaryTree();
        Scanner scanner = new Scanner(System.in);
        tree.populate(scanner);
        tree.display();  
    }
}