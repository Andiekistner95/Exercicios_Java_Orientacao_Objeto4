package exercicio1;

import java.text.DecimalFormat;

public class TrabalhadorHora extends Empregado {
	
	DecimalFormat df = new DecimalFormat("#0.00");

	private double salarioHora;
	private double horas;

	public TrabalhadorHora(String primeiroNome, String ultimoNome, double salarioHora, double horas) {
		super(primeiroNome, ultimoNome);
		setHoras(horas);
		setSalarioHora(salarioHora);
	}

	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	@Override
	public double calcularGanho() {
		setSalarioMensal(getSalarioHora()* getHoras());
		return getSalarioMensal();
	}

	@Override
	public String toString() {
		String dados;
		dados = "\nTrabalhador Hora\n";
		dados += "\nNome: "+getPrimeiroNome()+" "+getUltimoNome();
		dados += "\nSalário mensal: R$"+df.format(getSalarioMensal());
		dados += "\nSalário hora: R$"+df.format(getSalarioHora());
		dados += "\nQuantidade horas: "+getHoras();
		dados += "\n***************";
		return dados;
	}
}
