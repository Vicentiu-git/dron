package controladores;


public interface InterfazControlRemoto {

	// public abstract. Interfaz con los métodos
	
	//VOLAR
	public void volar();
		
	//ATERRIZAR
	public void aterrizar();
		
	//DISPARAR
	public boolean disparar();
	
	//ACTIVAR/DESACTIVAR CAMARA
	public boolean activarDesactivar(boolean onOff);
	
}
