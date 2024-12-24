package com.mycompany.ejercicio7;

public class Comparacion {
    double a,b;
    Comparacion(double a, double b) {
        this.a = a;
        this.b = b;
    }

    String comparar() {
        if (this.a > this.b) {
            return "A es mayor que B";
        } else if (this.a == this.b) {
            return "A es igual que B";
        }else {
            return "A es menor que B";
        }
    }
}
