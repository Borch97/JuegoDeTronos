package datos;

import java.util.ArrayList;

public class Familia {

	private String nombre;
	
	private String Ubicacion;
	
	public Familia(String nombre, String ubicacion) {
		super();
		this.nombre = nombre;
		Ubicacion = ubicacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return Ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		Ubicacion = ubicacion;
	}

	public boolean buscarMiembroFamilia(String nombre, ArrayList<Humano> familia){
		boolean enc = false;
		for (Humano humano : familia) {
			if(humano.equals(nombre)){
				enc = true;
				break;
			}
		}
		return enc;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
