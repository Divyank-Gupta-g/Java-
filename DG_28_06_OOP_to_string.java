package com.scaler;

class complexNum {
    int real;
    int imaginary;

    // constructor

    complexNum(int r, int i) {
        this.real = r;            // on left side, this keyword tells Java we are referring to the instance variable.
        this.imaginary = i;       // on right side, we are referring local variables.
    }

    public String toString() {
        return this.real + "+" + this.imaginary + "i";
    }
}

class DG_28_06_OOP_to_string {
    public static void main(String[] args) {
        complexNum x = new complexNum(2, 3);
        complexNum y = new complexNum(-5, 7);

        System.out.println(x);
        System.out.println((y));
    }
}
