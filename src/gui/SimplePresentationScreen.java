package gui;

import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Toolkit;


@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JFrame frame;

	public SimplePresentationScreen(Student studentData) {
		this.studentData = studentData;
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		frame.setBounds(100, 100, 450, 300);
		frame.setVisible(true);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setVisible(true);
		
		frame.setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(630, 268));
		frame.setResizable(false);
		frame.getContentPane().add(contentPane);
		
		init();
	}
	
	private void init() {
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 430, 201);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		tabInformation.setLayout(null);
		
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(76, 11, 349, 20);
		tabInformation.add(textField);
		textField.setColumns(10);
		textField.setText(""+studentData.getId());
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(76, 42, 349, 20);
		tabInformation.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setText(studentData.getLastName());
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(76, 73, 349, 20);
		tabInformation.add(textField_2);
		textField_2.setColumns(10);
		textField_2.setText(studentData.getFirstName());
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(76, 104, 349, 20);
		tabInformation.add(textField_3);
		textField_3.setColumns(10);
		textField_3.setText(studentData.getMail());
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(76, 135, 349, 20);
		tabInformation.add(textField_4);
		textField_4.setColumns(10);
		textField_4.setText(studentData.getGithubURL());
		
		JLabel lblNewLabel = new JLabel("LU");
		lblNewLabel.setBounds(10, 14, 46, 14);
		tabInformation.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Apellido");
		lblNewLabel_1.setBounds(10, 45, 46, 14);
		tabInformation.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setBounds(10, 76, 46, 14);
		tabInformation.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("E-mail");
		lblNewLabel_3.setBounds(10, 107, 46, 14);
		tabInformation.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("GitHub URL");
		lblNewLabel_4.setBounds(10, 138, 74, 14);
		tabInformation.add(lblNewLabel_4);
		

		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		LocalDateTime now = LocalDateTime.now();
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm:ss");  
		LocalDateTime now2 = LocalDateTime.now();

		
		lblNewLabel_5 = new JLabel("Esta ventana fue generada el"+" "+dtf.format(now)+" a las "+dtf2.format(now2));
		lblNewLabel_5.setBounds(15, 207, 420, 14);
		contentPane.setLayout(null);
		contentPane.add(tabbedPane);
		contentPane.add(lblNewLabel_5);
		
		JLabel LabelIMG = new JLabel("");
		
		ImageIcon icono = new ImageIcon(getClass().getResource(studentData.getPathPhoto()));
		ImageIcon img = new ImageIcon(icono.getImage().getScaledInstance(150,200, Image.SCALE_DEFAULT));
		LabelIMG.setIcon(img);
		LabelIMG.setBounds(445, 32, 150, 163);
		contentPane.add(LabelIMG);
	
	}
}
