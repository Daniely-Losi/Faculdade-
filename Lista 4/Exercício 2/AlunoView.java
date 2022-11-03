package Exer2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AlunoView {

	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();   
	
	private JFrame frame;
	private JTextField edNome;
	private JTextField edDataNascimento;

	protected int curso;
	private JTextField edCurso;
	private JTextField edSigla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlunoView window = new AlunoView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AlunoView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 533, 235);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[][grow][]", "[][][][][][][][]"));
		
		JLabel lblNome = new JLabel("Nome:");
		frame.getContentPane().add(lblNome, "cell 0 0,alignx trailing");
		
		edNome = new JTextField();
		frame.getContentPane().add(edNome, "cell 1 0,growx");
		edNome.setColumns(10);
		
		JLabel lblDataNascimento = new JLabel("Data de Nascimento:");
		frame.getContentPane().add(lblDataNascimento, "cell 0 1,alignx trailing");
		
		edDataNascimento = new JTextField();
		frame.getContentPane().add(edDataNascimento, "cell 1 1,growx");
		edDataNascimento.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipo:");
		frame.getContentPane().add(lblTipo, "cell 0 2,alignx trailing");
		
		JLabel lbCurso = new JLabel("Curso");
		lbCurso.setEnabled(false);
		frame.getContentPane().add(lbCurso, "cell 0 4,alignx trailing");
		
		edCurso = new JTextField();
		edCurso.setEnabled(false);
		frame.getContentPane().add(edCurso, "cell 1 4,growx");
		edCurso.setColumns(10);
		
		JLabel lbSigla = new JLabel("Sigla:");
		lbSigla.setEnabled(false);
		frame.getContentPane().add(lbSigla, "flowx,cell 2 4");
		
		JLabel lbFormaIngresso = new JLabel("Forma de Ingresso:");
		lbFormaIngresso.setEnabled(false);
		frame.getContentPane().add(lbFormaIngresso, "cell 0 5,alignx trailing");
		
		JComboBox cbFormaIngresso = new JComboBox();
		cbFormaIngresso.setEnabled(false);
		cbFormaIngresso.setModel(new DefaultComboBoxModel(new String[] {"V - Vestibular", "E - Enem", "S - Seletivo especial", "T - Transferência externa", "I - Transferência interna"}));
		frame.getContentPane().add(cbFormaIngresso, "cell 1 5,growx");
		
		edSigla = new JTextField();
		edSigla.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (edSigla.getText().length() == 3) {
					edSigla.setText(edSigla.getText().substring(0,2));
				}
			}
		});
		edSigla.setEnabled(false);
		frame.getContentPane().add(edSigla, "cell 2 4");
		edSigla.setColumns(10);
		
		JComboBox cbTipo = new JComboBox();
		cbTipo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if (!(cbTipo.getSelectedIndex() == 0)) {
					cbFormaIngresso.setEnabled(true);
					lbFormaIngresso.setEnabled(true);
					edCurso.setEnabled(true);
					lbCurso.setEnabled(true);
					edSigla.setEnabled(true);
					lbSigla.setEnabled(true);
					
				}
				else {
					cbFormaIngresso.setEnabled(false);
					lbFormaIngresso.setEnabled(false);
					edCurso.setEnabled(false);
					lbCurso.setEnabled(false);
					edSigla.setEnabled(false);
					lbSigla.setEnabled(false);
				}
			}
		});
		cbTipo.setModel(new DefaultComboBoxModel(new String[] {"Ensino Médio", "Universidade"}));
		frame.getContentPane().add(cbTipo, "cell 1 2,growx");
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				salvar();
			}
			
			public void salvar() {
				if (cbTipo.getSelectedIndex() == 0) {
					//Ensino médio
					int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano:"));
					AlunoEnsinoMedio aem = new AlunoEnsinoMedio(edNome.getText(),
							edDataNascimento.getText(), ano);
					alunos.add(aem);
					edDataNascimento.setText("");
					edNome.setText("");
					cbTipo.setSelectedIndex(0);
					
				}
				//Universidade
				else {
					Curso c = new Curso(edCurso.getText(), edSigla.getText());
					AlunoUniversitario au = new AlunoUniversitario(edNome.getText(), 
							edDataNascimento.getText(), c, cbFormaIngresso.getSelectedItem().toString().charAt(0));
					alunos.add(au);
					edDataNascimento.setText("");
					edNome.setText("");
					cbTipo.setSelectedIndex(0);
				}
				
			}
		});
		frame.getContentPane().add(btnSalvar, "cell 2 6,alignx right");
		
	
	}

}
