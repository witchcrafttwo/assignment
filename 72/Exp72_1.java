
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
public class Exp72_1 {
    public static void main(String[] args){
        Queue<String> queue = new ArrayDeque<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        // System.out.println("Initial Queue: " + queue);
        Deque<String> stack = new ArrayDeque<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("Initial Stack: " + stack);
    
    
    }
    
}
