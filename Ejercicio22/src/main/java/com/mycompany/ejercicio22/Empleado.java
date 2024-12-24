
package com.mycompany.ejercicio22;

public class Empleado {
    String nombre;
    double salario, horasTrabajadas, salarioMensual;

    Empleado(String nombre, double salario, double horasTrabajadas) {
        this.nombre = nombre;
        this.salario = salario;
        this.horasTrabajadas = horasTrabajadas;
    }

    void calcularSalarioMensual() {
        this.salarioMensual = this.salario * this.horasTrabajadas;
    }
    
}
