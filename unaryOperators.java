package PracticeLearning;

import static java.lang.System.out;

public class unaryOperators {

    public static void main(String[] args) {
        int a = 999;
        boolean b = true;
        //   //this codee will show incremented from added number
        System.out.println(a++); // prints 999
        System.out.println(++a); // prints 1001
        //   //this codee will show decremented number
        System.out.println(--a); // prints 1000
        System.out.println(--a); // prints 999
        out.println(!b); // should print false as boolean b is  set to 'true' by default

}}
