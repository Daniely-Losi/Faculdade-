import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TransatlanticoTest {

    @Test
    void verificaSegurancaCuidado() {
        Transatlantico t = new Transatlantico("FTR 1267", 2365, "Titanic II", LocalDate.of(2010, 5, 14));
        BoteSalvaVidas bote = new BoteSalvaVidas("BSV 001", 28, true, 5, 28);

        t.addBote(bote);

        Assertions.assertEquals("CUIDADO: navio em perigo", t.verificaSeguranca());
    }

    @Test
    void verificaSegurangaAlerta() {
        Transatlantico t = new Transatlantico("FTR 1267", 2365, "Titanic II", LocalDate.now().plusDays(1));
        BoteSalvaVidas bote = new BoteSalvaVidas("BSV 001", 28, true, 5, 28);

        t.addBote(bote);

        Assertions.assertEquals("ALERTA: navio necessitando de mais botes!", t.verificaSeguranca());
    }

    @Test
    void verificaSegurancaSegura() {
        Transatlantico t = new Transatlantico("FTR 1267", 170, "Titanic II", LocalDate.of(2023, 5, 14));
        BoteSalvaVidas bote1 = new BoteSalvaVidas("BSV 001", 28, true, 5, 28);
        BoteSalvaVidas bote2 = new BoteSalvaVidas("BSV 244", 142, true, 5, 145);

        t.addBote(bote2);
        t.addBote(bote1);

        Assertions.assertEquals("Está em condições adequadas de segurança", t.verificaSeguranca());
    }

}