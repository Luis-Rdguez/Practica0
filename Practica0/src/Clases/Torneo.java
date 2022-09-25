package Clases;

public class Torneo {
	private int codigo;
	private String nombre;
	private String ciudad;
	
	public Torneo() {
		super();
	}
	
	public Torneo(int codigo, String nombre, String ciudad) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.ciudad = ciudad;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
}
