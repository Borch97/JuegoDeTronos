package Logica;

import java.util.ArrayList;

import datos.Familia;
import datos.Humano;
import datos.Personaje;

public interface IGestion {

	public void A�adirPersonaje(ArrayList<Humano> familia, Personaje personaje);
	
	public void A�adirPersonaje(Personaje personaje);
	
	public void BorrarPersonaje(Personaje personaje);
}
