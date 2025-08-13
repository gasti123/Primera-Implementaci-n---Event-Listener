package ventanavich;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class practico1 extends JFrame{
	
	 
		public practico1() {
		        this.setTitle("Mi ventana");
		        this.setSize(800, 600);
		        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        this.setLocationRelativeTo(null);
		    
		      
		        JPanel panel1 = new JPanel();
		        JPanel panel2 = new JPanel();
	 
		       this.add(panel1,BorderLayout.CENTER);
		       this.add(panel2,BorderLayout.SOUTH);

		       
		        JLabel etiqueta1 = new JLabel("Usuario:");
		        JTextField texto1 = new JTextField(5);
		        JLabel etiqueta2 = new JLabel("Contraseña:");
		        JTextField texto2 = new JTextField(5);
		        JButton buton1 = new JButton("Iniciar Sesion");
		     
		       
		        panel1.setLayout(new GridLayout(15,15));
		      
		       
		     buton1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
				    String Usuario = texto1.getText();
				    String Contraseña = texto2.getText();
					System.out.println("Usuario: " + Usuario + " Contraseña: "+Contraseña);
					
					
				}
			});
		   
		        panel1.add(etiqueta1);
		        panel1.add(texto1);
		        panel1.add(etiqueta2);
		        panel1.add(texto2);
		        panel2.add(buton1);
		      
		      
		      
		    }
	}
