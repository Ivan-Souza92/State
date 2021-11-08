public class PagamentoPendente implements IEstadoPagamento{

    private PagamentoPendente() {};
    private static PagamentoPendente instance = new PagamentoPendente();
    public static PagamentoPendente getInstance() {
        return instance;
    }

    @Override
    public String EnviarPedido(Pagamento pagamento) {
        return "não se aplica";
    }

    @Override
    public String pagamentoAprovado(Pagamento pagamento) {
        return "nao se aplica";
    }

    @Override
    public String pagamentoReprovado(Pagamento pagamento) {
        return "nao se aplica";
    }

    @Override
    public String PagamentoPendente(Pagamento pagamento) {
        return "seu pagamento está pendente";
    }

    @Override
    public String getPagamento() {
        return "pagamento pendente";
    }
}
