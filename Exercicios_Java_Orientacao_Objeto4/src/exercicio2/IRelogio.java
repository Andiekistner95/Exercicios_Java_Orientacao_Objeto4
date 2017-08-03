package exercicio2;

public interface IRelogio {

	public void setHorario(long horario);
	public long getHorario();
	
	public void setHorarioAlarme(long horario);
	public long getHorarioAlarme();
	
	public void ligarAlarme();
	public void desligarAlarme();
	
	public void setvolumeRelogio(int volume);
	public int getvolumeRelogio();
	
}
