package juego;

import java.util.ArrayList;
import mazo.Mazo;
import mazo.cartas.Carta;

public class Jugador {
	private int id;
	private String nombre;
	private Mazo mazo;
	private int puntos;
	private boolean esMano;
	
	public Jugador(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		this.mazo = new Mazo();
		this.puntos = 0;
		this.esMano = false;
	}

	public int getId() {
		return this.id;
	}
	
	public int getPuntos() {
		return this.puntos;
	}
	
	public boolean esMano() {
		return this.esMano;
	}
	
	public void setEsMano(boolean esMano) {
		this.esMano = esMano;
	}

	public void sumarPuntos(int puntos) {
		this.puntos += puntos;
	}
	
	public int puntosEnvido() {
		return this.mazo.getEnvido();
	}
	
	public void recibirCarta(Carta carta) {
		this.mazo.agregarCarta(carta);
	}
	
	public Carta tirarCarta(int carta) {
		return this.mazo.tirarCarta(carta);
	}
	
	public ArrayList<Carta> devolverCartas(){
		return this.mazo.tirarCartas();
	}
	
	/*TEMPORAL*/
	public void mostrarInfo() {
		System.out.println("\n" + this.nombre + "\nMazo: " + this.mazo + "\nEnvido: " + this.mazo.getEnvido());
	}

	public String toString() {
		return this.nombre;
	}
}