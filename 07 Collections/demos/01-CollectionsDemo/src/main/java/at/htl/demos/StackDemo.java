package at.htl.demos;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("L");
        stack.push("I");
        stack.push("F");
        stack.push("O");
        System.out.println(stack);

        // Get the object at the top without removing it from the stack
        String top = stack.peek();
        System.out.println("peek() => " + top);
        System.out.println(stack);

        // Get the object at the top and remove it from the stack
        top = stack.pop();
        System.out.println("pop() => " + top);
        System.out.println(stack);

        // Test whether the stack is empty
        boolean empty = stack.empty();
        System.out.println("empty() => " + empty);

        // Get the 1-based position of the given object on the stack
        int position = stack.search("L");
        System.out.println("search(\"L\") => " + position);
    }
}
