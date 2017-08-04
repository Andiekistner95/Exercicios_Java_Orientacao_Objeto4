package exercicio3;

/*
 * public abstract class Dispositivo {

	private String nome;
	private long capacidadeEmBytes;
	
	public Dispositivo(String n, long c) {
	nome = n;
	capacidadeEmBytes = c;
	}
	
	abstract public String toString();
	abstract public double capacidadeEmMegabytes();

}*/

/*
 * Foram gerados os getters and setters
 */

public abstract class Dispositivo {

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCapacidadeEmBytes() {
		return capacidadeEmBytes;
	}

	public void setCapacidadeEmBytes(long capacidadeEmBytes) {
		this.capacidadeEmBytes = capacidadeEmBytes;
	}

	private String nome;
	private long capacidadeEmBytes;

	public Dispositivo(String n, long c) {
		nome = n;
		capacidadeEmBytes = c;
	}

	abstract public String toString();

	abstract public double capacidadeEmMegabytes();
}