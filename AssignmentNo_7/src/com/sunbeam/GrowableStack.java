package com.sunbeam;

import java.util.ArrayList;
import java.util.List;

public class GrowableStack<Employee> implements Stack<Employee> {
    List<Employee> growableStack = new ArrayList<>();
    int top = 0;

    @Override
    public void push(Employee emp) {
        growableStack.add(emp);
        top++;
    }

    @Override
    public Employee pop() {
        if (top == 0) {
            System.out.println("Stack Underflow");
            return null;
        }
        Employee temp = growableStack.remove(top - 1);
        top--;
        return temp;
    }

    @Override
    public void peek() {
        if (top == 0) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Total elements: " + top);
        System.out.println(growableStack.get(top - 1));
    }
}