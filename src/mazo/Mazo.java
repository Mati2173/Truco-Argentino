package mazo;

import java.util.ArrayList;
import java.util.Collections;
import mazo.cartas.*;

public class Mazo {
    private final ArrayList<Carta> cartas;
    private int envido;

    public Mazo() {
        this.cartas = new ArrayList<Carta>();
        this.envido = 0;
    }

    public void agregarCarta(Carta carta) {
        this.cartas.add(carta);

        if(this.cartas.size() == 3)
            this.envido = contarEnvido();
    }

    public Carta tirarCarta(int carta) {
        return this.cartas.remove(carta);
    }

    public ArrayList<Carta> tirarCartas(){
        ArrayList<Carta> cartas = new ArrayList<Carta>();

        for(int i = this.cartas.size(); i > 0 ; i--)
            cartas.add(tirarCarta(i-1));

        return cartas;
    }

    private int contarEnvido() {
        int[] cant = {0,0,0,0};

        for(Carta carta: this.cartas) {
            if(carta instanceof Oro) cant[0]++;
            else if(carta instanceof Copa) cant[1]++;
            else if(carta instanceof Espada) cant[2]++;
            else if(carta instanceof Basto) cant[3]++;
        }

        if(cant[0] >= 2) return contarPuntos(true, new Oro(0));
        else if(cant[1] >= 2) return contarPuntos(true, new Copa(0));
        else if(cant[2] >= 2) return contarPuntos(true, new Espada(0));
        else if(cant[3] >= 2) return contarPuntos(true, new Basto(0));
        else return contarPuntos(false, null);
    }

    private int contarPuntos(boolean envido, Carta tipo) {
        int total = 0;

        if(envido) {
            ArrayList<Integer> puntos = new ArrayList<>();
            total += 20;

            for(Carta carta: this.cartas) {
                if(carta.getNumero() < 10 && carta.getClass() == tipo.getClass())
                    puntos.add(carta.getNumero());
            }

            puntos.sort(Collections.reverseOrder());

            if(puntos.size() == 3 || puntos.size() == 2)
                total += (puntos.get(0) + puntos.get(1));
            else if(puntos.size() == 1)
                total += puntos.get(0);
        }
        else {
            for(Carta carta: this.cartas)
                if(carta.getNumero() > total && carta.getNumero() < 10)
                    total = carta.getNumero();
        }
        return total;
    }

    public int getEnvido() {
        return this.envido;
    }

    public String toString() {
        return this.cartas.toString();
    }
}