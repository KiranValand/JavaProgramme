package PracticeLearning;

import static java.lang.System.out;

class arithmeticOperators {
    public static void main(String[] args) {
        int a = 57;
        int num1;
        num1 = 10;
        int num2;
        num2 = 25;
        //   //this codee will show added number
        out.println(" auditioned number  is : " + (a + num1));
        //this codee will show subtracted number
        out.println(" subtracted number  is : " + (a - num1));
        //this codee will show multiplied number
        out.println(" multiplication  number  is : " + (a * num1));
        //this codee will show divided number
        out.println(" division number  is : " + (a / num2));

        //this codee will show modulus number
        out.println(" modulus number for 'a and num1 ' is : " + (a % num1));


        //   //this codee will show incremented from added number
        System.out.println(a++ + num1); // prints 67
        System.out.println(++num2 + a); // prints 84
        //   //this codee will show decremented number
        System.out.println(num1-- + a); // prints 68
        System.out.println(--num1 + a); // prints 66

    }
    }