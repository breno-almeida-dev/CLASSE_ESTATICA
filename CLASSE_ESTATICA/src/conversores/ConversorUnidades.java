package conversores;

/*
 * Esta classe possui como membros, métodos para converter
 * alguns tipos de valores.
 */
public class ConversorUnidades {
	
	/*
	 * Esse método estático calcula uma temperatura de celsius para
	 * fahrenheit. Primeiramente o valor de celsius é multiplicado por
	 * 1,8, para então somar 32, assim como a equação determina.
	 */
	public static double celsiusParaFahrenheit(double celsius) {
		double fahrenheit = (celsius * 1.8) + 32.00;
		return fahrenheit;
	}
	
	/*
	 * Esse método estático calcula uma distância em quilometros para
	 * milhas. Recebendo dois valores como parâmetros, uma é a distância
	 * em "double" a ser calculada e uma "String" que armazena o nome do
	 * tipo de milha a ser calculado, pois milhas terrestre e náutica possuem
	 * diferentes tipos de contas
	 * 
	 * Para diferenciar qual tipo de conta usar é utilizado uma condição if para
	 * verificar o que foi escrito para então determinar qual equação usar.
	 */
	public static double quilometrosParaMilhas(double quilometros, String tipoMilha) {
		if (tipoMilha.equalsIgnoreCase("Terrestre")) {
			double milhas = quilometros / 1.6093;
			return milhas;
		} else { 
			double milhas = quilometros / 1.852;
			return milhas;
		}

	}
	
	/*
	 * Esse método estático calcula e converte um peso em grama para libras.
	 * Para isso o peso em gramas é dividido por 453,592, resultando assim
	 * no valor em libras.
	 */
	public static double gramasParaLibras(double gramas) {
		double libras = gramas / 453.592;
		return libras;
	}

}
