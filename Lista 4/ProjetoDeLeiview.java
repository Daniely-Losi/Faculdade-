package Exer4;

import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ProjetoDeLeiview {

	private JFrame frmProjeto;
	private JTextField edTitulo;
	private JTextField edApresentacao;
	private JLabel lblAprovacao;
	private JLabel lblProjeto;
	private JTextField edAprovacao;
	private JTextField edProjeto;
	private JLabel lblArtigo;
	private JTextField edArtigo;
	private JLabel lblVereador;
	private JTextField edVereador;
	private JLabel lblPartido;
	private JTextField edPartido;
	private JButton btnSalvar;
	private JButton btnPesquisar;
	private JLabel lblVotos;
	private JTextField edVotos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjetoDeLeiview window = new ProjetoDeLeiview();
					window.frmProjeto.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProjetoDeLeiview() {
		initialize();
	}
	private ArrayList<Vereador> vereadores = new ArrayList<Vereador>();   

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProjeto = new JFrame();
		frmProjeto.setTitle("Projeto de Lei");
		frmProjeto.setBounds(100, 100, 450, 300);
		frmProjeto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProjeto.getContentPane().setLayout(new MigLayout("", "[][grow][][grow]", "[][][][][][][][][][]"));
		
		JLabel lblTitulo = new JLabel("Titulo:");
		frmProjeto.getContentPane().add(lblTitulo, "cell 0 0,alignx left");
		
		edTitulo = new JTextField();
		frmProjeto.getContentPane().add(edTitulo, "cell 1 0 3 1,growx");
		edTitulo.setColumns(10);
		
		JLabel lblDataApresentacao = new JLabel("Apresentacao:");
		frmProjeto.getContentPane().add(lblDataApresentacao, "cell 0 1,alignx trailing");
		
		edApresentacao = new JTextField();
		frmProjeto.getContentPane().add(edApresentacao, "cell 1 1 3 1,growx");
		edApresentacao.setColumns(10);
		
		lblAprovacao = new JLabel("Aprovacao:");
		frmProjeto.getContentPane().add(lblAprovacao, "cell 0 2");
		
		edAprovacao = new JTextField();
		frmProjeto.getContentPane().add(edAprovacao, "cell 1 2 3 1,growx");
		edAprovacao.setColumns(10);
		
		lblProjeto = new JLabel("Projeto:");
		frmProjeto.getContentPane().add(lblProjeto, "cell 0 3,alignx left");
		
		edProjeto = new JTextField();
		frmProjeto.getContentPane().add(edProjeto, "cell 1 3 3 1,growx");
		edProjeto.setColumns(10);
		
		lblArtigo = new JLabel("Artigo:");
		frmProjeto.getContentPane().add(lblArtigo, "cell 0 4,alignx left");
		
		edArtigo = new JTextField();
		frmProjeto.getContentPane().add(edArtigo, "cell 1 4 3 1,growx");
		edArtigo.setColumns(10);
		
		lblVotos = new JLabel("Votos");
		frmProjeto.getContentPane().add(lblVotos, "cell 0 5,alignx left");
		
		edVotos = new JTextField();
		frmProjeto.getContentPane().add(edVotos, "cell 1 5 3 1,growx");
		edVotos.setColumns(10);
		
		lblVereador = new JLabel("Vereador");
		frmProjeto.getContentPane().add(lblVereador, "cell 0 7,alignx trailing");
		
		edVereador = new JTextField();
		frmProjeto.getContentPane().add(edVereador, "cell 1 7,growx");
		edVereador.setColumns(10);
		
		lblPartido = new JLabel("Partido");
		frmProjeto.getContentPane().add(lblPartido, "cell 0 8,alignx trailing");
		
		edPartido = new JTextField();
		frmProjeto.getContentPane().add(edPartido, "cell 1 8,growx");
		edPartido.setColumns(10);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				salvar();
				}
			
			public void salvar() {
				if (edTitulo.getText().length() <= 8|| edApresentacao.getText().length() <= 4  ||
					edAprovacao.getText().length() <= 4 || edArtigo.getText().length() <= 5 || edVotos.getText().length() <= 1||
					edVereador.getText().length() <= 2 || edPartido.getText().length() <= 1){					
					
					JOptionPane.showMessageDialog
					(frmProjeto,"Erro","Erro, mínimo de 8 caractere",JOptionPane.ERROR_MESSAGE);					
				{
				}}
					else {
						ProjetoDeLei ProjetoDeLeis = new ProjetoDeLeiComplementar(edTitulo.getText(), 
								edApresentacao.getText(), edAprovacao.getText(), 
								Integer.parseInt(edProjeto.getText()), edArtigo.getText(), 
								Integer.parseInt(edVotos.getText()));
						Vereador ve = new Vereador(edVereador.getText(),edPartido.getText(), ProjetoDeLeis);
						
						vereadores.add(ve);

					}		
				
				
			}
		});
		frmProjeto.getContentPane().add(btnSalvar, "cell 2 9");
		
		btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pesquisar();	
				
			}
		public void pesquisar() {
			String str = "Projeto de Lei \n";
			vereadores.sort(null);
			for (Vereador ve :vereadores) {
				str += "\n" + ve.getMostrar();
			}
			JOptionPane.showMessageDialog(frmProjeto, str);		
			
			
			

			}
		});
		frmProjeto.getContentPane().add(btnPesquisar, "cell 3 9");
	}

}
