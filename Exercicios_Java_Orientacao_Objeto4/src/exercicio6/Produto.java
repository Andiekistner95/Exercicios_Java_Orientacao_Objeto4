package exercicio6;

/*public class Produto {

	private String identifica��o;
	private double custoDeFabrica��o;
	Produto(String i,double c){
	identifica��o = i;
	custoDeFabrica��o = c;
	}
	abstract public String toString();
	abstract public void novoCusto(double nc);
}
*/
/*
 * A classe possuia metodos abstratos, mas a classe n�o era abstrata.
 * A classe foi alterada para abstrata.
 * Os atributos foram declarados com caracteres especiais como "�" e "~"
 * foram reescritos e corrigidos.
 * 
 */

public abstract class Produto {

	private String identificacao;
	private double custoDeFabricacao;

	Produto(String i, double c) {
		identificacao = i;
		custoDeFabricacao = c;
	}

	abstract public String toString();

	abstract public void novoCusto(double nc);
}
