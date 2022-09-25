package Clases;

import javax.swing.JTable;




public class TablaDatos extends JTable {
	public TablaDatos() {
		setTitle("grandslams");
		JTable TablaDatos = new JTable();
		add(new JScrollPanel(TablaDatos), BorderLayout.CENTER);
	}
	
	
	
}
