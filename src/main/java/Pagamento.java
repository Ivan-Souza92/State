
public class Pagamento {

    private IEstadoPagamento pagamento ;

    public Pagamento(){
        this.pagamento = PagamentoAprovado.getInstance();
    }

    public String PagamentoEfetuado(){
        return this.pagamento.pagamentoAprovado(this);
    }

    public void setPagamento(IEstadoPagamento pagamento) {
        this.pagamento = pagamento;
    }

    public String PendenciaPagamento(){
        return this.pagamento.PagamentoPendente(this);
    }

    public String PagamentoReprovado(){

        return this.pagamento.pagamentoReprovado(this);
    }

    public String EnviarPedido(){
        return this.pagamento.EnviarPedido(this);
    }
}
