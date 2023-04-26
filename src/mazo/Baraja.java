package mazo;

import java.util.ArrayList;
import java.util.Collections;

import mazo.cartas.Basto;
import mazo.cartas.Carta;
import mazo.cartas.Copa;
import mazo.cartas.Espada;
import mazo.cartas.Oro;

public class Baraja {
	private ArrayList<Carta> cartas;
	
	public Baraja() {
		this.cartas = new ArrayList<Carta>();
		llenarBaraja();
	}
	
	private void llenarBaraja() {
		int[] numeros = {1,2,3,4,5,6,7,10,11,12};
		
		for(int num: numeros) {
			this.cartas.add(new Oro(num));
			this.cartas.add(new Copa(num));
			this.cartas.add(new Espada(num));
			this.cartas.add(new Basto(num));
		}
	}
	
	public void mezclarCartas() {
		for(int i = 1; i <= 3; i++)
			Collections.shuffle(this.cartas);
	}
	
	public Carta repartirCarta() {
		return this.cartas.remove(0);
	}
	
	public void guardarCartas(ArrayList<Carta> cartas) {
		this.cartas.addAll(cartas);
	}
	
	public void guardarCarta(Carta carta) {
		this.cartas.add(carta);
	}
	
	public String toString() {
		return "" + this.cartas;
	}
	
}