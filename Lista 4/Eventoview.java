package Exer5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ItemListener;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ItemEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Eventoview {
	private ArrayList<Evento> eventos = new ArrayList<Evento>();

	private JFrame frame;
	private JTextField edTitulo;
	private JTextField edValor;
	private JTextField edData;
	private JTextField edBanda;
	private JTextField edEstilo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eventoview window = new Eventoview();
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
	public Eventoview() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 401, 224);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[grow][grow][grow][]", "[][][][][][][][]"));
		
		JLabel lbTitulo = new JLabel("Título:");	
		frame.getContentPane().add(lbTitulo, "cell 0 0,alignx left,aligny top");
		
		edTitulo = new JTextField();
		frame.getContentPane().add(edTitulo, "cell 1 0 3 1,growx");
		edTitulo.setColumns(10);
		
		JLabel lbValor = new JLabel("Valor:");
		frame.getContentPane().add(lbValor, "cell 0 1,alignx left");
		
		edValor = new JTextField();
		frame.getContentPane().add(edValor, "cell 1 1 3 1,growx");
		edValor.setColumns(10);
		
		JLabel lbData = new JLabel("Data:");
		frame.getContentPane().add(lbData, "cell 0 2,alignx left");
		
		edData = new JTextField();
		frame.getContentPane().add(edData, "cell 1 2,growx");
		edData.setColumns(10);
		
		JLabel lbTipo = new JLabel("Tipo do Evento:");
		frame.getContentPane().add(lbTipo, "cell 0 3,alignx left");
		
	
		
		JLabel lbNomeBanda = new JLabel("Nome da Banda:");
		lbNomeBanda.setEnabled(false);
		frame.getContentPane().add(lbNomeBanda, "cell 0 6");
		
		edBanda = new JTextField();
		edBanda.setEnabled(false);
		frame.getContentPane().add(edBanda, "cell 1 6,growx");
		edBanda.setColumns(10);
		
		JLabel lbEstilo = new JLabel("Estilo Musical: ");
		lbEstilo.setEnabled(false);
		frame.getContentPane().add(lbEstilo, "cell 0 7,alignx left");
		
		edEstilo = new JTextField();
		edEstilo.setEnabled(false);
		frame.getContentPane().add(edEstilo, "cell 1 7,growx");
		edEstilo.setColumns(10);
		
		
		JComboBox cmbTipoEvento = new JComboBox();
		cmbTipoEvento.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent agr0) {
				
				if ((!(cmbTipoEvento.getSelectedIndex()==0))) {
					edBanda.setEnabled(true);
					lbNomeBanda.setEnabled(true);
					edEstilo.setEnabled(true);
					lbEstilo.setEnabled(true);
					
				}
					else{  
						edBanda.setEnabled(false);
						lbNomeBanda.setEnabled(false);
						edEstilo.setEnabled(false);
						lbEstilo.setEnabled(false);
				}
				
				}

				});

		cmbTipoEvento.setModel(new DefaultComboBoxModel(new String[] {"Evento", "Show Musical "}));
		frame.getContentPane().add(cmbTipoEvento, "cell 1 3 3 1,growx");
		
		JButton btSalvar = new JButton("Salvar");
		btSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				salvar();
				
				
			}
			
			public void salvar() {
				//evento
				if (cmbTipoEvento.getSelectedIndex() == 0) {
					Evento ev = new Evento(edTitulo.getText(), 
							Double.parseDouble(edValor.getText()),edData.getText()) {
					};
					eventos.add(ev);
						
					
				//showMusical
				} else {
					Evento  ev = new ShowMusical(edTitulo.getText(), Double.parseDouble(edValor.getText()), 
						 edData.getText(), edBanda.getText(), edEstilo.getText());

				}
			
				
				
			}
			
		});
		btSalvar.addItemListener(new ItemListener() {
			private JComboBox cmbTipoEvento;
			public void itemStateChanged(ItemEvent e) {
				

			}
		});
		frame.getContentPane().add(btSalvar, "cell 3 6,alignx center");
		
		JButton btnImprimie = new JButton("Pesquisar");
		btnImprimie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String mensagem = null;
				for (Evento evento : eventos) {
					mensagem = evento.mostra();				
				}
				
				JOptionPane.showMessageDialog(frame, mensagem);
			}
		});
		frame.getContentPane().add(btnImprimie, "cell 3 7");
		

	
		
		
				
		
	}
}
				
			
			