package com.kacpermartela.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MinStack {
    record StackVal(int val, int lowest) {}

    private final List<StackVal> stack;

    public MinStack() {
        stack = new ArrayList<StackVal>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.add(new StackVal(val, val));
        } else {
            final var stackVal = stack.get(stack.size() - 1);
            int min = stackVal.lowest;
            if (val < min) {
                min = val;
            }
            stack.add(new StackVal(val, min));
        }
        ;
    }

    public void pop() {
        stack.remove(stack.size() - 1);
    }

    public int top() {
        return stack.get(stack.size() - 1).val;
    }

    public int getMin() {
        return stack.get(stack.size() - 1).lowest;
    }
}
