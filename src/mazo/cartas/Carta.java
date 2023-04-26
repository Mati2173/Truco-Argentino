package mazo.cartas;

public class Carta implements Comparable<Carta>{
	protected int numero, valor;
	
	protected Carta(int numero) {
		if(numero > 0 && numero < 13 && numero != 8 && numero != 9)
			this.numero = numero;
		else
			this.numero = 0;
	}
	
	protected void asignarValor() {
		this.valor = 0;
	}
	
	public int getNumero() {
		return this.numero;
	}

	public int getValor() {
		return this.valor;
	}
	
	@Override
	public int compareTo(Carta carta) {
		return Integer.compare(this.valor, carta.getValor());
	}
		
	public String toString() {
		return "" + this.numero;
	}
}