package com.mycompany.ejercicio10;

public class Matricula {
    String nombre, numeroIncripcion;
    double patrimonio, pagoMatricula = 50000;
    int estratoSocial;

    Matricula (String nombre, String numeroIncripcion, double patrimonio, int estratoSocial) {
        this.nombre = nombre;
        this.numeroIncripcion = numeroIncripcion;
        this.patrimonio = patrimonio;
        this.estratoSocial = estratoSocial;
    }

    double calcularPagoMatricula() {
        if (this.patrimonio > 2000000 && this.estratoSocial > 3) {
            this.pagoMatricula = this.pagoMatricula + 0.03*patrimonio;
        }
        return this.pagoMatricula;

    }
}
