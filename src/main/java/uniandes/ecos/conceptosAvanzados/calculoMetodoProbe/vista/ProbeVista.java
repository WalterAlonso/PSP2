package uniandes.ecos.conceptosAvanzados.calculoMetodoProbe.vista;

import java.util.Scanner;

import uniandes.ecos.conceptosAvanzados.calculoMetodoProbe.modelo.IMetodoProbe;

/**
 * Clase que se encarga de la mostrar y solicitar los datos
 * @author WALONSO
 *
 */
public class ProbeVista {
	
	/**
	 * Propiedad que contiene el metodo calculado
	 */
	public IMetodoProbe metodoProbe;
	
	/**
	 * Ctor de la vista 
	 */
	public ProbeVista() {		
	}
	
	/**
	 * Asigna el metodo calculado
	 * @param metodoProbe: el metodo probe escogido
	 */
	public void asignarMetodo(IMetodoProbe metodoProbe) {
		this.metodoProbe = metodoProbe;
	}
	
	/**
	 * Obtiene del usuari el metodo probe deseado
	 * @return el valor entero del tipo de metodo deseado:
	 * 1 es Metodo A
	 * 2 es Metodo B
	 */
	@SuppressWarnings("resource")
	public int obtenerMetodoCrear() {
		Scanner teclado = new Scanner (System.in);
		while(true) {				
			System.out.println("Escoja el metodo Probe deseado : ");
			System.out.println("	1. Metodo A.");
			System.out.println("	2. Metodo B.");
			System.out.println("	3. Salir.");
				
			String valor = teclado.next();
			valor = valor.trim();
			switch (valor) {
				case "1":
					return 1;
				case "2":
					return 2;
				case "3":
					salir();
				default:
					System.out.println("---- Opcion no encontrada, vuelva a intentarlo.----\n");
					break;
			}
		}		
	}

	/**
	 * Obtiene del usuario el tipo de metodo probe a aplicar
	 * @return el valor entero del tipo de metodo deseado:
	 * 1 es Estimacion tiempo
	 * 2 es Estimacion LOC
	 */
	@SuppressWarnings("resource")
	public int obtenerPlanEstimacion() {
		Scanner teclado = new Scanner (System.in);
		while(true) {				
			System.out.println("Escoja lo que desea calcular : ");
			System.out.println("	1. Plan de tamanio a agregar y modificar.");
			System.out.println("	2. Tiempo estimado.");
			System.out.println("	3. Salir.");
			
			String valor = teclado.next();
			valor = valor.trim();
			switch (valor) {
				case "1":
					return 1;
				case "2":
					return 2;
				case "3":
					salir();
				default:
					System.out.println("---- Opcion no encontrada, vuelva a intentarlo.----\n");
					break;
			}
		}		
	}
	
	/**
	 * Obtiene del usuario el proxy estimado
	 * @return el valor entero del proxy estimado
	 * 
	 */
	@SuppressWarnings("resource")
	public int obtenerProxyEstimado() {
		Scanner teclado = new Scanner (System.in);
		while(true) {	
			System.out.println("Ingrese el tamanio del proxy estimado: ");				
			String valor = teclado.next();
			
			if (isNumeric(valor)) { 
				return Integer.parseInt(valor);
			}
			
			System.out.println("---- Valor no es entero, vuelva a ingresarlo.----\n");
		}		
	}
	
	private boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
	
	private void MostrarParametroRegresionB0() throws Exception {	
		System.out.println("");
		System.out.printf(" 	B0 = %.9f", this.metodoProbe.darParametroRegresionB0());	
	}
	
	private void MostrarParametroRegresionB1() throws Exception {
		System.out.println("");
		System.out.printf(" 	B1 = %.9f", this.metodoProbe.darParametroRegresionB1());	
	}
	
	private void MostrarCoeficienteR() throws Exception {
		System.out.println("");
		System.out.printf(" 	r = %.9f", this.metodoProbe.darCoeficienteCorrelacionR());	
	}
	
	private void MostrarCoeficienteRCuadrado() throws Exception {
		System.out.println("");
		double coeficienteR = this.metodoProbe.darCoeficienteCorrelacionR();
		double coeficienteCuadrado = coeficienteR * coeficienteR;
		System.out.printf(" 	r(2) = %.9f", coeficienteCuadrado);	
	}
	
	private void MostrarEstimacion() throws Exception {
		System.out.println("");
		System.out.printf(" 	yk = %.9f", this.metodoProbe.darEstimacion());	
	}
	
	/**
	 * Salir de la aplicacion
	 */
	public void salir() {
		System.exit(0);
	}
	
	/**
	 * Muestra los valores de regresion, coeficientes y estimados segun el metodo escogido
	 * @throws Exception si algun calculo de regresion o coeficiente genera exepciones.
	 */
	public void MostrarValores() throws Exception {
		System.out.println("");
		System.out.println(metodoProbe.toString());
		System.out.println("");
		MostrarParametroRegresionB0();
		MostrarParametroRegresionB1();
		MostrarCoeficienteR();
		MostrarCoeficienteRCuadrado();
		MostrarEstimacion();
		System.out.println("");
	}
	
	/**
	 * Pregunta al usuario si desea continuar con otra estimacion
	 * @return valor entero indicando si desea continuar realizando etimaciones.
	 * 1. Si
	 * 2. No
	 */
	@SuppressWarnings("resource")
	public int continuarOtraEstimacion() {
		Scanner teclado = new Scanner (System.in);
		while(true) {				
			System.out.println("Desea continuar otra estimacion: ");
			System.out.println("	1. Si.");
			System.out.println("	2. No.");
				
			String valor = teclado.next();
			valor = valor.trim();
			switch (valor) {
				case "1":
					return 1;
				case "2":
					salir();
				default:
					System.out.println("---- Opcion no encontrada, vuelva a intentarlo.----\n");
					break;
			}
		}		
	}
	
	/**
	 * Muestra los errores.
	 * @param error: el error a mostrar al usuario.
	 */
	public void  mostrarError(String error) {
		System.out.println("Error = " + error);
	}
}
