/************************************************************/
Codigo curso: CSOF5101 - 2017.
Nombre curso: CONCEPTOS AVANZADOS EN INGENIERIA DE SOFTWARE.
Nombre de la tarea: Assignment Kit for Program 2.
Fecha de envío de la tarea: 6 Marzo 2017 (03:03), GithHub: 6 Marzo 2017. (23:23)
Autor: Walter Javier Alonso Roa
/************************************************************/


¨** Descripcion:
Primero se debe colocar el archivo a procesar en la carpeta "ArchivoProcesar". (deben ser txt),
el codigo fuente se encuentra en el repo: https://github.com/WalterAlonso/PSP2.git

** Ambiente de ejecucion:
Este programa fue realizado con JRE 1.7 en S.O 7.
Debe tener instalado Maven


**************** Instrucciones de ejecucion ************************
** clone repo desde github.
$git clone https://github.com/WalterAlonso/PSP2.git

** Ingresar al folder PSP2
  	cd PSP2

** Ejecucion maven

	 mvn clean install

** Ejecute el programa:

	java -cp target/Ecos_CalculoEstimacionMetodoProbeAyB-1.0-SNAPSHOT.jar uniandes.ecos.conceptosAvanzados.calculoMetodoProbe.controlador.Probe "Nombre archivo.txt"

** Heroku:

