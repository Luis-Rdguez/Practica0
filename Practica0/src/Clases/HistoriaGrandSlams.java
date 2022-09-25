package Clases;

import java.util.ArrayList;
import java.util.HashMap;

public class HistoriaGrandSlams {
	private ArrayList<Resultado> resultadosHistoricos;
	// La clave es el nombre del torneo
	private HashMap<String, Torneo> torneosPorNombre;
	// La clave es el codigo del torneo(1-4)
	private HashMap<String, Torneo> torneosPorCodigo;
	// La clave es el nombre del tenista
	private HashMap<String, Tenista> tenistas;
	
	public HistoriaGrandSlams() {
		super();
	}

	public HistoriaGrandSlams(ArrayList<Resultado> resultadosHistoricos, HashMap<String, Torneo> torneosPorNombre,
			HashMap<String, Torneo> torneosPorCodigo, HashMap<String, Tenista> tenistas) {
		super();
		this.resultadosHistoricos = resultadosHistoricos;
		this.torneosPorNombre = torneosPorNombre;
		this.torneosPorCodigo = torneosPorCodigo;
		this.tenistas = tenistas;
	}

	public ArrayList<Resultado> getResultadosHistoricos() {
		return resultadosHistoricos;
	}
	public void setResultadosHistoricos(ArrayList<Resultado> resultadosHistoricos) {
		this.resultadosHistoricos = resultadosHistoricos;
	}
	public HashMap<String, Torneo> getTorneosPorNombre() {
		return torneosPorNombre;
	}
	public void setTorneosPorNombre(HashMap<String, Torneo> torneosPorNombre) {
		this.torneosPorNombre = torneosPorNombre;
	}
	public HashMap<String, Torneo> getTorneosPorCodigo() {
		return torneosPorCodigo;
	}
	public void setTorneosPorCodigo(HashMap<String, Torneo> torneosPorCodigo) {
		this.torneosPorCodigo = torneosPorCodigo;
	}
	public HashMap<String, Tenista> getTenistas() {
		return tenistas;
	}
	public void setTenistas(HashMap<String, Tenista> tenistas) {
		this.tenistas = tenistas;
	}
	
	public ArrayList<String> calculaClasificacion(int anyoInicial, int anyoFinal){
		//Calcula el numero de victorias de los jugadores en grand slams entre los años dados
		ArrayList<String> victoriasTenista = new ArrayList<String>();
        for (Resultado resultados : resultadosHistoricos) {
            if (resultados.getAnyos() > anyoInicial || resultados.getAnyos() < anyoFinal) {
                if (victoriasTenista.contains(resultados.getGanador())) {
                    int indiceTenista = victoriasTenista.indexOf(resultados.getGanador());
                    Integer.parseInt(victoriasTenista.get(indiceTenista+1) + 1);
                    victoriasTenista.get(indiceTenista+1).toString();

                }
                victoriasTenista.add(resultados.getGanador());
                victoriasTenista.add("1");
            }
        }
        return victoriasTenista;
    }
}

