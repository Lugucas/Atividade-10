	
	package view;

	import java.awt.EventQueue;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.JTextField;
	import java.awt.BorderLayout;
	import java.awt.Font;
	import javax.swing.JTextPane;
	import java.awt.Color;
	import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.SystemColor;

	private JPanel contentPane;
	private JTextField txtTtututtu;
	private JButton btnNewButton;
	private JTextField textField;
	private JTextField textField_1;

	    public class CandidatoGUI extends JFrame {
	        private JTextField txtInscricaoDeCandidato;
	        private JTextField textField;
	        private JTextField textField_1;
	        private JTextField textField_2;
	        public CandidatoGUI() {
	        	setTitle("CONCURSO - INSCRI\u00C7\u00C3O");
	        	setBackground(Color.LIGHT_GRAY);
	        	getContentPane().setLayout(null);
	        	
	        	textField_1 = new JTextField();
	        	textField_1.setBounds(49, 108, 215, 23);
	        	getContentPane().add(textField_1);
	        	textField_1.setColumns(10);
	        	
	        	textField_2 = new JTextField();
	        	textField_2.setColumns(10);
	        	textField_2.setBounds(49, 194, 215, 23);
	        	getContentPane().add(textField_2);
	        	
	        	JRadioButton rdbtnNewRadioButton = new JRadioButton("Professor Ensino Fundamental");
	        	rdbtnNewRadioButton.setBounds(49, 285, 171, 23);
	        	getContentPane().add(rdbtnNewRadioButton);
	        	
	        	JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Professor Ensino M\u00E9dio");
	        	rdbtnNewRadioButton_1.setBounds(49, 311, 186, 23);
	        	getContentPane().add(rdbtnNewRadioButton_1);
	        	
	        	JRadioButton rdbtnProfessorEnsinoSuperior = new JRadioButton("Professor Ensino Superior");
	        	rdbtnProfessorEnsinoSuperior.setBounds(48, 337, 159, 23);
	        	getContentPane().add(rdbtnProfessorEnsinoSuperior);
	        	
	        	JButton btnNewButton = new JButton("LIMPAR");
	        	btnNewButton.setBounds(31, 424, 89, 23);
	        	getContentPane().add(btnNewButton);
	        	
	        	JButton btnEnviar = new JButton("ENVIAR");
	        	btnEnviar.setBounds(201, 424, 89, 23);
	        	getContentPane().add(btnEnviar);
	        	
	        	JTextPane txtpnTeste = new JTextPane();
	        	txtpnTeste.setFont(new Font("Tahoma", Font.PLAIN, 12));
	        	txtpnTeste.setBackground(SystemColor.control);
	        	txtpnTeste.setText("INSCRI\u00C7\u00C3O DE CANDIDATO");
	        	txtpnTeste.setBounds(93, 35, 197, 20);
	        	getContentPane().add(txtpnTeste);
	        	
	        	JTextPane txtpnNome = new JTextPane();
	        	txtpnNome.setBackground(SystemColor.menu);
	        	txtpnNome.setText("NOME");
	        	txtpnNome.setBounds(49, 85, 89, 20);
	        	getContentPane().add(txtpnNome);
	        	
	        	JTextPane txtpnCpf = new JTextPane();
	        	txtpnCpf.setText("CPF");
	        	txtpnCpf.setBackground(SystemColor.menu);
	        	txtpnCpf.setBounds(49, 172, 89, 20);
	        	getContentPane().add(txtpnCpf);
	        	
	        	JTextPane txtpnCargo = new JTextPane();
	        	txtpnCargo.setText("CARGO");
	        	txtpnCargo.setBackground(SystemColor.menu);
	        	txtpnCargo.setBounds(49, 258, 89, 20);
	        	getContentPane().add(txtpnCargo);
	  }
	}

}
