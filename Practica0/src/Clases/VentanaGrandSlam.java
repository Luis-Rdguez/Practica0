package Clases;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class VentanaGrandSlam extends JFrame{

	
	public VentanaGrandSlam() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        setTitle("Datos de Grand Slam");
        
 
        JTabbedPane pestanyas = new JTabbedPane();
        JPanel pResultados = new JPanel();
        pestanyas.addTab("Resultados", pResultados);
        JPanel pTenistas = new JPanel();
        pestanyas.addTab("Tenistas", pTenistas);
        JPanel pTorneos = new JPanel();
        pestanyas.addTab("Torneos", pTorneos);
        
        JPanel lBotones = new JPanel();
        JButton bAnyadir = new JButton("Añadir");
        lBotones.add(bAnyadir);
        JButton bGuardar = new JButton("Guardar");
        lBotones.add(bGuardar);
        JButton bRanking = new JButton("Evolución Ranking");
        lBotones.add(bRanking);
        
        bAnyadir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
        
        bGuardar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
        
        bRanking.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});

        getContentPane().add(pestanyas);
        getContentPane().add(lBotones, BorderLayout.SOUTH);
        setVisible(true);
    }
 
    public static void main(String[] args) {
    	VentanaGrandSlam ventana = new VentanaGrandSlam();
 
    }
}
