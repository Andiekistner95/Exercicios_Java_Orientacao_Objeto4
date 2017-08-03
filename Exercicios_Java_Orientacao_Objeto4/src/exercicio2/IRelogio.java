package exercicio2;

import java.util.Date;

public interface IRelogio {

	public void setHorario(Date horario);
	public Date getHorario();
	
	public void setHorarioAlarme(Date horario);
	public Date getHorarioAlarme();
	
	public void ligarAlarme();
	public void desligarAlarme();
	
	public void setvolumeRelogio(int volume);
	public int getvolumeRelogio();
	
}
