package exercicio6;

/*public class Produto {

	private String identificação;
	private double custoDeFabricação;
	Produto(String i,double c){
	identificação = i;
	custoDeFabricação = c;
	}
	abstract public String toString();
	abstract public void novoCusto(double nc);
}
*/
/*
 * A classe possuia metodos abstratos, mas a classe não era abstrata.
 * A classe foi alterada para abstrata.
 * Os atributos foram declarados com caracteres especiais como "ç" e "~"
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
