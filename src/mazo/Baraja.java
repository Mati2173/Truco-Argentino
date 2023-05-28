package mazo;

import java.util.ArrayList;
import java.util.Collections;

import mazo.cartas.*;

public class Baraja {
    private final ArrayList<Carta> cartas;

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

    public void mezclar() {
        for(int i = 1; i <= 3; i++)
            Collections.shuffle(this.cartas);
    }

    public Carta repartirCarta() {
        try {
            return this.cartas.remove(0);
        }
        catch (IndexOutOfBoundsException e) {
            return null;
        }

    }

    public void guardarCartas(ArrayList<Carta> cartas) {
        if(cartas != null)
            this.cartas.addAll(cartas);
    }

}