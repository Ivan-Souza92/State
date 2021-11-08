public class PagamentoAprovado implements IEstadoPagamento{


    private PagamentoAprovado() {};
    private static PagamentoAprovado instance = new PagamentoAprovado();
    public static PagamentoAprovado getInstance() {
        return instance;
    }

    @Override
    public String EnviarPedido(Pagamento pagamento) {
        return "O seu pedido vai ser enviado";
    }

    @Override
    public String pagamentoAprovado(Pagamento pagamento) {
        return "Seu pagamento foi aprovado";
    }

    @Override
    public String pagamentoReprovado(Pagamento pagamento) {
        return "Não se aplica";
    }

    @Override
    public String PagamentoPendente(Pagamento pagamento) {
        return "Não se aplica";
    }

    @Override
    public String getPagamento() {
        return "Pagamento realizado com sucesso";
    }
}
