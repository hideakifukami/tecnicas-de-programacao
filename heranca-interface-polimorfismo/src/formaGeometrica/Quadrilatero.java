package formaGeometrica;

public abstract class Quadrilatero implements FormaGeometrica {
	protected double ladoA;
    protected double ladoB;
    protected double ladoC;
    protected double ladoD;

    public Quadrilatero(double ladoA, double ladoB, double ladoC, double ladoD) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.ladoD = ladoD;
    }

    @Override
    public double calcularPerimetro() {
        return ladoA + ladoB + ladoC + ladoD;
    }
}
