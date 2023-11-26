package org.example;

import first.Action;
import first.First;

public class Main {
    public static void main(String[] args) {
        int result = Action.addition(5,10);
        System.out.println(First.num(result));

        result = Action.division(10, 2);
        System.out.println(First.num(result));

        result = Action.multiplication(2,2);
        System.out.println(First.num(result));

        result = Action.subtraction(100,10);
        System.out.println(First.num(result));
    }
}
