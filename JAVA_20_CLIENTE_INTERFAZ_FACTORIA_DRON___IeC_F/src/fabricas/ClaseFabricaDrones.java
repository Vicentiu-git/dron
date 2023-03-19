package fabricas;
import maquinas.ClaseDrone;

// ELIGE FABRICA CON MÉTODO ESTÁTICO O DE INSTANCIA.

public class ClaseFabricaDrones {

	public static ClaseDrone fabricarDrone() {
		// TODO Auto-generated method stub
		return ClaseDrone.crearDroneInstancia();
		
	}

	// MÉTODO FABRICAR DRONE.
	
	//InterfazControlRemoto control = new ClaseDrone();
	
}
