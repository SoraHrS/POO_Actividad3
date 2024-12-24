package com.mycompany.ejercicio19;

public class TrianguloEquilatero {
    double lado;
    
    TrianguloEquilatero (double lado) {
        this.lado = lado;
    }

    double calcularPerimetro () {
        return this.lado * 3;
    }

    double calcularAltura () {
        return (this.lado * Math.sqrt(3))/2;
    }

    double calcularArea() {
        return (this.lado * this.calcularAltura())/2;
    }
}
