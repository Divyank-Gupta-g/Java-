// this keyword is used to refer to the current object inside a class method.

package com.scaler;

class complexNumbers {
    int real;
    int imaginary;

    // constructor

    complexNumbers(int r, int i) {
        this.real = r;            // on left side, this keyword tells Java we are referring to the instance variable.
        this.imaginary = i;       // on right side, we are referring local variables.
    }

    void print() {
        System.out.println("this = " + this);
        System.out.println(this.real + "+" + this.imaginary + "i"); // here this keyword is not mandatory to use.
    }
}

class DG_28_05_OOP_This_keyword {
    public static void main(String[] args) {
        complexNumbers x = new complexNumbers(2, 3);

        x.print();
        System.out.println("x = " + x);
    }
}
