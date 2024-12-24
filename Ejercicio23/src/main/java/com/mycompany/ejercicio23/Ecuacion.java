
package com.mycompany.ejercicio23;

public class Ecuacion {
double a, b, c, solucion1, solucion2, solucionu;

    Ecuacion (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double calcularDiscriminante() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    String calcularSoluciones() {
        double d = this.calcularDiscriminante();
        if (d > 0) {
            this.solucion1 = (-this.b + Math.sqrt(d)) / (2 * this.a);
            this.solucion2 = (-this.b - Math.sqrt(d)) / (2 * this.a);
            return "x1 = " + this.solucion1 + ", x2 = " + this.solucion2;
        } else if (d == 0) {
            this.solucionu = -this.b / (2 * this.a);
            return "x = " + this.solucionu;
        } else {
            return "No hay solución en los reales";
        }
    }    
}
