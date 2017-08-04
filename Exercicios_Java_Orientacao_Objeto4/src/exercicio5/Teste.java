package exercicio5;

public class Teste {
	public static void main(String[] args) {

		Data data = new Data((byte) 15, (byte) 10, (short) 2012);
		try {
			Hora hora = new Hora((byte) 23 ,(byte) 45,(byte) 35);
			
		} catch (IllegalArgumentException erro) {
			System.out.println(erro.getMessage());
		}
	
		EntradaNaAgenda ea = new EntradaNaAgenda((byte)12, (byte) 10, (short) 2015, (byte)21,(byte)35, (byte)12, "Natal");
	
		System.out.println(ea.toString());
	
	}
}