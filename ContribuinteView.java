package Exerc1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContribuinteView {

	private JFrame frame;
	private JTextField txtNome;
	private JTextField txtCPF;
	private JTextField txtUF;
	private JTextField txtRendaAnual;
	private int index;
	private Contribuinte contribuintes[] = new Contribuinte[100];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContribuinteView window = new ContribuinteView();
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
	public ContribuinteView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		index = 0;
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 169);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[][grow]", "[][][][][]"));
		
		JLabel lblNome = new JLabel("Nome:");
		frame.getContentPane().add(lblNome, "cell 0 0,alignx trailing");
		
		txtNome = new JTextField();
		frame.getContentPane().add(txtNome, "cell 1 0,growx");
		txtNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		frame.getContentPane().add(lblCpf, "cell 0 1,alignx trailing");
		
		txtCPF = new JTextField();
		frame.getContentPane().add(txtCPF, "cell 1 1,growx");
		txtCPF.setColumns(10);
		
		JLabel lblUf = new JLabel("UF:");
		frame.getContentPane().add(lblUf, "cell 0 2,alignx trailing");
		
		txtUF = new JTextField();
		frame.getContentPane().add(txtUF, "cell 1 2,growx");
		txtUF.setColumns(10);
		
		JLabel lblRendaAnual = new JLabel("Renda Anual:");
		frame.getContentPane().add(lblRendaAnual, "cell 0 3,alignx trailing");
		
		txtRendaAnual = new JTextField();
		frame.getContentPane().add(txtRendaAnual, "cell 1 3,growx");
		txtRendaAnual.setColumns(10);
		
		JButton btnConsulta = new JButton("Consultar");
		btnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valorConsult = JOptionPane.showInputDialog("Digite o valor a ser consultado: ");
				double valorConsultD = Double.parseDouble(valorConsult);
				String nomes = "";
				for (int i = 0; i < contribuintes.length; i++) {
					if (contribuintes[i] == null) {
						break;
					}
					Contribuinte c = contribuintes[i];
					if (c.CalculaImposto() >= valorConsultD) {
						nomes += c.getNome() + '\n';
					}
				}
				
				JOptionPane.showMessageDialog(frame, nomes);
			}
		});
		frame.getContentPane().add(btnConsulta, "flowx,cell 1 4,alignx right,aligny center");
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				salvar();
			}
			
			public void salvar() {
				Contribuinte c = new Contribuinte(txtNome.getText(), txtCPF.getText(), txtUF.getText(), Double.parseDouble(txtRendaAnual.getText()));
				contribuintes[index] = c;
				
				JOptionPane.showMessageDialog(frame, "O imposto de renda a ser pago é de: R$"+c.CalculaImposto());
				
				index += 1;
			}
		});
		frame.getContentPane().add(btnSalvar, "cell 1 4");
	}

}
