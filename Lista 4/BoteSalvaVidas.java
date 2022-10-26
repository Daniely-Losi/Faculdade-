public class BoteSalvaVidas extends Embarcacao {
    private boolean inflavel;
    private int qtdeRemos;
    private int qtdeColetes;

    public BoteSalvaVidas(String registroCapitania, int qtdePessoas, boolean inflavel, int qtdeRemos, int qtdeColetes) {
        super(registroCapitania, qtdePessoas);
        setInflavel(inflavel);
        setQtdeRemos(qtdeRemos);
        setQtdeColetes(qtdeColetes);
    }

    @Override
    public String verificaSeguranca(){
        if (qtdeColetes < getQtdePessoas()) {
            return "Insufici�ncia de " +
                    (getQtdePessoas() - qtdeColetes)
                    + " coletes salva-vidas";
        }
        return  "Bote OK!";
    }

    public boolean isInflavel() {
        return inflavel;
    }

    public void setInflavel(boolean inflavel) {
        this.inflavel = inflavel;
    }

    public int getQtdeRemos() {
        return qtdeRemos;
    }

    public void setQtdeRemos(int qtdeRemos) {
        if (qtdeRemos >= 0) {
            this.qtdeRemos = qtdeRemos;
        } else {
            throw new IllegalArgumentException("Quantidade de remos inválida");
        }
    }

    public int getQtdeColetes() {
        return qtdeColetes;
    }

    public void setQtdeColetes(int qtdeColetes) {
        if (qtdeColetes >= 0) {
            this.qtdeColetes = qtdeColetes;
        } else {
            throw new IllegalArgumentException("Quantidade de coletes inválida");
        }
    }
}
