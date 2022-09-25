package Clases;

import java.awt.Component;

public class Resultado {
	Torneo torneo;
	private int anyos;
	private String ganador;
	private String subcampeon;
	private String rankingGanador;
	private String rankingSubcampeon;
	private String resuladoFinal;
	
	public Resultado() {
		super();
	}
	
	public Resultado(Torneo torneo, int anyos, String ganador, String subcampeon, String rankingGanador,
			String rankingSubcampeon, String resuladoFinal) {
		super();
		this.torneo = torneo;
		this.anyos = anyos;
		this.ganador = ganador;
		this.subcampeon = subcampeon;
		this.rankingGanador = rankingGanador;
		this.rankingSubcampeon = rankingSubcampeon;
		this.resuladoFinal = resuladoFinal;
	}
	
	public Torneo getTorneo() {
		return torneo;
	}
	public void setTorneo(Torneo torneo) {
		this.torneo = torneo;
	}
	public int getAnyos() {
		return anyos;
	}
	public void setAnyos(int anyos) {
		this.anyos = anyos;
	}
	public String getGanador() {
		return ganador;
	}
	public void setGanador(String ganador) {
		this.ganador = ganador;
	}
	public String getSubcampeon() {
		return subcampeon;
	}
	public void setSubcampeon(String subcampeon) {
		this.subcampeon = subcampeon;
	}
	public String getRankingGanador() {
		return rankingGanador;
	}
	public void setRankingGanador(String rankingGanador) {
		this.rankingGanador = rankingGanador;
	}
	public String getRankingSubcampeon() {
		return rankingSubcampeon;
	}
	public void setRankingSubcampeon(String rankingSubcampeon) {
		this.rankingSubcampeon = rankingSubcampeon;
	}
	public String getResuladoFinal() {
		return resuladoFinal;
	}
	public void setResuladoFinal(String resuladoFinal) {
		this.resuladoFinal = resuladoFinal;
	}

	public Component getlistaValores() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
