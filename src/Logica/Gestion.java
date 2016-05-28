package Logica;

import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.ArrayList;

import Utilidades.Garra;
import datos.Familia;
import datos.Humano;
import datos.Personaje;

public class Gestion extends Thread implements IGestion {

	private ArrayList<Familia> familia = new ArrayList<Familia>();
	
	private ArrayList<Personaje> personajes = new ArrayList<Personaje>();

	private ArrayList<ArrayList<Humano>> familias = new ArrayList<ArrayList<Humano>>();
	
	private ArrayList<Humano> arryn = new ArrayList<Humano>();
	
	private ArrayList<Humano> lannister = new ArrayList<Humano>();
	
	private ArrayList<Humano> stark = new ArrayList<Humano>();
	
	private ArrayList<Humano> baratheon = new ArrayList<Humano>();
	
	private ArrayList<Humano> tully = new ArrayList<Humano>();
	
	private ArrayList<Humano> tirell = new ArrayList<Humano>();
	
	private ArrayList<Humano> targaryen = new ArrayList<Humano>();
	
	private ArrayList<Humano> greyjoy = new ArrayList<Humano>();
	
	private int total;
	
	private int vivos;
	
	private int muertos = total - vivos;
	
	private int viv;
	
	private ArrayList<Integer> simulacion = new ArrayList<Integer>();
	
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
	public Gestion(){}

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
	
	public void contar(){
		for (int i=0; i<familias.size();i++){
            ArrayList<Humano> fam=(ArrayList<Humano>) familias.get(i);
            for (int j=0; j<fam.size(); j++){
            	Humano hum = (Humano) fam.get(j);
            	total++;
            	if(hum.isVivo()){
            		vivos++;
            	}
            	}
            }
		for (Personaje personaje : personajes) {
			total++;
			if(personaje.isVivo())
				vivos++;
		}
	}
	
	
	public void simulacion(){
		Garra g = new Garra();
		int cont = 1000;
		while(cont >=0){
			viv = 0;
		for (int i=0; i<familias.size();i++){
            ArrayList<Humano> fam=(ArrayList<Humano>) familias.get(i);
            for (int j=0; j<fam.size(); j++){
                Humano hum = (Humano) fam.get(j);
                boolean antes = hum.isVivo();
                boolean vivo = (g.vidaMuerte(hum));
                if(vivo || antes){
                	viv++;
                }
            }
            
        }
		for (Personaje personaje : personajes) {
			boolean before = personaje.isVivo();
			boolean vi = (g.vidaMuerte(personaje));
			if(vi || before)
				viv++;
		}
		simulacion.add(viv);
		cont--;
	}
}

	private double CalcularEstadistica(){
		int suma = 0;
		for (Integer sim : simulacion) {
			suma = suma + sim;
		}
		double porcentaje = (suma*100)/total;
		
		return porcentaje;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gestion g = new Gestion();
		Personaje p = new Personaje("paco", true);
		g.personajes.add(p);
		g.contar();
		g.simulacion();
		System.out.println(g.CalcularEstadistica());
	}




}
