package datos;

public class Personaje {

	private String nombre;
	
	private boolean vivo;
	
	public Personaje(String nombre, boolean vivo) {
		super();
		this.nombre = nombre;
		this.vivo = vivo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public boolean isVivo() {
		return vivo;
	}


	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
