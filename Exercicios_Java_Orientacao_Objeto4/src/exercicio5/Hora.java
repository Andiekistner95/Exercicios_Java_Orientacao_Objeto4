package exercicio5;

public class Hora {

	private byte hor;
	private byte min;
	private byte seg;

	public Hora(byte hor, byte min, byte seg) {
		setHor(hor);
		setMin(min);
		setSeg(seg);
	}

	public byte getHor() {
		return hor;
	}

	public void setHor(byte hor) {
		if ((hor < 0) || (hor > 23)) {
			throw new IllegalArgumentException("\nHora inválida! \n*A hora tem que ser maior do que 0 ou menos do que 24*");
		} else {
			this.hor = hor;
		}
	}

	public byte getMin() {
		return min;
	}

	public void setMin(byte min) {
		if ((min < 0) || (min > 59)) {
			throw new IllegalArgumentException("\nMinuto inválido! \nO minuto tem que ser maior do que 0 ou menor do que 60");

		} else {
			this.min = min;
		}
	}

	public byte getSeg() {
		return seg;
	}

	public void setSeg(byte seg) {
		if ((seg < 0) || (seg > 59)) {
			throw new IllegalArgumentException("\nSegundo inválido! \nO segundo tem que ser maior do que 0 ou menor do que 60");

		} else {
			this.seg = seg;
		}
	}
	
	@Override
	public String toString() {
		return "\nHora: "+getHor()+":"+getMin()+":"+getSeg();
	}
}
