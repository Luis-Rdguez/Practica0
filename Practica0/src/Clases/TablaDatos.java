package Clases;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TablaDatos extends JTable {
	
	 private String[] rcolumnas= {"anyo","ganador","subcampeon","rfinal"};
	 private String[] tencolumnas= {"nombre", "nacionalidad", "nvictorias"};
	 private String[] torcolumnas= {"nombre", "cuidad"};

	 private Object[][] pruebaresultados= {
			 {"2003", "Nadal", "abueladeisma", "7-0, 6-9"},
			 {"2003", "Nadal", "abueladeisma", "7-0, 6-9"},
			 {"2003", "Nadal", "abueladeisma", "7-0, 6-9"},
	 };
	 private Object[][] pruebatenistas= {
			 {"Carlos Alcacraz", "ESPAÑItA DE MI ARMA", "616"},
			 {"Carlos Alcacraz", "ESPAÑItA DE MI ARMA", "616"},
			 {"Carlos Alcacraz", "ESPAÑItA DE MI ARMA", "616"},
	 };
	 private Object[][] pruebatorneos= {
			 {"Villapereza", "Lazy Town"},
			 {"Villapereza", "Lazy Town"},
			 {"Villapereza", "Lazy Town"},
	 };

	public TablaDatos() {

        JTable tablaresultados = new JTable(pruebaresultados, rcolumnas);
        JTable tablatenistas =  new JTable(pruebatenistas, tencolumnas);
        JTable tablatorneos = new JTable(pruebatorneos, torcolumnas);
        add(new JScrollPane(tablaresultados), BorderLayout.CENTER);
        add(new JScrollPane(tablatenistas), BorderLayout.CENTER);
        add(new JScrollPane(tablatorneos), BorderLayout.CENTER);

	}
	
	
}
