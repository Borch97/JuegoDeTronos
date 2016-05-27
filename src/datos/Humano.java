package datos;

import java.util.Date;

public class Humano extends Personaje {

	private String sexo;
	
	private Date fechaNacimiento;
	
	public Humano(String nombre, boolean vivo, String sexo, Date fechaNacimiento) {
		super(nombre, vivo);
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
