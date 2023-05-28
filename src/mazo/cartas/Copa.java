package mazo.cartas;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Copa extends Carta {

    public Copa(int numero) {
        super(numero);
    }

    @Override
    public void asignarImagen() {
        if(this.numero != 0) {
            try {
                this.imagen = ImageIO.read(new File("images/Cartas/Copa_" + this.numero + ".png"));
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
        }
    }

    @Override
    protected void asignarValor(){
        switch (this.numero) {
            case 1 -> this.valor = 8;
            case 2 -> this.valor = 9;
            case 3 -> this.valor = 10;
            case 4 -> this.valor = 1;
            case 5 -> this.valor = 2;
            case 6 -> this.valor = 3;
            case 7 -> this.valor = 4;
            case 10 -> this.valor = 5;
            case 11 -> this.valor = 6;
            case 12 -> this.valor = 7;
            default -> this.valor = 0;
        }
    }

    @Override
    public String toString() {
        return this.numero + " de Copa";
    }
}
