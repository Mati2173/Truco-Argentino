import juego.Jugador;
import juego.apuestas.Envido;
import mazo.Baraja;

public class Test {
	/*
	 Probando algunas cosas
	 */

	public static void main(String[] args) {
		Jugador jugadores[] = {new Jugador(0, "Mati"), new Jugador(1, "Mati 2")};
		Baraja baraja = new Baraja();
		Envido envido = new Envido();
		int ganadorEnvido;
		
		//PROBANDO 3 PARTIDAS
		for(int j = 1; j <= 3; j++) {
			baraja.mezclarCartas();
			
			System.out.println("Partida " + j + ":");
			
			//Repartiendo 3 cartas a cada jugador
			for(int i = 1; i <= 3; i++) {
				jugadores[0].recibirCarta(baraja.repartirCarta());
				jugadores[1].recibirCarta(baraja.repartirCarta());
			}
			
			//Mostrando las cartas y el puntaje para el envido de cada jugador
			jugadores[0].mostrarInfo();
			jugadores[1].mostrarInfo();
			
			//Se indica quien es el ganador del envido
			ganadorEnvido = envido.ganadorEnvido(jugadores[0], jugadores[1]);
			System.out.println("\nGanador envido: " + jugadores[ganadorEnvido] + "\n");
			
			//Se devuelven las cartas de cada uno de los jugadores a la baraja
			baraja.guardarCartas(jugadores[0].devolverCartas());
			baraja.guardarCartas(jugadores[1].devolverCartas());
		}
		
	}
}