import java.util.Random;

public class Ejercicio7{

	public static void main(String[] args) {
		Random random = new Random();
		int pares = 0;
		int impares = 0;
		int ceros = 0;
		for (int i = 0;i < 15;i++) {
			int aleatorio = random.nextInt(37);
			System.out.println(aleatorio+"");
			if (aleatorio == 0) {
				ceros++;
			} else if ((aleatorio % 2) == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		double porPar = (pares/15)*100;
		double porImpar = (impares/15)*100;
		double porCeros = (ceros/15)*100;
		System.out.println("\nEl porcentaje de números impares es " + porImpar + "%, de pares es " + porPar + "% y de ceros es " + porCeros);
	}
}