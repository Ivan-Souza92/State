public class PagamentoReprovado implements IEstadoPagamento{

    private PagamentoReprovado() {};
    private static PagamentoReprovado instance = new PagamentoReprovado();
    public static PagamentoReprovado getInstance() {
        return instance;
    }

    @Override
    public String EnviarPedido(Pagamento pagamento) {
        return "pedido não entregue";
    }

    @Override
    public String pagamentoAprovado(Pagamento pagamento) {
        return "não se aplica";
    }

    @Override
    public String pagamentoReprovado(Pagamento pagamento) {
        return "pagamento reprovado";
    }

    @Override
    public String PagamentoPendente(Pagamento pagamento) {
        return "não se aplica";
    }

    @Override
    public String getPagamento() {
        return "pagamento reprovado";
    }
}
