package exercicio2;

public class RadioRelogio implements IRadio, IRelogio {

	private String emissora;
	private String tipoEmissora;
	private int volumeRadio;
	private int volumeRelogio;
	private boolean alarme;
	private long horario;
	private long horarioAlarme;

	public RadioRelogio(String emissora, String tipoEmissora, int volumeRadio, int volumeRelogio, boolean alarme,
			long horario, long horarioAlarme) {
		setEmissora(tipoEmissora);
		setTipoEmissora(tipoEmissora);
		setVolumeRadio(volumeRadio);
		setvolumeRelogio(volumeRelogio);
		setAlarme(alarme);
		setHorario(horario);
		setHorarioAlarme(horarioAlarme);
	}

	public boolean isAlarme() {
		return alarme;
	}

	public void setAlarme(boolean alarme) {
		this.alarme = alarme;
	}

	@Override
	public void setHorario(long horario) {
		this.horario = horario;

	}

	@Override
	public long getHorario() {
		return this.horario;
	}

	@Override
	public void setHorarioAlarme(long horarioAlarme) {
		this.horarioAlarme = horarioAlarme;

	}

	@Override
	public long getHorarioAlarme() {
		return this.horarioAlarme;
	}

	@Override
	public void ligarAlarme() {
		this.alarme = true;

	}

	@Override
	public void desligarAlarme() {
		this.alarme = false;

	}

	@Override
	public void setvolumeRelogio(int volumeRelogio) {
		this.volumeRelogio = volumeRelogio;

	}

	@Override
	public int getvolumeRelogio() {
		return this.volumeRelogio;
	}

	@Override
	public void setEmissora(String emissora) {
		this.emissora = emissora;

	}

	@Override
	public String getEmissora() {
		return this.emissora;
	}

	@Override
	public void setTipoEmissora(String tipoEmissora) {
		this.tipoEmissora = tipoEmissora;

	}

	@Override
	public String getTipoEmissora() {
		return this.tipoEmissora;
	}

	@Override
	public void setVolumeRadio(int volumeRadio) {
		this.volumeRadio = volumeRadio;

	}

	@Override
	public int getVolumeRadio() {
		return this.volumeRadio;
	}

}
