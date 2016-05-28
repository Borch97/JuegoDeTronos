package datos;

import java.util.ArrayList;
import datos.Humano;

public class Familia {

	private String nombre;
	
	private String Ubicacion;
	
	private ArrayList<ArrayList<Humano>> familias = new ArrayList<ArrayList<Humano>>();
	
	private ArrayList<Humano> arryn = new ArrayList<Humano>();
	
	private ArrayList<Humano> lannister = new ArrayList<Humano>();
	
	private ArrayList<Humano> stark = new ArrayList<Humano>();
	
	private ArrayList<Humano> baratheon = new ArrayList<Humano>();
	
	private ArrayList<Humano> tully = new ArrayList<Humano>();
	
	private ArrayList<Humano> tirell = new ArrayList<Humano>();
	
	private ArrayList<Humano> targaryen = new ArrayList<Humano>();
	
	private ArrayList<Humano> greyjoy = new ArrayList<Humano>();
	
	public void addFamilias(){
		familias.add(arryn);
		familias.add(lannister);
		familias.add(stark);
		familias.add(baratheon);
		familias.add(tully);
		familias.add(tirell);
		familias.add(targaryen);
		familias.add(greyjoy);
	}
	
		
	
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
