package ejercito;
import controladores.InterfazControlRemoto;
import fabricas.ClaseFabricaDrones;



public class Soldado {

	InterfazControlRemoto control = ClaseFabricaDrones.fabricarDrone();
 
	//creamos un control remoto para fabricar un drone y usar sus métodos
	
	public void volarDron() {
		 control.volar();
	}
	
	public void aterrizarDron() {
		 control.aterrizar();
	}
	
	public void dispararDron() {
		 control.disparar();
	}
	
	public void activarDesactivarCamara() {
		 control.activarDesactivar(true);
	}
}
