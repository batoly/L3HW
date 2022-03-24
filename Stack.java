/**
 * Created by Lenovo on 1/23/2022.
 */
public class Stack {
    public static void main(String[] args) {
        java.util.Stack<Integer> Stack=new java.util.Stack<Integer>();
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        Stack.push(4);
        Stack.push(5);
        System.out.println("Stack :"+Stack);
        System.out.println("POPPED Element:"+Stack.pop());
        System.out.println("Stack after pop operation"+Stack);
    }
}
