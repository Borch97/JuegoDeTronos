package Logica;

import java.util.ArrayList;

import datos.Familia;
import datos.Humano;
import datos.Personaje;

public interface IGestion {

	public void AņadirPersonaje(ArrayList<Humano> familia, Personaje personaje);
	
	public void AņadirPersonaje(Personaje personaje);
	
	public void BorrarPersonaje(Personaje personaje);
}
