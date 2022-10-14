/* +++++++++++++++++++++++++++++++++++++++++++++++++*
 * 	Auto Estudo da semana 05/10/2022  				*	
 * 	Desevolvido por: Gabriel Bobello e Daniely Losi *
 *  Data: 12/10/2022								*	
 * +++++++++++++++++++++++++++++++++++++++++++++++++*/

package AutoEstudo0510;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LinhaTelefonica {
	private String nomeUsuario;
	private String enderecoUsuario;
	private Date dataInstalacao;
	private String numeroLinha;
	private boolean conexaoInternet;
	private String tipoLinha;
	private int qtdLinhasContratadas;
	
	public LinhaTelefonica(String nomeUsuario, String enderecoUsuario, 
			long l, String numeroLinha, boolean conexaoInternet, String tipoLinha, int qtdLinhasContratadas) {
		this.nomeUsuario = nomeUsuario;
		this.enderecoUsuario = enderecoUsuario;
		this.dataInstalacao = new Date(l);
		this.numeroLinha = numeroLinha;
		this.conexaoInternet = conexaoInternet;
		setTipoLinha(tipoLinha);
		this.qtdLinhasContratadas = qtdLinhasContratadas;
		
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getEnderecoUsuario() {
		return enderecoUsuario;
	}

	public void setEnderecoUsuario(String enderecoUsuario) {
		this.enderecoUsuario = enderecoUsuario;
	}

	public Date getDataInstalacao() {
		return dataInstalacao;
	}

	public void setDataInstalacao(Date dataInstalacao) {
		this.dataInstalacao = dataInstalacao;
	}

	public String getNumeroLinha() {
		return numeroLinha;
	}

	public void setNumeroLinha(String numeroLinha) {
		this.numeroLinha = numeroLinha;
	}

	public boolean isConexaoInternet() {
		return conexaoInternet;
	}

	public void setConexaoInternet(boolean conexaoInternet) {
		this.conexaoInternet = conexaoInternet;
	}

	public String getTipoLinha() {
		return tipoLinha;
	}

	public int getQtdLinhasContratadas() {
		return qtdLinhasContratadas;
	}

	public void setTipoLinha(String tipoLinha) {
		if ("RESIDENCIAL".equals(tipoLinha.toUpperCase())) {
			this.tipoLinha = tipoLinha.toUpperCase();
		}
		else if ("COMERCIAL".equals(tipoLinha.toUpperCase())) {
			this.tipoLinha = tipoLinha.toUpperCase();
		}
		else if ("ESPECIALIZADA".equals(tipoLinha.toUpperCase())) {
			this.tipoLinha = tipoLinha.toUpperCase();
		}
	}
	
	public double cobrancaTarifa() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date data = new Date(); 
		if ("RESIDENCIAL".equals(tipoLinha)) {
			return 15.00;
		}
		if ("COMERCIAL".equals(tipoLinha)) {
			data = sdf.parse("2019-01-01");
			if (dataInstalacao.before(data)){
				return 25.00;
			}
			else {
				return 37.50;
			}
		}
		if ("ESPECIALIZADA".equals(tipoLinha)) {
			if (qtdLinhasContratadas > 1 && qtdLinhasContratadas <= 1000) {
				return 50.00;
			}
			if (qtdLinhasContratadas > 1000 && qtdLinhasContratadas <= 5000) {
				return 67.80;
			}
			if (qtdLinhasContratadas > 5000 && qtdLinhasContratadas <= 10000) {
				return 98.50;
			}
			if (qtdLinhasContratadas > 10000 && qtdLinhasContratadas <= 50000) {
				return 123.90;
			}
			if (qtdLinhasContratadas > 50000) {
				return 187.82;
			}
		}
		
		return 0;
	}
	
}
