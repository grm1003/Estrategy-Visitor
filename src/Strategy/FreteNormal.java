package Strategy;

public class FreteNormal implements FreteStrategy{
    @Override
    public void realizarFrete(String endereco) {
        System.out.println("Seu pedido será entregue no seu endereço por Frete normal!");
    }

    @Override
    public double valorFrete(String endereco) {
        return 8;
    }
}
