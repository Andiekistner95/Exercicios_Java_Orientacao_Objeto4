package exercicio1;

public class Teste {
public static void main(String[] args) {
	
	Chefe chefe1 = new Chefe("Andiara", "Kistner", 3550d);
	
	TrabalhadorComissionado tc1 = new TrabalhadorComissionado("William", "Marquetti", 900d, 8, 800d);
	
	TrabalhadorPecaProduzida tpp1 =  new TrabalhadorPecaProduzida("Alison", "Kortelt",20, 550d);
	
	TrabalhadorHora th1 = new TrabalhadorHora("Thiago", "Betchold", 45, 30);
	
	chefe1.calcularGanho();
	tc1.calcularGanho();
	tpp1.calcularGanho();
	th1.calcularGanho();
	
	
	System.out.println(chefe1.toString());
	System.out.println(tc1.toString());
	System.out.println(tpp1.toString());
	System.out.println(th1.toString());
}
}
