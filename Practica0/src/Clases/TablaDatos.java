package Clases;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.TreeMap;


public class TablaDatos extends JTable {
	private HistoriaGrandSlam historia;
	
	
	public TablaDatos (HistoriaGrandSlam historia, Class<?> clase) {
		super(generarDatos(clase, historia), generarCabeceras(historia, clase));
		this.historia = historia;
	}
	private static Object [][] generarDatos(Class<?> clase , HistoriaGrandSlam Slam){
		Object[][] arrayDatos = null;
		
		 if (clase.equals(Resultado.class)) {
			 arrayDatos = new Object[historia.getListaResultados().size()][10];
			 ArrayList<Resultado> listaDatos = historia.getListaResultados();
			 for (int columna = 0; columna < listaDatos.size(); columna++) {
				 Resultado r = listaDatos.get(columna);
				 for (int fila = 0; fila < r.getlistaValores().size(); fila++) {
					 arrayDatos[columna][fila] = r.getValor(fila);
				 }
			 }
			 
		 } else if (clase.equals(Tenista.class)) {
			 arrayDatos = new Object[historia.getListaTenistas().size()][3];
			 TreeMap<String, Tenista>mapaDatos = historia.getListaTenistas();
			 for (int columna = 0; columna < mapaDatos.size(); columna++) {
				 ArrayList<Tenista> tenistas = new Arraylist<>();
				 
				 for (Tenista tenista : mapaDatos.values()) {
					 tenistas.add(tenista);
				 }
				 tenistas.sort(new CompararVictorias());
				 Tenista t = tenista.get(columna);
				 for (int fila = 0; fila < t.getListaValores().size(); fila++) {
					 arrayDatos[columna][fila] = t.getValor(fila);
					 
				 }
			 }
		 } else {
				 arrayDatos = new Object[historia.getListaTorneosNombre().size()][4];
				 TreeMap<String, Torneo> mapaDatos = hisoria.getListaTorneosNombre();
				 for (int columna = 0; columna < mapaDatos.size(); columna++) {
					 ArrayList <Torneo> torneos = new ArrayList<>();
					 for(Torneo torneo : mapaDatos.values()) {
						 torneos.add(torneo);
					 }
				 Torneo torn = torneos.get(columna);
				 for (int fila = 0; fila < torn.getListaValores().sizee(); fila++) {
					 arrayDatos[columna][fila] = torn.getValor(fila);
				 }
				 }
		 } 
		 return arrayDatos;
	}
	
	
	private static Object[] generarCabeceras(HistoriaGrandSlam historia, Class<?> clase) {
		
		if (clase.equals(Resultado.class)) {
			return historia.getCabecerasResultado(historia.getListaResultados());
		}else if (clase.equals(Tenista.class)) {
			return historia.getCabeceraMapasTenista(historia.getListaTenistas());
		} else {
			return historia. getCabeceraMapasTorneo(historia.getListaTorneosNombre());
		}
	}
	
}
	
