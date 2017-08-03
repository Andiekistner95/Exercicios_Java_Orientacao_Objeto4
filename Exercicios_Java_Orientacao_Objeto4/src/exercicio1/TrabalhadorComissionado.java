package exercicio1;

import java.text.DecimalFormat;

public class TrabalhadorComissionado extends Empregado {
	
	DecimalFormat df = new DecimalFormat("#0.00");

	private double comissao;
	private int qntVendas;

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public int getQntVendas() {
		return qntVendas;
	}

	public void setQntVendas(int qntVendas) {
		this.qntVendas = qntVendas;
	}

	public TrabalhadorComissionado(String primeiroNome, String ultimoNome, double comissao, int qntVendas,
			double salarioMensal) {
		super(primeiroNome, ultimoNome);
		setComissao(comissao);
		setQntVendas(qntVendas);
		setSalarioMensal(salarioMensal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularGanho() {
		double ganhoMensal;
		ganhoMensal = (getSalarioMensal() + (getComissao() * getQntVendas()));
		return ganhoMensal;
	}

	@Override
	public String toString() {
		String dados;
		dados = "\nTrabalhador Comissionado\n";
		dados += "\nNome: "+getPrimeiroNome()+" "+getUltimoNome();
		dados += "\nSalário mensal: R$"+df.format(getSalarioMensal());
		dados += "\nComissão: R$"+df.format(getComissao());
		dados += "\nQuantidade de vendas: "+getQntVendas();
		dados += "\nGanho mensal: R$"+df.format(calcularGanho());
		dados += "\n***************";
		return dados;
	}
}
