 import java.util.Stack;


//  Stack is a LIFO data structure that stands for Last in First Out,
// we can push elements at the top of our stack, pop elements and peek at the top element as well

public class StackUse {
    public static void main(String[] args) {

        //Defining a stack!
       Stack games = new Stack<String>();

       //Pushing elements into the stack!
       games.push("Minecraft");
       games.push("Elden Rings");
       games.push("Prince Of Persia");
       games.push("GTA 6");
       games.push("Call Of Duty- Black OPS");

       //poping from a stack
       games.pop(); // we dont need to give parameteres to the pop method as it automatically pops the top most element
       System.out.println(games);

        //to look at the top most element, we use the peek method!
       System.out.println(games.peek());
    }
}