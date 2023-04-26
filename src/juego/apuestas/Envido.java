package juego.apuestas;

import juego.Jugador;

public class Envido {
	
	public Envido() {
		
	}
	
	public int ganadorEnvido(Jugador j1, Jugador j2) {
		if(j1.puntosEnvido() > j2.puntosEnvido()) return j1.getId();
		else if(j1.puntosEnvido() < j2.puntosEnvido()) return j2.getId();
		else if(j1.esMano()) return j1.getId();
		else return j2.getId();
	}
	
}
