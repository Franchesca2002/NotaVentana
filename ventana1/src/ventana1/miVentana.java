package ventana1;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class miVentana {

	public static void main(String[] args) {
		JFrame frame = new JFrame(miVentana);
		frame.setSize(400,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		JLabel labelNota1 = new JLabel("Nota 1:");
		labelNota1.setBounds(20,20,100,25);
		JTextField fieldNota1 =new JTextField();
		fieldNota1.setBounds(120,20,100,25);
		
		
		JLabel labelNota2 = new JLabel("Nota 2:");
		labelNota2.setBounds(20,60,100,25);
		JTextField fieldNota2 = new JTextField();
		fieldNota2.setBounds(120,60,100,25);
		
		JLabel labelNota3 = new JLabel("Nota 3:");
		labelNota3.setBounds(20,60,100,25);
		JTextField fieldNota3 = new JTextField();
		fieldNota3.setBounds(120,60,100,25);
		
		JButton buttonSumar = new JButton("Sumar");
		buttonSumar.setBounds(140.140,200,25);
		
		JLabel labelResultado = new JLabel("Resultado:");
		labelResultado.setBounds(140,140,200,25);
		
		frame.add(labelNota1);
        frame.add(fieldNota1);
        frame.add(labelNota2);
        frame.add(fieldNota2);
        frame.add(labelNota3);
        frame.add(fieldNota3);
        frame.add(buttonSumar);
        frame.add(labelResultado);
        
        buttonSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    
                    double nota1 = Double.parseDouble(fieldNota1.getText());
                    double nota2 = Double.parseDouble(fieldNota2.getText());
                    double nota3 = Double.parseDouble(fieldNota3.getText());

                    
                    double suma = nota1 + nota2 + nota3;

                   
                    labelResultado.setText("Resultado: " + suma);
                } catch (NumberFormatException ex) {
                   
                    JOptionPane.showMessageDialog(frame, "Por favor, ingresa valores numéricos válidos.");
                }
            }
        });

       
        frame.setVisible(true);
    }
}
		
		
		
		
	}

}
