package juego;

import java.util.ArrayList;

import juego.apuestas.Envido;
import mazo.Mazo;
import mazo.cartas.Carta;

public class Jugador {
	private int id;
	private static int idSiguiente = -1;
	private String nombre;
	private Mazo mazo;
	private int puntos;
	private boolean esMano;
	
	public Jugador(String nombre) {
		idSiguiente++;
		this.id = idSiguiente;
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
	
	public void cantarEnvido(Envido env) {
		env.cantarApuesta(Envido.ENVIDO, 0);
	}
	
	public void cantarRealEnvido(Envido env) {
		env.cantarApuesta(Envido.REAL_ENVIDO, 0);
	}
	
	/*TEMPORAL*/
	public void mostrarInfo() {
		System.out.println("\n" + this.nombre + "\nMazo: " + this.mazo + "\nEnvido: " + this.mazo.getEnvido());
	}

	public String toString() {
		return this.nombre;
	}
}