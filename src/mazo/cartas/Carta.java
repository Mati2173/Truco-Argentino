package mazo.cartas;

import java.awt.Image;

public abstract class Carta implements Comparable<Carta>{
    protected int numero, valor;
    protected Image imagen = null;

    public Carta(int numero) {
        if(numero > 0 && numero < 13 && numero != 8 && numero != 9)
            this.numero = numero;
        else
            this.numero = 0;

        asignarValor();
        asignarImagen();
    }
    protected abstract void asignarImagen();
    protected abstract void asignarValor();

    public int getNumero() {
        return this.numero;
    }

    public static int compare(Carta carta1, Carta carta2) {
        return carta1.compareTo(carta2);
    }

    @Override
    public int compareTo(Carta carta) {
        return Integer.compare(this.valor, carta.valor);
    }
}
