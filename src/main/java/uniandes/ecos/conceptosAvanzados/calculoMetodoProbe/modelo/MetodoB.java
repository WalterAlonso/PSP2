package uniandes.ecos.conceptosAvanzados.calculoMetodoProbe.modelo;

import java.util.ArrayList;

/**
 * Maneja el metodo B del metodo Probe
 * @author WALONSO
 *
 */
public class MetodoB extends MetodoProbe implements IMetodoProbe {
	
	private TipoEstimacion tipoEstimacion;
	
	/**
	 * Constructor del metodoA de Probe
	 * Precondicion: parejaDato llega con minimo una pareja
	 * @param parejaDato: contiene el conjunto de datos
	 * @param tipoEstimacion: indica ual es el tipo de estimacion a calcular
	 * @param estimadoProxy: el tamanio estimado del proxy
	 */
	public MetodoB(ParejaDato parejaDato, TipoEstimacion tipoEstimacion, int estimadoProxy) {
		this.estimadoProxyXk = estimadoProxy;
		this.listaTamanioOPlanEstimado = new ArrayList<Double>();
		this.listaTamanioOTiempoActual = new ArrayList<Double>();
		this.tipoEstimacion = tipoEstimacion;
		
		transformarEntradasMetodo(parejaDato);
	}
	
	/**
	 * retorna el nombre del metodo y el tipo que se esta calculando
	 * @return el nombre del metodo y el tipo que se esta calculando
	 */
	public String toString() {
		return "Metodo B , tipo " + tipoEstimacion.toString();
	}
	
	/**
	 * Retorna la estimacion teniendo en cuenta el tipo de estimacion
	 * @return el valor de la estimacion
	 */
	public double darEstimacion() throws Exception {		
		if (tipoEstimacion == TipoEstimacion.EstimacionLOC) {
			return darTamanioEstimado();
		}
		return darTiempoEstimado();
	}	
}

