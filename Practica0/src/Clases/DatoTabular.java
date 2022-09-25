package Clases;

import java.util.ArrayList;

public abstract class DatoTabular {
	private ArrayList<String> cabeceras;
	private ArrayList<String> tipos;
	private ArrayList<String> valores;
	
	public DatoTabular(ArrayList<String> cabeceras, ArrayList<String> tipos, ArrayList<String> valores) {
		super();
		this.cabeceras = cabeceras;
		this.tipos = tipos;
		this.valores = valores;
	}

	public ArrayList<String> getCabeceras() {
		return cabeceras;
	}
	public void setCabeceras(ArrayList<String> cabeceras) {
		this.cabeceras = cabeceras;
	}
	public ArrayList<String> getTipos() {
		return tipos;
	}
	public void setTipos(ArrayList<String> tipos) {
		this.tipos = tipos;
	}
	public ArrayList<String> getValores() {
		return valores;
	}
	public void setValores(ArrayList<String> valores) {
		this.valores = valores;
	}
	
	public static void getValor(String cabeceras){
		
	}
	public static void setValor(String cabeceras, Object valor){
		
	}
	
	public static void getValor(int numCampo) {
		
	}
	public static void setValor(int numCampo, Object valor){
		
	}
	
	public static void cargaCSV() {
		
	}
	
	public static void guardarCSV() {
		
	}
}
