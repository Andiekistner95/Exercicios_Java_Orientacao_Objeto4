package exercicio1;

import java.text.DecimalFormat;

public class TrabalhadorPecaProduzida extends Empregado {
	
	DecimalFormat df = new DecimalFormat("#0.00");

	private int qntItens;
	private double remuneracao;

	public TrabalhadorPecaProduzida(String primeiroNome, String ultimoNome, int qntItens, double remuneracao) {
		super(primeiroNome, ultimoNome);
		setQntItens(qntItens);
		setRemuneracao(remuneracao);
	}

	public int getQntItens() {
		return qntItens;
	}

	public void setQntItens(int qntItens) {
		this.qntItens = qntItens;
	}

	public double getRemuneracao() {
		return remuneracao;
	}

	public void setRemuneracao(double remuneracao) {
		this.remuneracao = remuneracao;
	}

	@Override
	public double calcularGanho() {
		setSalarioMensal(getQntItens()*getRemuneracao());
		return getSalarioMensal();
	}

	@Override
	public String toString() {
		String dados;
		dados = "\nTrabalhador Produção peça\n";
		dados += "\nNome: "+getPrimeiroNome()+" "+getUltimoNome();
		dados += "\nSalário mensal: R$"+df.format(getSalarioMensal());
		dados += "\nRemuneração: R$"+df.format(getRemuneracao());
		dados += "\nQuantidade de itens produzidos: "+ getQntItens();
		dados += "\n***************";
		return dados;
	}
}
