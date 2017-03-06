package uniandes.ecos.conceptosAvanzados.calculoMetodoProbe.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * 
 * Clase que maneja los archivos
 * @author Walter Alonso
 * 
 */
public class ArchivoEstimar {
	
	/**
	 * Ruta del archivo a procesar
	 */
	private String rutaArchivo;
	
	/**
	 * Constructor que cargara el archivo.
	 * @param rutaArchivo la ruta del archivo a procesar.
	 */
	public ArchivoEstimar(String rutaArchivo) {
		this.rutaArchivo = rutaArchivo;
	}
	
	/**
	 * Toma el archivo, lo valida y devuelve el conjunto de datos en el
	 * 
	 * @return Dato utilizando lista enlazada
	 * @throws Exception Al cargar el archivo se realizan validaciones como archivo esta vacio, o el fomrato inadecuado.
	 */
	public ParejaDato darParejaDatosArchivo() throws Exception {
		File archivo = new File(this.rutaArchivo);
		ParejaDato parejaDato = null;
		if(elArchivoExiste(archivo)) {
			if(elArchivoTieneElFormatoCorrecto(archivo)) {
				if(!elArchivoEstaVacio(archivo)) {
					FileReader stream = new FileReader(archivo);
					BufferedReader reader = new BufferedReader( stream);
					parejaDato = asignarParejaDatoSiguiente(reader);
					stream.close();
					reader.close();	
				}
				else {
					throw new Exception("El archivo esta vacio");
				}
			}
			else {
				throw new Exception("El archivo debe ser en formato txt");
			}
		}
		else {
			throw new Exception("No hay archivo que cargar");			
		}		
		
		return parejaDato;
	}
	
	/**
	 * Asigna el dato siguiente por medio de recursividad
	 * @param reader : el reader de los datos
	 * @return el dato que sera la raiz
	 * @throws Exception se valida que las lineas del archivo tengan los datos adecuado para ser cargados.
	 */
	private ParejaDato asignarParejaDatoSiguiente(BufferedReader reader) throws Exception {
		String linea = reader.readLine();
		ParejaDato parejaDato = null;
		if(linea != null) {			
			if(validarExistenciaValores(linea)) {
				parejaDato = obtenerParejaDato(linea);				
				parejaDato.asignarDatoSiguiente(this.asignarParejaDatoSiguiente(reader));
			}
			else
			{
				throw new Exception("Hay filas con una cantidad diferente de 2 valores reales, deben estar separados por coma y nueva linea con salto de linea.");	
			}
		}
		
		return parejaDato;
	}
	
	/**
	 * valida que se cumpla que esten los 2 valores 
	 * @param linea: la linea del documento que se esta validando
	 * @return si son validos los datos.
	 * @throws Exception si vienen en la fila que se esta procesando diferente a 2 valores.
	 */
	private boolean validarExistenciaValores(String linea) throws Exception {
		String[] divisionValores = linea.split(",");		
		if (divisionValores.length != 2) {
			return false;
		}
		
		return true;		
	}
	
	/**
	 * Da la parejaDato de la fila que se esta procesando
	 * @param linea: la linea del documento que se esta procesando
	 * @return ParejaDato de la actual linea que se esta procesando
	 * @throws Exception si hay valores que no sean reales o que sean menor iguales a 0.
	 * Esto porque toda estimacion o demas debe ser positiva.
	 */
	private ParejaDato obtenerParejaDato(String linea) throws Exception {
		ParejaDato parejaDato = new ParejaDato();
		String[] divisionValores = linea.split(",");
		double valorUno = darValorReal(divisionValores[0]);
		double valorDos = darValorReal(divisionValores[1]);
		
		if (validarValoresMenores0(valorUno) && validarValoresMenores0(valorDos)) {
			parejaDato.asignarValorEstimadoTamanioOPlan(valorUno);
			parejaDato.asignarValorActualTamanioOPlan(valorDos);
		}
		
		return parejaDato;
	}
	
	/**
	 * Indica si son validos los valores de la linea que se esta procesando
	 * @param valor: el valor a analizar
	 * @return true si los datos son validos (mayores a 0)
	 * @throws Exception si el vaor es menor o igual a 0
	 */
	private boolean validarValoresMenores0(double valor) throws Exception {
		if (valor <= 0) {
			throw new Exception("Hay valores menores o iguales a 0, los estimados deben ser mayores a 0.");
		}
		return true;			
	}

	
	/**
	 * valida que el archivo exista
	 * @return true si el archivo existe o false si no existe
	 */
	private boolean elArchivoExiste(File archivo) {		
		if(archivo.exists()) {
			return true;
		}		
		
		return false;			
	}
	
	/**
	 * Valida que el archivo se pueda leer y que sea un archivo plano txt
	 * @param archivo: el archivo que se va a cargar
	 * @return true si es valido o false si no es valido.
	 */
	private boolean elArchivoTieneElFormatoCorrecto(File archivo) {
		String nombreArchivo = archivo.getName();
		if(archivo.canRead()) {
			if(nombreArchivo.toLowerCase().endsWith(".txt")) {
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * Valida si el archivo tiene datos
	 * @return true si tiene datos, false si no tiene datos.
	 * @throws Exception si hay problema con la lectura de archivos
	 */
	private boolean elArchivoEstaVacio(File archivo) throws Exception {		
		FileReader stream = new FileReader(archivo);
		BufferedReader reader = new BufferedReader( stream);
		String line = reader.readLine();
		boolean esVacio = false;
		if(line == null) {
			esVacio = true;
		}
		
		reader.close();
		stream.close();
		
		return esVacio;		
	}
	
	/**
	 * Valida si el archivo tiene el formato correcto
	 * @return true si el dato es un numero real con el formato apropiado o false si no.
	 * @throws Exception si no puede asignar el valor double
	 */
	private double darValorReal(String dato) throws Exception {
		try {
			return Double.parseDouble(dato);
		}
		catch(Exception ex) {
			throw new Exception("Hay un valor que no es numero real.");
		}
	}
	

}
