import java.time.LocalDate;
import java.util.ArrayList;

public class Transatlantico extends Embarcacao {
	private String nome;
	private LocalDate dataInauguracao;
	private ArrayList<BoteSalvaVidas> botes = new ArrayList<>();

	public Transatlantico(String registroCapitania, int qtdePessoas, String nome, LocalDate dataInauguracao) {
		super(registroCapitania, qtdePessoas);
		setNome(nome);
		setDataInauguracao(dataInauguracao);
	}

	@Override
	public String verificaSeguranca() {
		if (getSomaCapacidadeBotes() < getQtdePessoas()) {
			if (dataInauguracao.isAfter(LocalDate.now())) {
				return "ALERTA: navio necessitando de mais botes!";
			}
			return "CUIDADO: navio em perigo";
		}
		return "Está em condições adequadas de segurança";
	}

	public int getSomaCapacidadeBotes() {
		int soma = 0;
		for (BoteSalvaVidas b : botes) {
			soma += b.getQtdePessoas();
		}
		return soma;
	}

	public void addBote(BoteSalvaVidas b) {
		if (b != null) {
			botes.add(b);
		} else {
			throw new IllegalArgumentException("Bote inválido");
		}
	}

	public void addBote(String n, int q, boolean i, int qr, int qc) {
		this.addBote(new BoteSalvaVidas(n, q, i, qr, qc));
	}

	public void removeBote(BoteSalvaVidas bote) {
		if (bote != null && botes.contains(bote)) {
			botes.remove(bote);
		} else {
			throw new IllegalArgumentException("Bote inválido");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null && !nome.isBlank()) {
			this.nome = nome;
		} else {
			throw new IllegalArgumentException("Nome invÃ¡lido");
		}
	}

	public LocalDate getDataInauguracao() {
		return dataInauguracao;
	}

	public void setDataInauguracao(LocalDate dataInauguracao) {
		if (dataInauguracao != null) {
			this.dataInauguracao = dataInauguracao;
		} else {
			throw new IllegalArgumentException("Data invÃ¡lida");
		}
	}
}
