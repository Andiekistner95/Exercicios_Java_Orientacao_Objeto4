package exercicio5;

/*public class Data {
	private byte dia, mes;
	private short ano;

	Data(byte d, byte m, short a) {
		dia = d;
		mes = m;
		ano = a;
	}

	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}

}
*/

/*
 * Foi necessario criar a classe hora e os getters and setters, e corrigir os construtores.
 */

public class Data {

	private byte dia, mes;

	private short ano;

	Data(byte d, byte m, short a) {
		setDia(d);
		setMes(m);
		setAno(a);
	}

	public byte getDia() {
		return dia;
	}

	public void setDia(byte dia) {
		this.dia = dia;
	}

	public byte getMes() {
		return mes;
	}

	public void setMes(byte mes) {
		this.mes = mes;
	}

	public short getAno() {
		return ano;
	}

	public void setAno(short ano) {
		this.ano = ano;
	}

	public String toString() {
		return "\nData: "+getDia()+ "/" + getMes() + "/" + getAno();
	}

}