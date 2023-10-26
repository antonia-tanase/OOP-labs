package lab02.task1;

import java.util.*;

class Complex {
    private int real;
    private int imaginary;

    // Add constructors
    public Complex(int r, int i) {
        real = r;
        imaginary = i;
    }

    public Complex(){
        this(0, 0);
    }

    public Complex(Complex c) {
        this.real = c.real;
        this.imaginary = c.imaginary;
    }

    // Add getters and setters
    public void setReal(int r) {
        real = r;
    }

    public void setImaginary(int i) {
        imaginary = i;
    }

    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }
    // Add addWithComplex
    public void addWithComplex(Complex c) {
        this.real += c.real;
        this.imaginary += c.imaginary;
    }

    // Add showNumber prints a +/- i * b
    public void showNumber() {
        if (imaginary > 0) {
            System.out.println(real + " + i * " + imaginary);
        } else if (imaginary < 0) {
            System.out.println(real + " - i * " + -imaginary);
        } else {
            System.out.println(real);
        }
    }
}

