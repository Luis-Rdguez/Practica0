package Clases;

<<<<<<< HEAD
import java.io.*;
=======
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
>>>>>>> branch 'Practica0' of https://github.com/Luis-Rdguez/Practica0.git
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
		String csvFile = "/Practica0/src/Australian Open Championships, Champion vs Runner-up, Men's Singles,1969 - 2021.csv";
		BufferedReader br = null;
		String line = "";
		//Se define separador ","
		String cvsSplitBy = ",";
		try {
		    br = new BufferedReader(new FileReader(csvFile));
		    while ((line = br.readLine()) != null) {                
		        String[] datos = line.split(cvsSplitBy);
		        //Imprime datos.
		       System.out.println(datos[0] + ", " + datos[1] + ", " + datos[2] + ", " + datos[3] + ", " + datos[4] + ", " + datos[5]);
		    }
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
		    if (br != null) {
		        try {
		            br.close();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }

		    }}
		}
	//guardar 
	public static void guardarCSV() {
<<<<<<< HEAD

			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter("/Practica0/src/Australian Open Championships, Champion vs Runner-up, Men's Singles,1969 - 2021.csv"));			
				bw.flush(); 
				bw.close();
			} catch (IOException e) {
				System.out.println("Error E/S: "+e);
			}
		}
		
	
=======
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("/Practica0/src/Australian Open Championships, Champion vs Runner-up, Men's Singles,1969 - 2021.csv"));			
			bw.flush(); 
			bw.close();
		} catch (IOException e) {
			System.out.println("Error E/S: "+e);
		}
	}
>>>>>>> branch 'Practica0' of https://github.com/Luis-Rdguez/Practica0.git
}
