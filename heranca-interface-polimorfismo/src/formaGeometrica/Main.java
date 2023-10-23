package formaGeometrica;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
        ArrayList<FormaGeometrica> formas = new ArrayList<FormaGeometrica>();

        System.out.print("Quantas formas deseja criar? ");
        int numFormas = scanner.nextInt();

        for (int i = 0; i < numFormas; i++) {
            System.out.print("Qual tipo de forma deseja criar (1 - Retângulo, 2 - Quadrado, 3 - Círculo): ");
            int tipoForma = scanner.nextInt();

            if (tipoForma == 1) {
                System.out.print("Base do retângulo: ");
                double base = scanner.nextDouble();
                System.out.print("Altura do retângulo: ");
                double altura = scanner.nextDouble();
                formas.add(new Retangulo(base, altura));
            } else if (tipoForma == 2) {
                System.out.print("Lado do quadrado: ");
                double lado = scanner.nextDouble();
                formas.add(new Quadrado(lado));
            } else if (tipoForma == 3) {
                System.out.print("Raio do círculo: ");
                double raio = scanner.nextDouble();
                formas.add(new Circulo(raio));
            }
        }

        for (FormaGeometrica forma : formas) {
            if (forma instanceof Quadrilatero) {
                Quadrilatero quadrilatero = (Quadrilatero) forma;
                System.out.println("Lados: " + quadrilatero.ladoA + ", " + quadrilatero.ladoB + ", " + quadrilatero.ladoC + ", " + quadrilatero.ladoD);
            } else if (forma instanceof Circulo) {
                Circulo circulo = (Circulo) forma;
                System.out.println("Raio: " + circulo.raio);
            }

            System.out.println("Perímetro: " + forma.calcularPerimetro());
            System.out.println("Área: " + forma.calcularArea());
        }

    
	}

}
