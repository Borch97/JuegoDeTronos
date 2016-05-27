package Logica;

import java.util.ArrayList;

import datos.Familia;
import datos.Humano;
import datos.Personaje;

public interface IGestion {

	public void AñadirPersonaje(ArrayList<Humano> familia, Personaje personaje);
	
	public void AñadirPersonaje(Personaje personaje);
	
	public void BorrarPersonaje(Personaje personaje);
}
