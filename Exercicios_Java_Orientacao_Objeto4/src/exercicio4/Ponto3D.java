package exercicio4;

/*public class Ponto3D extends Ponto2D{

private double z;

Ponto3D(double _x, double _y, double _z){

x = _x;
y = _y;
z = _z;
	}
}
*/

/*
 * Foram instanciados os getters and setters
 * Na linha 9 estava faltando a chamada do construtor super classe Ponto2D,
 * pois o Ponto3D estende a ela, e a mesma possui um construtor com todos os atributos
 * obrigatorios.
 */

public class Ponto3D extends Ponto2D {

	private double z;

	public Ponto3D(double _x, double _y, double _z) {
		super(_x, _y);
		this.z = _z;

	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
}
