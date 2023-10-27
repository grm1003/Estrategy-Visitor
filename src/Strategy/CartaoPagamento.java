package Strategy;

public class CartaoPagamento implements  PagamentoStrategy{
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento via cartão de crédito de R$" + valor);
    }
}
