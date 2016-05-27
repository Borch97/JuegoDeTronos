package Logica;

import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.ArrayList;

import datos.Familia;
import datos.Humano;
import datos.Personaje;

public class Gestion implements IGestion{

	private ArrayList<Familia> familia;
	
	private ArrayList<Personaje> personajes;
	

	@Override
	public void AñadirPersonaje(ArrayList<Humano> familia, Personaje personaje) {
		try{
			for (int i = 0;i<familia.size();i++) {
				if(familia.get(i) == null){
					familia.add(i, (Humano) personaje);
			}
		}
		}catch(InvalidParameterException e){
			System.out.println(e);
		}
		
	}


	@Override
	public void AñadirPersonaje(Personaje personaje) {
		for (int i = 0;i<personajes.size();i++) {
			if(personajes.get(i) == null){
				personajes.add(i, personaje);
			}
		}
		
	}


	@Override
	public void BorrarPersonaje(Personaje personaje) {
		for (int i = 0;i<personajes.size();i++) {
			if(personajes.get(i).equals(personaje)){
				personajes.remove(i);
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}




}
