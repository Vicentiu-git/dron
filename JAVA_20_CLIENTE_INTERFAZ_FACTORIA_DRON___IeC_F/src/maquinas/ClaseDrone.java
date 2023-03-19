package maquinas;
import controladores.InterfazControlRemoto;


public class ClaseDrone implements InterfazControlRemoto{

	private ClaseDrone() {
		
	}

	public static ClaseDrone crearDroneInstancia() {
		return new ClaseDrone();
	}
	
	
	// MÉTODOS DE NEGOCIO ... ¿QUÉ SABE HACER?
	
	@Override
	public void volar() {
		
		System.out.println("El dron está volando");
		
	}

	@Override
	public void aterrizar() {
		
		System.out.println("El dron está aterrizando");
		
	}

	@Override
	public boolean disparar() {
		
		System.out.println("Disparando");
		
		return false;
	}

	@Override
	public boolean activarDesactivar(boolean onOff) {
		
		System.out.println("Activando la cámara");
		
		return false;
	}

}
