package com.bulbul.stack;

public class MyStack {

    private int[] array;
    private int top;
    private  int capacity;

    MyStack(int capacity){
        this.array = new int[capacity];
        this.capacity = capacity;
        this.top = -1;

    }

    public void push(int item){
        if(isFull()){
            throw new RuntimeException("Stack is full");
        }
        System.out.println("Inserting " + item);
        array[++top] = item;
    }

    private boolean isFull() {
        return top == capacity - 1;
    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return array[--top];
    }

    private boolean isEmpty() {
        return top == -1;
    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return array[top];
    }

    // display elements of stack
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void main(String[] args) {

        MyStack stack = new MyStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.print("Stack: ");
        stack.printStack();

        // remove element from stack
        stack.pop();
        System.out.println("\nAfter popping out");
        stack.printStack();

    }
}
