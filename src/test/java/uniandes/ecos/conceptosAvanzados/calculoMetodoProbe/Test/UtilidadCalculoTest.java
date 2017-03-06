package uniandes.ecos.conceptosAvanzados.calculoMetodoProbe.Test;

import java.util.ArrayList;

import junit.framework.TestCase;
import uniandes.ecos.conceptosAvanzados.calculoMetodoProbe.modelo.UtilidadCalculo;

/**
 * Se encarga de validar la clase que realiza las operaciones matematicas
 * @author WALONSO
 *
 */
public class UtilidadCalculoTest extends TestCase {
	
	/**
	 * Valida que se calcule correctamente el promedio 	
	 */
	public void testValidarPromedio() {
    	try {
    		ArrayList<Double> listaDatos = new ArrayList<Double>();
    		listaDatos.add(1.0);
    		listaDatos.add(2.8);
    		listaDatos.add(4.7);
    		listaDatos.add(0.2);
    		
    		double promedio = UtilidadCalculo.darPromedio(listaDatos);    		    		
    		assertEquals( "El promedio debe ser 2.175 ", 2.175, promedio);
    		
    	}
    	catch(Exception ex) { 		
    		fail("Se genero excepcion "+ ex.getMessage());
    	}
    }
	
	/**
	 * Valida que se calcule correctamente el promedio 	con un solo dato
	 */
	public void testValidarPromedioUnDato() {
    	try {
    		ArrayList<Double> listaDatos = new ArrayList<Double>();
    		listaDatos.add(2.8);
    		
    		double promedio = UtilidadCalculo.darPromedio(listaDatos);    		    		
    		assertEquals( "El promedio debe ser 2.8 ", 2.8, promedio);
    		
    	}
    	catch(Exception ex) { 		
    		fail("Se genero excepcion "+ ex.getMessage());
    	}
    }
    
	/**
	 * Valida que se este realizando correctamente la suma de una lista
	 */
	public void testValidarSumatoria() {
    	try {
    		ArrayList<Double> listaDatos = new ArrayList<Double>();
    		listaDatos.add(1.0);
    		listaDatos.add(2.8);
    		listaDatos.add(4.7);
    		listaDatos.add(0.2);
    		
    		double sumatoria = UtilidadCalculo.darSumatoria(listaDatos);    		    		
    		assertEquals( "La sumatoria debe ser 8.7 ", 8.7, sumatoria);
    		
    	}
    	catch(Exception ex) { 		
    		fail("Se genero excepcion "+ ex.getMessage());
    	}
    }
	
	/**
	 * Valida que se este realizando correctamente la suma de una lista con un solo dato
	 */
	public void testValidarSumatoriaConUnSoloDato() {
    	try {
    		ArrayList<Double> listaDatos = new ArrayList<Double>();    		
    		listaDatos.add(4.7);
    		
    		double sumatoria = UtilidadCalculo.darSumatoria(listaDatos);    		    		
    		assertEquals( "La sumatoria debe ser 4.7 ", 4.7, sumatoria);
    		
    	}
    	catch(Exception ex) { 		
    		fail("Se genero excepcion "+ ex.getMessage());
    	}
    }
	
	/**
	 * Valida que se este realizando correctamente la suma de dos listas multiplicandose
	 */
	public void testValidarSumatoriaFactores() {
    	try {
    		ArrayList<Double> listaDatosUno = new ArrayList<Double>();    		
    		listaDatosUno.add(1.0);
    		listaDatosUno.add(2.8);
    		listaDatosUno.add(4.7);
    		listaDatosUno.add(0.2);
    		
    		ArrayList<Double> listaDatosDos = new ArrayList<Double>();    		
    		listaDatosDos.add(5.9);
    		listaDatosDos.add(2.4);
    		listaDatosDos.add(3.0);
    		listaDatosDos.add(0.8);
    		    		
    		double sumatoria = UtilidadCalculo.darSumatoriaFactores(listaDatosUno, listaDatosDos);     		
    		assertEquals( "La sumatoria de factores  debe ser 26.880000000000003 ", 26.880000000000003, sumatoria);
    	}
    	catch(Exception ex) { 		
    		fail("Se genero excepcion "+ ex.getMessage());
    	}
    }
	
	
	/**
	 * Valida que se este realizando correctamente la suma de dos listas multiplicandose
	 * con un dato
	 */
	public void testValidarSumatoriaFactoresConUnDato() {
    	try {
    		ArrayList<Double> listaDatosUno = new ArrayList<Double>(); 
    		listaDatosUno.add(0.2);    		
    		ArrayList<Double> listaDatosDos = new ArrayList<Double>();    		
    		listaDatosDos.add(5.9);
    		
    		double sumatoria = UtilidadCalculo.darSumatoriaFactores(listaDatosUno, listaDatosDos);     		
    		assertEquals( "La sumatoria de factores debe ser 1.1800000000000002 ", 1.1800000000000002, sumatoria);
    		
    	}
    	catch(Exception ex) { 		
    		fail("Se genero excepcion "+ ex.getMessage());
    	}
    }
	
	/**
	 * Valida que se este realizando correctamente la suma al cuadrado de la lista
	 */
	public void testValidarSumatoriaCuadrada() {
    	try {
    		ArrayList<Double> listaDatosUno = new ArrayList<Double>();    		
    		listaDatosUno.add(1.0);
    		listaDatosUno.add(2.8);
    		listaDatosUno.add(4.7);
    		listaDatosUno.add(0.2);
    		
    		double sumatoria = UtilidadCalculo.darSumatoriaCuadrada(listaDatosUno);     		
    		assertEquals( "La sumatoria cuadrada  debe ser 30.970000000000002 ", 30.970000000000002, sumatoria);
    		
    	}
    	catch(Exception ex) { 		
    		fail("Se genero excepcion "+ ex.getMessage());
    	}
    }
		
	/**
	 * Valida que se este realizando correctamente la suma al cuadrado de la lista
	 */
	public void testValidarSumatoriaCuadradaConUnDato() {
    	try {
    		ArrayList<Double> listaDatosUno = new ArrayList<Double>();    		
    		listaDatosUno.add(1.0);
    		
    		double sumatoria = UtilidadCalculo.darSumatoriaCuadrada(listaDatosUno);     		
    		assertEquals( "La sumatoria cuadrada  debe ser 1.0 ", 1.0, sumatoria);
    		
    	}
    	catch(Exception ex) { 		
    		fail("Se genero excepcion "+ ex.getMessage());
    	}
    }

}
