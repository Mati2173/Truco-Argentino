package mazo.cartas;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Reverso extends Carta {

    public Reverso() {
        super(0);
    }

    @Override
    public void asignarImagen() {
        try {
            this.imagen = ImageIO.read(new File("images/Cartas/Reverso.png"));
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    @Override
    protected void asignarValor() {
        this.valor = 0;
    }
}
