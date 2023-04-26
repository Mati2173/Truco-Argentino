package mazo.cartas;

public class Espada extends Carta {
	
	public Espada(int numero) {
		super(numero);
		asignarValor();	
	}
	
	@Override
	protected void asignarValor() {
		switch(this.numero) {
			case 1:
				this.valor = 14;
				break;
			case 2:
				this.valor = 9;
				break;
			case 3:
				this.valor = 10;
				break;
			case 4:
				this.valor = 1;
				break;
			case 5:
				this.valor = 2;
				break;
			case 6:
				this.valor = 3;
				break;
			case 7:
				this.valor = 12;
				break;
			case 10:
				this.valor = 5;
				break;
			case 11:
				this.valor = 6;
				break;
			case 12:
				this.valor = 7;
				break;
			default:
				super.asignarValor();
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + " de Espada";
	}
}