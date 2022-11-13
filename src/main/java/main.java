import java.util.ArrayList;
import java.util.Arrays;

public class main{
    public static ArrayList<Integer> stack = new ArrayList<>(Arrays.asList());
    public static void main(String[] args) {
        //test
        push(1);
        push(2);
        push(3);

        System.out.println("Initial Stack: " + stack);

        pop();
        pop();
        push(3);

        System.out.println("Final Stack: " + stack);
    }

    public static void push(Integer value){
        stack.add(value);
    }

    public static Integer pop(){
        return stack.remove(stack.size()-1);
    }
}