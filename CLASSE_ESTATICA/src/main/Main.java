package main;

/*
 * Primeiramente é realizada a importação do pacote "conversores" e
 * de sua classe "ConversorUnidades".
 */
import conversores.ConversorUnidades;

public class Main {

	public static void main(String[] args) {

		/*
		 * Aqui foi definida uma variável do tipo "double" chamada "temperatura".
		 * Então no processo de inicialização da variável foi realizada a chamada
		 * da classe "ConversorUnidades" e mais precisamente do seu método de cálculo
		 * de Celsius para Fahrenheit, sendo informado o valor a ser utilizado para o
		 * cálculo.
		 * 
		 * Por fim é utilizado um "System.out" para imprimir uma mensagem com o resultado
		 * calculado.
		 */
		double temperatura = ConversorUnidades.celsiusParaFahrenheit(32.00);
		System.out.println("A temperatura de 32° Celsius em Fahrenheit é: " + temperatura + "°F\n\n\n");
		
		/*
		 * Primeiramente foi definido duas variáveis, uma "double" para armazenar a distância
		 * que será calculado, e uma "String" que armazena o nome do tipo de milha a ser calculada.
		 * 
		 * Então no processo de inicialização da variável "distancia" foi realizada a chamada
		 * da classe "ConversorUnidades" e mais precisamente do seu método de cálculo
		 * de quilometros para milhas, sendo informado o valor a ser utilizado para o
		 * cálculo.
		 *  
		 * Por fim é impresso a mensagem informando os resultados.
		 */
		double distanciaKm = 50;
		String tipoMilha = "Náutica";
		double distancia = ConversorUnidades.quilometrosParaMilhas(distanciaKm, tipoMilha);
		System.out.println("A distância de " + distanciaKm + "km " + tipoMilha + " corresponde a: " + distancia + " milhas.\n\n\n");
		
		/*
		 * Primeiramente é definida uma variável "double" que armazena o peso em
		 * gramas a ser utilizado.
		 * 
		 * Então no processo de inicialização da variável "distancia" foi realizada a chamada
		 * da classe "ConversorUnidades" e mais precisamente do seu método de cálculo
		 * de gramas para libras, sendo informado o valor a ser utilizado para o
		 * cálculo.
		 * 
		 * Por fim é impresso a mensagem informando os resultados.
		 */
		double pesoGramas = 6000.00;
		double massa = ConversorUnidades.gramasParaLibras(pesoGramas);
		System.out.println("O peso de " + pesoGramas + " gramas em libras é: " + massa);
	}

}
