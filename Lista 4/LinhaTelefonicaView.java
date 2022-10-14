/* +++++++++++++++++++++++++++++++++++++++++++++++++*
 * 	Auto Estudo da semana 05/10/2022  				*	
 * 	Desevolvido por: Gabriel Bobello e Daniely Losi *
 *  Data: 12/10/2022								*	
 * +++++++++++++++++++++++++++++++++++++++++++++++++*/
package AutoEstudo0510;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class LinhaTelefonicaView {

	private JFrame frmAutoEstudo;
	private JTextField edNome;
	private JTextField edEndereco;
	private JTextField edData;
	private JTextField edNumero;
	private JTextField edQtdLinhas;
	private JTextField edValor;
	private ArrayList<LinhaTelefonica> LinhasTelefonicas = new ArrayList<LinhaTelefonica>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LinhaTelefonicaView window = new LinhaTelefonicaView();
					window.frmAutoEstudo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the application.
	 */
	public LinhaTelefonicaView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAutoEstudo = new JFrame();
		frmAutoEstudo.setTitle("autoestudo 05/10 Daniely e Gabriel Bobello");
		frmAutoEstudo.setBounds(100, 100, 413, 291);
		frmAutoEstudo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAutoEstudo.getContentPane().setLayout(new MigLayout("", "[][grow]", "[][][][][][][][][][]"));
		
		JLabel lbNome = new JLabel("Nome:");
		frmAutoEstudo.getContentPane().add(lbNome, "cell 0 0,alignx left");
		
		edNome = new JTextField();
		frmAutoEstudo.getContentPane().add(edNome, "cell 1 0,alignx left");
		edNome.setColumns(10);
		
		JLabel lbEndereco = new JLabel("Endereço:");
		frmAutoEstudo.getContentPane().add(lbEndereco, "cell 0 1,alignx left");
		
		edEndereco = new JTextField();
		frmAutoEstudo.getContentPane().add(edEndereco, "cell 1 1,alignx left");
		edEndereco.setColumns(10);
		
		JLabel lbData = new JLabel("Data Instalação:");
		frmAutoEstudo.getContentPane().add(lbData, "cell 0 2,alignx left");
		
		edData = new JTextField();
		frmAutoEstudo.getContentPane().add(edData, "cell 1 2,alignx left");
		edData.setColumns(10);
		
		JLabel lbNumero = new JLabel("Número:");
		frmAutoEstudo.getContentPane().add(lbNumero, "cell 0 3,alignx left");
		
		edNumero = new JTextField();
		frmAutoEstudo.getContentPane().add(edNumero, "cell 1 3,alignx left");
		edNumero.setColumns(10);
		
		JLabel lbTipo = new JLabel("Tipo da Linha:");
		frmAutoEstudo.getContentPane().add(lbTipo, "cell 0 4,alignx left");
		
		JComboBox cbTipo = new JComboBox();
		cbTipo.setModel(new DefaultComboBoxModel(new String[] {"RESIDENCIAL", "COMERCIAL", "ESPECIALIZADA"}));
		frmAutoEstudo.getContentPane().add(cbTipo, "cell 1 4,alignx left");
		
		JLabel lbQtdLinhas = new JLabel("Quantidade:");
		frmAutoEstudo.getContentPane().add(lbQtdLinhas, "cell 0 5,alignx left");
		
		edQtdLinhas = new JTextField();
		frmAutoEstudo.getContentPane().add(edQtdLinhas, "cell 1 5,alignx left");
		edQtdLinhas.setColumns(10);
		
		JLabel lbConexaoInternet = new JLabel("Internet:");
		frmAutoEstudo.getContentPane().add(lbConexaoInternet, "cell 0 6,alignx left");
		
		JCheckBox ckInternet = new JCheckBox("");
		frmAutoEstudo.getContentPane().add(ckInternet, "cell 1 6,alignx left");
		
		JLabel lbValor = new JLabel("Valor Básico a Pagar:");
		frmAutoEstudo.getContentPane().add(lbValor, "flowx,cell 1 7,alignx right,aligny baseline");
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Salvar();
			}
			
			public void Salvar() {
				if (edNumero.getText().length() < 10 || edNumero.getText().length() > 10) {
					JOptionPane.showMessageDialog(
							frmAutoEstudo, 
							"O tamanho do número é menor/maior do que o esperado, são esperados 10 caracteres.", 
							"Erro", 
							JOptionPane.ERROR_MESSAGE
							);
				}
				else {
					LinhaTelefonica lt = new LinhaTelefonica(edNome.getText(), edEndereco.getText(), 
							Date.parse(edData.getText()), edNumero.getText(), 
							ckInternet.isSelected(), cbTipo.getSelectedItem().toString(), Integer.parseInt(edQtdLinhas.getText()));
					LinhasTelefonicas.add(lt);
				}
			}
		});
		frmAutoEstudo.getContentPane().add(btnGravar, "flowx,cell 1 9,alignx right,aligny baseline");
		
		JButton btnConsultar = new JButton("Consulta");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = "";
				do {
					num = JOptionPane.showInputDialog("Informe o número do telefone: ");
				} while (num.length() != 10);
				
				for (LinhaTelefonica linhaTelefonica : LinhasTelefonicas) {
					if (num.equals(linhaTelefonica.getNumeroLinha())) {
						edNome.setText(linhaTelefonica.getNomeUsuario());
						edEndereco.setText(linhaTelefonica.getEnderecoUsuario());
						DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
						edData.setText(df.format(linhaTelefonica.getDataInstalacao()));
						edNumero.setText(linhaTelefonica.getNumeroLinha());
						edQtdLinhas.setText(Integer.toString(linhaTelefonica.getQtdLinhasContratadas()));
						if ("RESIDENCIAL".equals(linhaTelefonica.getTipoLinha())) {
							cbTipo.setSelectedIndex(0);
						}
						else if("COMERCIAL".equals(linhaTelefonica.getTipoLinha())) {
							cbTipo.setSelectedIndex(1);
						}
						else {
							cbTipo.setSelectedIndex(2);
						}
						ckInternet.setSelected(linhaTelefonica.isConexaoInternet());
						try {
							edValor.setText(String.format("R$%.2f", linhaTelefonica.cobrancaTarifa()));
						} catch (ParseException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						break;
					}
				}
				
			}
		});
		frmAutoEstudo.getContentPane().add(btnConsultar, "cell 1 9");
		
		edValor = new JTextField();
		edValor.setHorizontalAlignment(SwingConstants.CENTER);
		edValor.setForeground(Color.WHITE);
		edValor.setFont(new Font("Tahoma", Font.BOLD, 11));
		edValor.setEnabled(false);
		edValor.setEditable(false);
		edValor.setBackground(Color.BLACK);
		frmAutoEstudo.getContentPane().add(edValor, "cell 1 7");
		edValor.setColumns(10);
		
		JButton btnFaturamento = new JButton("Faturamento");
		btnFaturamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double faturamento = 0;
				for (LinhaTelefonica linhaTelefonica : LinhasTelefonicas) {
					try {
						faturamento += linhaTelefonica.cobrancaTarifa();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				JOptionPane.showMessageDialog(frmAutoEstudo, String.format("O faturamento foi de R$%.2f", faturamento));
			}
		});
		frmAutoEstudo.getContentPane().add(btnFaturamento, "cell 1 9");
	}
}
