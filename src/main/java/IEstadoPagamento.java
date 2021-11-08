public interface IEstadoPagamento {

    String EnviarPedido(Pagamento pagamento);
    String pagamentoAprovado(Pagamento pagamento);
    String pagamentoReprovado(Pagamento pagamento);
    String PagamentoPendente(Pagamento pagamento);
    String getPagamento();
}
