package juego.apuestas;

import juego.Jugador;
import java.util.ArrayList;
import java.util.Collections;

public class Envido {
	public static final int ENVIDO = 1;
	public static final int REAL_ENVIDO = 2;
	public static final int FALTA_ENVIDO = 3;
	
	private boolean jugadaActiva, quiero;
	private ArrayList<Integer> jugadas;
	private int puntosJugada;
	
	public Envido() {
		this.jugadaActiva = false;
		this.jugadas = new ArrayList<Integer>();
		this.puntosJugada = 0;
	}
	
	public void cantarApuesta(int opc, int puntos) {
		this.jugadaActiva = true;
		switch (opc) {
			case 1 -> {
				this.jugadas.add(opc);
				this.puntosJugada += 2;
			}
			case 2 -> {
				this.jugadas.add(opc);
				this.puntosJugada += 3;
			}
			case 3 -> {
				this.jugadas.add(opc);
				this.puntosJugada = puntos;
			}
		}
	}
	
	public boolean envido1Cantado() {
		return Collections.frequency(this.jugadas, ENVIDO) == 1;
	}

	public boolean envido2Cantado() {
		return Collections.frequency(this.jugadas, ENVIDO) == 2;
	}

	public boolean realEnvidoCantado() {
		return Collections.frequency(this.jugadas, REAL_ENVIDO) == 1;
	}
	
	public boolean faltaEnvidoCantado() {
		return Collections.frequency(this.jugadas, FALTA_ENVIDO) == 1;
	}
	
	public boolean jugadaActiva() {
		return this.jugadaActiva;
	}
	
	public void aceptarApuesta() {
		this.quiero = true;
		this.jugadaActiva = false;
	}
	
	public void rechazarApuesta() {
		this.quiero = false;
		this.jugadaActiva = false;
	}
	
	public boolean apuestaAceptada() {
		return this.quiero;
	}
	
	public int ganadorEnvido(Jugador j1, Jugador j2) {
		if(this.quiero) {
			if(j1.puntosEnvido() > j2.puntosEnvido()) return j1.getId();
			else if(j1.puntosEnvido() < j2.puntosEnvido()) return j2.getId();
			else if(j1.esMano()) return j1.getId();
			else return j2.getId();
		}
		else return -1;
	}
	
	public void asignarPuntos(Jugador jugador) {
		jugador.sumarPuntos(this.puntosJugada);
	}
	
}
