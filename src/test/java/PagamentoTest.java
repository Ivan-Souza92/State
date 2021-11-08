import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PagamentoTest {

    @Test
    public void PagamentoComEnvioDePedido(){
        Pagamento pagamento = new Pagamento();
        pagamento.setPagamento(PagamentoAprovado.getInstance());
        assertEquals("Seu pagamento foi aprovado", pagamento.PagamentoEfetuado());
        assertEquals("O seu pedido vai ser enviado",pagamento.EnviarPedido());
    }

    @Test
    public void PagamentoPendente(){
        Pagamento pagamento = new Pagamento();
        pagamento.setPagamento(PagamentoPendente.getInstance());
        assertEquals("seu pagamento está pendente", pagamento.PendenciaPagamento());
        assertEquals("não se aplica",pagamento.EnviarPedido());
    }

    @Test
    public void PagamentoNaoAprovado(){
        Pagamento pagamento = new Pagamento();
        pagamento.setPagamento(PagamentoReprovado.getInstance());
        assertEquals("pagamento reprovado", pagamento.PagamentoReprovado());
        assertEquals("pedido não entregue", pagamento.EnviarPedido());
    }
}