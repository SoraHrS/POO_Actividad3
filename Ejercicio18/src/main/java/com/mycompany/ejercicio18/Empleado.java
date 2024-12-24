
package com.mycompany.ejercicio18;

public class Empleado {
   String nombre, codigo;
    double horasTrabajadas, valorHora, retencionFuente;

    Empleado (String nombre, String codigo, double horasTrabajadas, double valorHora, double retencionFuente) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        this.retencionFuente = retencionFuente;
    }

    double calcularSBruto() {
        return this.horasTrabajadas * this.valorHora;
    }

    double calcularRFuente() {
        double salarioBruto = calcularSBruto();
        return salarioBruto * (this.retencionFuente/100);
    }

    double calcularSNeto() {
        double salarioBruto = calcularSBruto();
        double retencion = calcularRFuente();
        return salarioBruto - retencion;
    }
 
}
