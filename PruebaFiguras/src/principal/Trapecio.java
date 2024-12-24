package principal;
public class Trapecio {
    int a,b,c,d,h;

    public Trapecio(int a, int b, int c, int d, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }

    double calcularArea() {
        return (this.h/2)*(this.b+this.d);
    }
    double calcularPerimetro() {
        return (this.a+this.b+this.c+this.d);
    }
}
