package Clases;

public class Tenista {
	private String nombre;
	private String nacionalidad;
	private int numVictorias;
	
	public Tenista() {
		super();
	}
	
	public Tenista(String nombre, String nacionalidad, int numVictorias) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.numVictorias = numVictorias;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public int getNumVictorias() {
		return numVictorias;
	}
	public void setNumVictorias(int numVictorias) {
		this.numVictorias = numVictorias;
	}
	
}
