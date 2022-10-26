import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BoteSalvaVidasTest {

    @Test
    void verificaSegurancaIgualPessoasColetes() {
        BoteSalvaVidas bote = new BoteSalvaVidas("BSV 001", 28, true, 5, 28);
        Assertions.assertEquals("Bote OK!", bote.verificaSeguranca());
    }

    @Test
    void verificaSegurancaMaisColetes() {
        BoteSalvaVidas bote = new BoteSalvaVidas("BSV 244", 142, true, 5, 145);
        Assertions.assertEquals("Bote OK!", bote.verificaSeguranca());
    }

    @Test
    void verificaSegurancaMaisPessoas() {
        BoteSalvaVidas bote = new BoteSalvaVidas("BSV 244", 122, false, 12, 120);
        Assertions.assertEquals("Insuficiência de 2 coletes salva-vidas", bote.verificaSeguranca());
    }
}