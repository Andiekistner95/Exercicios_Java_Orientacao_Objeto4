package exercicio1;

import java.text.DecimalFormat;

public class Chefe extends Empregado {
	
	DecimalFormat df = new DecimalFormat("#0.00");

	private double salarioSemanal;

	public Chefe(String primeiroNome, String ultimoNome, double salarioSemanal) {
		super(primeiroNome, ultimoNome);
		this.salarioSemanal = salarioSemanal;

	}

	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}

	@Override
	public double calcularGanho() {
		this.setSalarioMensal(salarioSemanal * 4);
		return getSalarioMensal();

	}

	@Override
	public String toString() {
		String dados;
		dados = "\nChefe\n";
		dados += "\nNome: " + getPrimeiroNome() + " " + getUltimoNome();
		dados += "\nSalário mensal: R$" + df.format(getSalarioMensal());
		dados += "\nSalário semanal: R$" + df.format(getSalarioSemanal());
		dados += "\n***************";
		return dados;
	}

}
