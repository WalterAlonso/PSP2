package uniandes.ecos.conceptosAvanzados.calculoMetodoProbe.Test;

import junit.framework.TestCase;
import uniandes.ecos.conceptosAvanzados.calculoMetodoProbe.modelo.MetodoA;
import uniandes.ecos.conceptosAvanzados.calculoMetodoProbe.modelo.MetodoB;
import uniandes.ecos.conceptosAvanzados.calculoMetodoProbe.modelo.ParejaDato;
import uniandes.ecos.conceptosAvanzados.calculoMetodoProbe.modelo.TipoEstimacion;

/**
 * Valida la clase Metodo Probe
 * @author WALONSO
 *
 */
public class MetodoProbeTest extends TestCase {

	private ParejaDato parejaDato;
	/**
     * Incializa el metodo A teniendo en cuenta el estimado y lo actual 
     */
    private void setupInicializarMetodoA_CalcularTamanioPlan( ) {
        
    	parejaDato = new ParejaDato();
    	parejaDato.asignarValorEstimadoTamanioOPlan(130.0);
    	parejaDato.asignarValorActualTamanioOPlan(186.0);
    	ParejaDato parejaEstimadoYActualDos = new ParejaDato();
    	parejaEstimadoYActualDos.asignarValorEstimadoTamanioOPlan(650.0);
    	parejaEstimadoYActualDos.asignarValorActualTamanioOPlan(699.0);
    	ParejaDato parejaEstimadoYActualTres = new ParejaDato();
    	parejaEstimadoYActualTres.asignarValorEstimadoTamanioOPlan(99.0);
    	parejaEstimadoYActualTres.asignarValorActualTamanioOPlan(132.0);
    	ParejaDato parejaEstimadoYActualCuatro = new ParejaDato();
    	parejaEstimadoYActualCuatro.asignarValorEstimadoTamanioOPlan(150.0);
    	parejaEstimadoYActualCuatro.asignarValorActualTamanioOPlan(272.0);
    	ParejaDato parejaEstimadoYActualCinco = new ParejaDato();
    	parejaEstimadoYActualCinco.asignarValorEstimadoTamanioOPlan(128.0);
    	parejaEstimadoYActualCinco.asignarValorActualTamanioOPlan(291.0);
    	ParejaDato parejaEstimadoYActualSeis = new ParejaDato();
    	parejaEstimadoYActualSeis.asignarValorEstimadoTamanioOPlan(302.0);
    	parejaEstimadoYActualSeis.asignarValorActualTamanioOPlan(331.0);
    	ParejaDato parejaEstimadoYActualSiete = new ParejaDato();
    	parejaEstimadoYActualSiete.asignarValorEstimadoTamanioOPlan(95.0);
    	parejaEstimadoYActualSiete.asignarValorActualTamanioOPlan(199.0);
    	ParejaDato parejaEstimadoYActualOcho = new ParejaDato();    	
    	parejaEstimadoYActualOcho.asignarValorEstimadoTamanioOPlan(945.0);
    	parejaEstimadoYActualOcho.asignarValorActualTamanioOPlan(1890.0);
    	ParejaDato parejaEstimadoYActualNueve = new ParejaDato();
    	parejaEstimadoYActualNueve.asignarValorEstimadoTamanioOPlan(368.0);
    	parejaEstimadoYActualNueve.asignarValorActualTamanioOPlan(788.0);
    	ParejaDato parejaEstimadoYActualDiez = new ParejaDato();
    	parejaEstimadoYActualDiez.asignarValorEstimadoTamanioOPlan(961.0);
    	parejaEstimadoYActualDiez.asignarValorActualTamanioOPlan(1601.0);
    	parejaDato.asignarDatoSiguiente(parejaEstimadoYActualDos);
    	parejaEstimadoYActualDos.asignarDatoSiguiente(parejaEstimadoYActualTres);
    	parejaEstimadoYActualTres.asignarDatoSiguiente(parejaEstimadoYActualCuatro);
    	parejaEstimadoYActualCuatro.asignarDatoSiguiente(parejaEstimadoYActualCinco);
    	parejaEstimadoYActualCinco.asignarDatoSiguiente(parejaEstimadoYActualSeis);
    	parejaEstimadoYActualSeis.asignarDatoSiguiente(parejaEstimadoYActualSiete);
    	parejaEstimadoYActualSiete.asignarDatoSiguiente(parejaEstimadoYActualOcho);
    	parejaEstimadoYActualOcho.asignarDatoSiguiente(parejaEstimadoYActualNueve);
    	parejaEstimadoYActualNueve.asignarDatoSiguiente(parejaEstimadoYActualDiez);
    	    	
    }
	
    /**
     * Incializa el metodo B teniendo en cuenta el tamanio planeado y tiempo actual 
     */
    private void setupInicializarMetodoB_CalcularTiempo( ) {
        
    	
    	parejaDato = new ParejaDato();
    	parejaDato.asignarValorEstimadoTamanioOPlan(163.0);
    	parejaDato.asignarValorActualTamanioOPlan(15.0);
    	ParejaDato parejaEstimadoYActualDos = new ParejaDato();
    	parejaEstimadoYActualDos.asignarValorEstimadoTamanioOPlan(765.0);
    	parejaEstimadoYActualDos.asignarValorActualTamanioOPlan(69.9);
    	ParejaDato parejaEstimadoYActualTres = new ParejaDato();
    	parejaEstimadoYActualTres.asignarValorEstimadoTamanioOPlan(141.0);
    	parejaEstimadoYActualTres.asignarValorActualTamanioOPlan(6.5);
    	ParejaDato parejaEstimadoYActualCuatro = new ParejaDato();
    	parejaEstimadoYActualCuatro.asignarValorEstimadoTamanioOPlan(166.0);
    	parejaEstimadoYActualCuatro.asignarValorActualTamanioOPlan(22.4);
    	ParejaDato parejaEstimadoYActualCinco = new ParejaDato();
    	parejaEstimadoYActualCinco.asignarValorEstimadoTamanioOPlan(137.0);
    	parejaEstimadoYActualCinco.asignarValorActualTamanioOPlan(28.4);
    	ParejaDato parejaEstimadoYActualSeis = new ParejaDato();
    	parejaEstimadoYActualSeis.asignarValorEstimadoTamanioOPlan(355.0);
    	parejaEstimadoYActualSeis.asignarValorActualTamanioOPlan(65.9);
    	ParejaDato parejaEstimadoYActualSiete = new ParejaDato();
    	parejaEstimadoYActualSiete.asignarValorEstimadoTamanioOPlan(136.0);
    	parejaEstimadoYActualSiete.asignarValorActualTamanioOPlan(19.4);
    	ParejaDato parejaEstimadoYActualOcho = new ParejaDato();    	
    	parejaEstimadoYActualOcho.asignarValorEstimadoTamanioOPlan(1206.0);
    	parejaEstimadoYActualOcho.asignarValorActualTamanioOPlan(198.7);
    	ParejaDato parejaEstimadoYActualNueve = new ParejaDato();
    	parejaEstimadoYActualNueve.asignarValorEstimadoTamanioOPlan(433.0);
    	parejaEstimadoYActualNueve.asignarValorActualTamanioOPlan(38.8);
    	ParejaDato parejaEstimadoYActualDiez = new ParejaDato();
    	parejaEstimadoYActualDiez.asignarValorEstimadoTamanioOPlan(1130.0);
    	parejaEstimadoYActualDiez.asignarValorActualTamanioOPlan(138.2);
    	parejaDato.asignarDatoSiguiente(parejaEstimadoYActualDos);
    	parejaEstimadoYActualDos.asignarDatoSiguiente(parejaEstimadoYActualTres);
    	parejaEstimadoYActualTres.asignarDatoSiguiente(parejaEstimadoYActualCuatro);
    	parejaEstimadoYActualCuatro.asignarDatoSiguiente(parejaEstimadoYActualCinco);
    	parejaEstimadoYActualCinco.asignarDatoSiguiente(parejaEstimadoYActualSeis);
    	parejaEstimadoYActualSeis.asignarDatoSiguiente(parejaEstimadoYActualSiete);
    	parejaEstimadoYActualSiete.asignarDatoSiguiente(parejaEstimadoYActualOcho);
    	parejaEstimadoYActualOcho.asignarDatoSiguiente(parejaEstimadoYActualNueve);
    	parejaEstimadoYActualNueve.asignarDatoSiguiente(parejaEstimadoYActualDiez);
    	    	
    }
    
	/**
	 * Valida que se calcule correctamente el valor de regresion b0 en metodo A	
	 */
	public void testValidarParametroRegresionB0MetodoA() {
    	try {
    		setupInicializarMetodoA_CalcularTamanioPlan();
    		MetodoA metodo = new MetodoA(parejaDato, TipoEstimacion.EstimacionLOC, 386);
    		double b0 = metodo.darParametroRegresionB0();
    		assertEquals( "Regresion B0 debe ser -22.552532752034267", -22.552532752034267, b0);
    		
    	}
    	catch(Exception ex) { 		
    		fail("Se genero excepcion "+ ex.getMessage());
    	}
    }
	
	/**
	 * Valida que se calcule correctamente el valor de regresion b0 en metodo B	
	 */
	public void testValidarParametroRegresionB0MetodoB() {
    	try {
    		setupInicializarMetodoB_CalcularTiempo();
    		MetodoB metodo = new MetodoB(parejaDato, TipoEstimacion.EstimacionTiempoDesarrollo, 386);
    		double b0 = metodo.darParametroRegresionB0();
    		assertEquals( "Regresion B0 debe ser -4.6037454233089505", -4.6037454233089505, b0);
    		
    	}
    	catch(Exception ex) { 		
    		fail("Se genero excepcion "+ ex.getMessage());
    	}
    }
	
	/**
	 * Valida que se calcule correctamente el valor de regresion b1 en metodo A	
	 */
	public void testValidarParametroRegresionB1MetodoA() {
    	try {
    		setupInicializarMetodoA_CalcularTamanioPlan();
    		MetodoA metodo = new MetodoA(parejaDato, TipoEstimacion.EstimacionLOC, 386);
    		double b1 = metodo.darParametroRegresionB1();
    		assertEquals( "Regresion B1 debe ser 1.727932426206986", 1.727932426206986, b1);
    		
    	}
    	catch(Exception ex) { 		
    		fail("Se genero excepcion "+ ex.getMessage());
    	}
    }
	
	/**
	 * Valida que se calcule correctamente el valor de regresion b1 en metodo B	
	 */
	public void testValidarParametroRegresionB1MetodoB() {
    	try {
    		setupInicializarMetodoB_CalcularTiempo();
    		MetodoB metodo = new MetodoB(parejaDato, TipoEstimacion.EstimacionTiempoDesarrollo, 386);
    		double b1 = metodo.darParametroRegresionB1();
    		assertEquals( "Regresion B1 debe ser 0.14016352638883628", 0.14016352638883628, b1);
    		
    	}
    	catch(Exception ex) { 		
    		fail("Se genero excepcion "+ ex.getMessage());
    	}
    }
	
	/**
	 * Valida que se calcule correctamente el coeficiente correlacion r en metodo A	
	 */
	public void testValidarCoeficienteCorrelacionRMetodoA() {
    	try {
    		setupInicializarMetodoA_CalcularTamanioPlan();
    		MetodoA metodo = new MetodoA(parejaDato, TipoEstimacion.EstimacionLOC, 386);
    		double r = metodo.darCoeficienteCorrelacionR();
    		assertEquals( "coeficiente correlacion R debe ser 0.9544965741046826", 0.9544965741046826, r);
    		
    	}
    	catch(Exception ex) { 		
    		fail("Se genero excepcion "+ ex.getMessage());
    	}
    }
	
	/**
	 * * Valida que se calcule correctamente el coeficiente correlacion r en metodo B
	 */
	public void testValidarCoeficienteCorrelacionRMetodoB() {
    	try {
    		setupInicializarMetodoB_CalcularTiempo();
    		MetodoB metodo = new MetodoB(parejaDato, TipoEstimacion.EstimacionTiempoDesarrollo, 386);
    		double r = metodo.darCoeficienteCorrelacionR();
    		assertEquals( "coeficiente correlacion R debe ser 0.9480329874300507", 0.9480329874300507, r);
    		
    	}
    	catch(Exception ex) { 		
    		fail("Se genero excepcion "+ ex.getMessage());
    	}
    }
	
	/**
	 * Valida que se calcule correctamente el tamanio en metodo A	
	 */
	public void testValidarEstimadoTamanioMetodoA() {
    	try {
    		setupInicializarMetodoA_CalcularTamanioPlan();
    		MetodoA metodo = new MetodoA(parejaDato, TipoEstimacion.EstimacionLOC, 386);
    		double yk = metodo.darEstimacion();
    		assertEquals( "Valor yk debe ser 644.4293837638623", 644.4293837638623, yk);
    		
    	}
    	catch(Exception ex) { 		
    		fail("Se genero excepcion "+ ex.getMessage());
    	}
    }
	
	/**
	 * * Valida que se calcule correctamente el tiempo en metodo B
	 */
	public void testValidarEstimadoTiempoMetodoB() {
    	try {
    		setupInicializarMetodoB_CalcularTiempo();
    		MetodoB metodo = new MetodoB(parejaDato, TipoEstimacion.EstimacionTiempoDesarrollo, 386);
    		double yk = metodo.darEstimacion();
    		assertEquals( "Valor yk debe ser 49.49937576278185", 49.49937576278185, yk);
    		
    	}
    	catch(Exception ex) { 		
    		fail("Se genero excepcion "+ ex.getMessage());
    	}
    }
}
