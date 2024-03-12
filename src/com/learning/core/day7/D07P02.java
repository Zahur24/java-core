package com.learning.core.day7;
class Node {
    double value;
    Node next;

    public Node(double value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedListStack {
    Node head;

    public LinkedListStack() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    void push(double data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    double pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return Double.MIN_VALUE;
        } else {
            double x = head.value;
            head = head.next;
            return x;
        }
    }

    void display1() {
        Node t = head;
        System.out.print("The elements of the stack are: ");
        while (t != null) {
            System.out.print(t.value + " ");
            t = t.next;
        }
        System.out.println("null");
    }

    void display2() {
        Node t = head;
        System.out.print("After popping twice: ");
        while (t != null) {
            System.out.print(t.value + " ");
            t = t.next;
        }
        System.out.println("null");
    }
}

public class D07P02 {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        stack.push(10.0);
        stack.push(20.0);
        stack.push(30.0);
        stack.push(40.0);

        stack.display1();

        stack.pop();
        stack.pop();

        stack.display2();
    }
}
