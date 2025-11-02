package com.campusdual.classroom;

import java.util.Stack;

public class Exercise {
    public static Stack<String> createStack() {
        Stack<String> newStack = new Stack<>();

        newStack.push("Smith");
        newStack.push("Montessori");
        newStack.push("Peralta");
        newStack.push("House");

        return newStack;
    }

    public static void printAndEmptyStack(Stack<String> stack) {
        while (!stack.isEmpty()){ // stack changes dynamically - best to use while
            System.out.println("Popped element: " + stack.pop());
        }
//        for (int i = 0; i < stack.size() + 3; i++) {
//            System.out.println("Popped element: " + stack.pop());
//        } --> not the best option
    }

    public static void main(String[] args) {
        printAndEmptyStack(createStack());
    }
}