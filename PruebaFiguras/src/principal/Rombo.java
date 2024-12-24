package principal;
public class Rombo {
    int D,d, l;

    public Rombo(int D, int d, int l) {
        this.D = D;
        this.d = d;
        this.l = l;
    }
    double calcularArea() {
        return (this.D*this.d)/2;
    }
    double calcularPerimetro() {
        return 4*this.l;
    }
}
