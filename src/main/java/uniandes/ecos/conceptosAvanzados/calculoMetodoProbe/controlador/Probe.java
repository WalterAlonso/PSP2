/**
 * Proposito:     Calcular el estimado tamanio o plan de LOC segun el metodo
 * 				  Probe sea A o B.
 * Autor(s):   Walter Javier Alonso Roa.
 * Fecha creacion: 05 Marzo 2017
 * Modificado por: Walter Javier Alonso Roa 
 * Ultima modificacion: 05 Marzo 2017
*/

package uniandes.ecos.conceptosAvanzados.calculoMetodoProbe.controlador;

import uniandes.ecos.conceptosAvanzados.calculoMetodoProbe.modelo.ArchivoEstimar;
import uniandes.ecos.conceptosAvanzados.calculoMetodoProbe.modelo.IMetodoProbe;
import uniandes.ecos.conceptosAvanzados.calculoMetodoProbe.modelo.MetodoA;
import uniandes.ecos.conceptosAvanzados.calculoMetodoProbe.modelo.MetodoB;
import uniandes.ecos.conceptosAvanzados.calculoMetodoProbe.modelo.ParejaDato;
import uniandes.ecos.conceptosAvanzados.calculoMetodoProbe.modelo.TipoEstimacion;
import uniandes.ecos.conceptosAvanzados.calculoMetodoProbe.vista.ProbeVista;

/**
 * Clase principal que inicia el programa, de calculo metodo Probe.
 * @author WALONSO
 *
 */
public class Probe {

	/**
	 * Metodo principal que se encarga de centralizar las interacciones con el usuario y mostrar
	 * los resultados.
	 * @param args: debe contener la ruta del archivo a procesar
	 */
	public static void main(String[] args) {
		ProbeVista vista = new ProbeVista();
		try
		{		
			if(args.length < 1) {
				throw new Exception("No tiene argumentos, debe ingresar la ruta del archivo");
			}
			
			String archivo = "./ArchivoProcesar/" + args[0];
			ArchivoEstimar archivoEstimar = new ArchivoEstimar(archivo);
			ParejaDato parejaDatoRaiz = archivoEstimar.darParejaDatosArchivo();
			
			while (true) {
				
				IMetodoProbe metodoProbe = obtenerElMetodo(vista, parejaDatoRaiz);
				vista.asignarMetodo(metodoProbe);
				vista.MostrarValores();
				
				vista.continuarOtraEstimacion();				
			}
		}
		catch(Exception ex) {				
			vista.mostrarError(ex.getMessage());
		}
	}
	
	private static IMetodoProbe obtenerElMetodo(ProbeVista vista, ParejaDato parejaDatoRaiz) {
		IMetodoProbe metodoProbe = null;
		// la vista retorna el metodo a analizar (1=A y 2=B)
		int metodo = vista.obtenerMetodoCrear();
		// la vista retorna el tipo de estimacion ( 1=Estimacion tiempo, 2=Estimacion LOC)
		int tipoEstimacionUsuario = vista.obtenerPlanEstimacion();
		int proxyEstimado = vista.obtenerProxyEstimado();
		
		TipoEstimacion tipoEstimacion = TipoEstimacion.EstimacionLOC;
		if (tipoEstimacionUsuario == 1) {
			tipoEstimacion = TipoEstimacion.EstimacionTiempoDesarrollo;
		}
		
		if (metodo == 1) {				
			metodoProbe = new MetodoA(parejaDatoRaiz, tipoEstimacion, proxyEstimado);
		}
		else {
			metodoProbe = new MetodoB(parejaDatoRaiz, tipoEstimacion, proxyEstimado);
		}
		return metodoProbe;
	}

}
