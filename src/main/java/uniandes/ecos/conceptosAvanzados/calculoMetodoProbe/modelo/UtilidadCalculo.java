package uniandes.ecos.conceptosAvanzados.calculoMetodoProbe.modelo;

import java.util.ArrayList;

/**
 * Realiza calculos matematicos estandar para servicio de toda la aplicacion.
 * @author WALONSO
 *
 */
public final class UtilidadCalculo {
	
	/**
	 * Calcula el promedio de un conjunto de datos.
	 * Precondicion: hay minimo un valor en la lista
	 * @param valoresPromediar: la lista que se va a promediar
	 * @return el promedio de los valores
	 */
	public static double darPromedio(ArrayList<Double> valoresPromediar) {
		double sumaValores = 0;	
		int cantidadDatos = valoresPromediar.size();
		
		if(cantidadDatos == 1) {
			return valoresPromediar.get(0);
		}
		
		for (int indice=0; indice < cantidadDatos; indice++) {
			sumaValores += valoresPromediar.get(indice);
		}
		return sumaValores / cantidadDatos;
	}
	
	/**
	 * Calcula la sumatoria de los datos.
	 * @param valoresSumar: la lista que se va a sumar
	 * @return el sumatoria de los valores
	 */
	public static double darSumatoria(ArrayList<Double> valoresSumar) {
		double sumaValores = 0;	
		int cantidadDatos = valoresSumar.size();
		
		if(cantidadDatos == 1) {
			return valoresSumar.get(0);
		}
		
		for (int indice=0; indice < cantidadDatos; indice++) {
			sumaValores += valoresSumar.get(indice);
		}
		return sumaValores;
	}
	
	/**
	 * Calcula la sumatoria de los datos multiplicados.
	 * Precondicion: la cantidad de valores es la misma
	 * @param primeraLista: lista de los primeros datos a calcular
	 * @param segundaLista: lista de los segundos datos a calcular
	 * @return la suma de la multiplicacion de cada dato en cada lista
	 */
	public static double darSumatoriaFactores(ArrayList<Double> primeraLista, ArrayList<Double> segundaLista) {
		double sumaValores = 0;	
		int cantidadDatos = primeraLista.size();
		
		for (int indice=0; indice < cantidadDatos; indice++) {			
			sumaValores += (primeraLista.get(indice) * segundaLista.get(indice));
		}
		return sumaValores;
	}
	
	/**
	 * Calcula la sumatoria al cuadrado de los datos.
	 * @param valoresSumar: la lista de los valores a sumar al cuadrado
	 * @return el valor de la suma a cuadrado
	 */
	public static double darSumatoriaCuadrada(ArrayList<Double> valoresSumar) {
		double sumaValores = 0;	
		int cantidadDatos = valoresSumar.size();
		
		for (int indice=0; indice < cantidadDatos; indice++) {			
			sumaValores += (Math.pow(valoresSumar.get(indice), 2));
		}
		return sumaValores;
	}

}
