// Write a class to store and perform operations on complex numbers.
// Complex number has two parts -: Real part and Imaginary part , i = sqrt(-1)

package com.scaler;

class complexNumber {
    int real;
    int imaginary;

    // constructor

    complexNumber(int r, int i) {
        real = r;
        imaginary = i;
    }

    void print() {
        System.out.println(real + "+" + imaginary + "i");
    }

    complexNumber add(complexNumber y) {
        int sumreal = real + y.real;
        int sumimaginary = imaginary + y.imaginary;
        complexNumber s = new complexNumber(sumreal, sumimaginary);
        return s;
    }
}

class DG_28_04_OOP_Complex {
    public static void main(String[] args) {
        complexNumber x = new complexNumber(2, 3);

        System.out.println(x.real);
        System.out.println(x.imaginary);

        x.print();

        complexNumber y = new complexNumber(-3, 4);

        y.print();

        complexNumber z = x.add(y);
        z.print();
    }
}
