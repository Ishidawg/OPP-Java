import br.unipar.ContaPoupanca;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaPoupancaTest {

    @Test
    public void testDepositoContaPoupanca(){

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.depositar(5000d);

        assertEquals(contaPoupanca.obterSaldo(), 5000d);

    }

    @Test
    public void testSaqueContaPoupanca() {
        ContaPoupanca contaPoupanca = new ContaPoupanca();

        contaPoupanca.depositar(3000d);
        boolean validacao = contaPoupanca.saque(1250d);

        assertTrue(validacao);

        assertEquals(1750d, contaPoupanca.obterSaldo());

    }

    @Test
    public void testSaqueMaiorSaldoContaPoupanca() {
        ContaPoupanca contaPoupanca = new ContaPoupanca();

        contaPoupanca.depositar(3000d);
        boolean validacao = contaPoupanca.saque(4500d);

        assertFalse(validacao);

        assertEquals(3000d, contaPoupanca.obterSaldo());

    }
}
