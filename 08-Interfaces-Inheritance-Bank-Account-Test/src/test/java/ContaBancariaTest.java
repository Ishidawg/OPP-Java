import br.unipar.ContaCorrente;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaBancariaTest {

    @Test
    public void testDepositoContaCorrente(){

        ContaCorrente conta = new ContaCorrente();
        conta.depositar(5000d);

        assertEquals(conta.obterSaldo(), 5000d);

    }

    @Test
    public void testSaqueContaCorrente() {
        ContaCorrente conta = new ContaCorrente();

        conta.depositar(3000d);
        boolean validacao = conta.saque(1250d);

        assertTrue(validacao);

        assertEquals(1750d, conta.obterSaldo());

    }

    @Test
    public void testSaqueMaiorSaldoContaCorrente() {
        ContaCorrente conta = new ContaCorrente();

        conta.depositar(3000d);
        boolean validacao = conta.saque(4500d);

        assertFalse(validacao);

        assertEquals(3000d, conta.obterSaldo());

    }

}
