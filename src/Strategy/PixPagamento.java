package Strategy;

public class PixPagamento implements  PagamentoStrategy{
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento via pix de R$" + valor);
    }
}
