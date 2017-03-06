package uniandes.ecos.conceptosAvanzados.calculoMetodoProbe.Test;

import uniandes.ecos.conceptosAvanzados.calculoMetodoProbe.modelo.ArchivoEstimar;
import uniandes.ecos.conceptosAvanzados.calculoMetodoProbe.modelo.ParejaDato;
import junit.framework.TestCase;

public class ArchivoEstimarTest  extends TestCase {
	
	/**
	 * Clase ArchivoEstimar testear
	 */
	private ArchivoEstimar archivoEstimar;
	
	/**
	 * Constante donde estan los archivos a testear
	 */
	public static final String rutaArchivo = "./ArchivoProcesarTest/";
		
	/**
     * Este metodo se encarga de verificar si el archivo tiene extension erronea
     * 
     */
    public void testArchivoConExtensionErronea() {
    	try {
    		String archivo = rutaArchivo + "ArchivoExtensionErronea.dat";
    		archivoEstimar = new ArchivoEstimar(archivo);
    		archivoEstimar.darParejaDatosArchivo();
    		fail("Debio fallar: No valido el formato del archivo");
    	}
    	catch(Exception ex) { 		
    		assertEquals( "El mensaje debe coincidir: El archivo debe ser en formato txt", "El archivo debe ser en formato txt", ex.getMessage());
    	}
    }
    
	/**
     * Este metodo se encarga de verificar si el archivo esta vacio
     * 
     */
    public void testArchivoVacio() {
    	try {
    		String archivo = rutaArchivo + "ArchivoVacio.txt";
    		archivoEstimar = new ArchivoEstimar(archivo);
    		archivoEstimar.darParejaDatosArchivo();
    		fail("Debio fallar: No valido si el archivo estaba vacio");
    	}
    	catch(Exception ex) {  		
    		assertEquals( "El mensaje debe coincidir: El archivo esta vacio", "El archivo esta vacio", ex.getMessage());
    	}
    }
	
    /**
     * Este metodo se encarga de verificar si el archivo tiene caracteres
     * 
     */
    public void testArchivoConCaracteres() {
    	try {
    		String archivo = rutaArchivo + "ArchivoConCaracteres.txt";
    		archivoEstimar = new ArchivoEstimar(archivo);
    		archivoEstimar.darParejaDatosArchivo();
    		fail("Debio fallar: archivo con caracteres");
    	}
    	catch(Exception ex) {    	    		
    		assertEquals( "El mensaje debe coincidir: Hay filas con una cantidad diferente de 2 valores reales, deben estar separados por coma y nueva linea con salto de linea.", 
    				"Hay filas con una cantidad diferente de 2 valores reales, deben estar separados por coma y nueva linea con salto de linea.", ex.getMessage());
    	}
    }
    
    /**
     * Este metodo se encarga de verificar si el archivo tiene valor real pero no con un solo dato
     * 
     */
    public void testArchivoConUnSoloDato() {
    	try {
    		String archivo = rutaArchivo + "ArchivoConSoloUnDato.txt";
    		archivoEstimar = new ArchivoEstimar(archivo);
    		archivoEstimar.darParejaDatosArchivo();
    		fail("Debio fallar: archivo con un solo dato");
    	}
    	catch(Exception ex) {    	    		
    		assertEquals( "El mensaje debe coincidir: Hay filas con una cantidad diferente de 2 valores reales, deben estar separados por coma y nueva linea con salto de linea.", 
    				"Hay filas con una cantidad diferente de 2 valores reales, deben estar separados por coma y nueva linea con salto de linea.", ex.getMessage());
    	}
    }
    
    /**
     * Este metodo se encarga de verificar si el archivo tiene valor real pero con mas de 2 datos
     * 
     */
    public void testArchivoConMasDeDosDatos() {
    	try {
    		String archivo = rutaArchivo + "ArchivoConMasDeDosDatos.txt";
    		archivoEstimar = new ArchivoEstimar(archivo);
    		archivoEstimar.darParejaDatosArchivo();
    		fail("Debio fallar: archivo con mas de 2 datos");
    	}
    	catch(Exception ex) {    	    		
    		assertEquals( "El mensaje debe coincidir: Hay filas con una cantidad diferente de 2 valores reales, deben estar separados por coma y nueva linea con salto de linea.", 
    				"Hay filas con una cantidad diferente de 2 valores reales, deben estar separados por coma y nueva linea con salto de linea.", ex.getMessage());
    	}
    }
    
    /**
     * Este metodo se encarga de verificar si el archivo tiene algun valor real menoor o igual a 0
     * Dado que al ser estimaciones y valores debe ser mayor a 0
     * 
     */
    public void testArchivoConValorIgual0() {
    	try {
    		String archivo = rutaArchivo + "ArchivoConDatoIgualCero.txt";
    		archivoEstimar = new ArchivoEstimar(archivo);
    		archivoEstimar.darParejaDatosArchivo();
    		fail("Debio fallar: archivo con algun valor en 0 o menor");
    	}
    	catch(Exception ex) {    	    		
    		assertEquals( "El mensaje debe coincidir: Hay valores menores o iguales a 0, los estimados deben ser mayores a 0.", 
    				"Hay valores menores o iguales a 0, los estimados deben ser mayores a 0.", ex.getMessage());
    	}
    }
    
    /**
     * Este metodo se encarga de verificar si el archivo tiene solo un dato, dado que arrojaria un error
     * para el calculo de la desviacion estandar
     * 
     */
    public void testArchivoValidoMetodoACalcularTamanio() {
    	try {
	    	String archivo = rutaArchivo + "MetodoA_ProxyEstimado_TamanioActual.txt";
	    	archivoEstimar = new ArchivoEstimar(archivo);
	    	ParejaDato datoRaiz = archivoEstimar.darParejaDatosArchivo();
	    	
	    	assertEquals( "1 fila: El primer dato debe ser 130", 130.0, datoRaiz.darValorEstimadoTamanioOPlan());
	    	assertEquals( "1 fila: El seg dato debe ser 186", 186.0, datoRaiz.darValorActualTamanioOPlan());
	    	ParejaDato datoSiguiente = datoRaiz.darParejaSiguiente();
	    	assertEquals( "2 fila: El primer dato debe ser 650", 650.0, datoSiguiente.darValorEstimadoTamanioOPlan());
	    	assertEquals( "2 fila: El seg dato debe ser 699", 699.0, datoSiguiente.darValorActualTamanioOPlan());
	    	datoSiguiente = datoSiguiente.darParejaSiguiente();
	    	assertEquals( "3 fila: El primer dato debe ser 99", 99.0, datoSiguiente.darValorEstimadoTamanioOPlan());
	    	assertEquals( "3 fila: El seg dato debe ser 132", 132.0, datoSiguiente.darValorActualTamanioOPlan());
	    	datoSiguiente = datoSiguiente.darParejaSiguiente();
	    	assertEquals( "4 fila: El primer dato debe ser 150", 150.0, datoSiguiente.darValorEstimadoTamanioOPlan());
	    	assertEquals( "4 fila: El seg dato debe ser 272", 272.0, datoSiguiente.darValorActualTamanioOPlan());
	    	datoSiguiente = datoSiguiente.darParejaSiguiente();
	    	assertEquals( "5 fila: El primer dato debe ser 128", 128.0, datoSiguiente.darValorEstimadoTamanioOPlan());
	    	assertEquals( "5 fila: El seg dato debe ser 291", 291.0, datoSiguiente.darValorActualTamanioOPlan());
	    	datoSiguiente = datoSiguiente.darParejaSiguiente();
	    	assertEquals( "6 fila: El primer dato debe ser 302", 302.0, datoSiguiente.darValorEstimadoTamanioOPlan());
	    	assertEquals( "6 fila: El seg dato debe ser 331", 331.0, datoSiguiente.darValorActualTamanioOPlan());
	    	datoSiguiente = datoSiguiente.darParejaSiguiente();
	    	assertEquals( "7 fila: El primer dato debe ser 95", 95.0, datoSiguiente.darValorEstimadoTamanioOPlan());
	    	assertEquals( "7 fila: El seg dato debe ser 199", 199.0, datoSiguiente.darValorActualTamanioOPlan());
	    	datoSiguiente = datoSiguiente.darParejaSiguiente();
	    	assertEquals( "8 fila: El primer dato debe ser 945", 945.0, datoSiguiente.darValorEstimadoTamanioOPlan());
	    	assertEquals( "8 fila: El seg dato debe ser 1890", 1890.0, datoSiguiente.darValorActualTamanioOPlan());
	    	datoSiguiente = datoSiguiente.darParejaSiguiente();
	    	assertEquals( "9 fila: El primer dato debe ser 368", 368.0, datoSiguiente.darValorEstimadoTamanioOPlan());
	    	assertEquals( "9 fila: El seg dato debe ser 788", 788.0, datoSiguiente.darValorActualTamanioOPlan());
	    	datoSiguiente = datoSiguiente.darParejaSiguiente();
	    	assertEquals( "10 fila: El primer dato debe ser 961", 961.0, datoSiguiente.darValorEstimadoTamanioOPlan());
	    	assertEquals( "10 fila: El seg dato debe ser 1601", 1601.0, datoSiguiente.darValorActualTamanioOPlan());
    	}
    	catch(Exception ex) {
    		ex.printStackTrace();
    		fail("Error :" + ex.getMessage());
    	}
    }	
}


