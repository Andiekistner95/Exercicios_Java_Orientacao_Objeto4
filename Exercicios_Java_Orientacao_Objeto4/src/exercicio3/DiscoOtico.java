package exercicio3;

/*
 * public class DiscoOtico extends Dispositivo {
 * 
 * public DiscoOtico(long c) { }super("Disco otico",24117240l);}
 * 
 * public String toString(){ return "Dispositivo:"+nome+"Capacidade:"+c; } }
 */

/*A linha 8 foi corrigida, alterando "nome" para getNome() e "c" para capacidadeEmMegabytes()
 * A linha 6 foi corrigida, alterando "24117240l" para c pois antes o parametro c não era utilizado
 * Foi implementado o metodo capacidadeEmMegabytes()
 */

public class DiscoOtico extends Dispositivo {

	public DiscoOtico(long c) {
		super("Disco otico", c);
	}

	@Override
	public String toString() {
		return "Dispositivo:" + getNome() + "Capacidade:" + capacidadeEmMegabytes();
	}

	@Override
	public double capacidadeEmMegabytes() {
		long mb = (getCapacidadeEmBytes() / 1000000);
		return mb;
	}

}
