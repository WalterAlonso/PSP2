package uniandes.ecos.conceptosAvanzados.calculoMetodoProbe.modelo;

/**
 * Clase que contendra los datos a ser analizados
 * @author Walter Alonso
 *
 */
public class ParejaDato {
	
	/**
	 * Valor de estimado
	 */
	private double valorEstimadoTamanioOPlan;
	
	/**
	 * valor tamanio actual
	 */
	private double valorActualTamanioOPlan;
	
	/**
	 * Dato siguiente
	 */
	private ParejaDato parejaSiguiente;
	
	/**
	 * retorna el valor estimado
	 * @return el valor alor estimado
	 */
	public double darValorEstimadoTamanioOPlan() {
		return valorEstimadoTamanioOPlan;
	}
	
	/**
	 * da el valor actual de tamanio ingresado
	 * @return el valor actual de tamanio ingresado
	 */
	public double darValorActualTamanioOPlan() {
		return valorActualTamanioOPlan;
	}
	
	/**
	 * Retorna valor siguiente
	 * @return el valor siguiente
	 */
	public ParejaDato darParejaSiguiente() {
		return parejaSiguiente;
	}
	
	/**
	 * Asigna el valor estimado
	 * @param valor : numero real a asignar
	 */
	public void asignarValorEstimadoTamanioOPlan(double valor) {
		this.valorEstimadoTamanioOPlan = valor; 
	}
	
	/**
	 * Asigna el valor actual
	 * @param valor : numero real a asignar
	 */
	public void asignarValorActualTamanioOPlan(double valor) {
		this.valorActualTamanioOPlan = valor;
	}
	
	/**
	 * Asigna el dato siguiente (por medio de auntador) 
	 * @param datoSiguiente : el dato siguiente.
	 */
	public void asignarDatoSiguiente(ParejaDato datoSiguiente) {
		this.parejaSiguiente = datoSiguiente;
	}
}
