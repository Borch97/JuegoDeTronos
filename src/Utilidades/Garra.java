package Utilidades;

import java.util.Random;

import datos.Personaje;

public class Garra {

	public int aleatorio(){
		int min = 0; int max = 1;
		Random random = new Random();
		int aleatorio = (int)random.nextInt(max - min + 1) + min;
		return aleatorio;
	}	
	
	public boolean vidaMuerte(Personaje personaje){
		int a = aleatorio();
		boolean muere = false;
		if(a == 1){
			muere = true;
		}
		return muere;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
