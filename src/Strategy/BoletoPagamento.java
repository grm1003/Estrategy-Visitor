package Strategy;

public class BoletoPagamento implements  PagamentoStrategy{
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento via boleto de R$" + valor);
    }
}
