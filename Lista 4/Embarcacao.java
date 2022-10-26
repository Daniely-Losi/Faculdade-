public abstract class Embarcacao implements AtivoEmRisco {
    private String registroCapitania;
    private int qtdePessoas;

    public Embarcacao(String registroCapitania, int qtdePessoas) {
        setRegistroCapitania(registroCapitania);
        setQtdePessoas(qtdePessoas);
    }
    

    public String getRegistroCapitania() {
        return registroCapitania;
    }

    public void setRegistroCapitania(String registroCapitania) {
        if (registroCapitania != null && !registroCapitania.isBlank()) {
            this.registroCapitania = registroCapitania;
        } else {
            throw new IllegalArgumentException("Registro de Capitania inválido");
        }
    }

    public int getQtdePessoas() {
        return qtdePessoas;
    }

    public void setQtdePessoas(int qtdePessoas) {
        if (qtdePessoas >= 0) {
            this.qtdePessoas = qtdePessoas;
        } else {
            throw new IllegalArgumentException("Quantidade inválida de pessoas");
        }
    }
}