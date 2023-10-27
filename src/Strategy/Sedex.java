package Strategy;

public class Sedex implements FreteStrategy{
    @Override
    public void realizarFrete(String endereco) {
        System.out.println("Seu pedido será entregue no seu endereço por Sedex!");
    }

    @Override
    public double valorFrete(String endereco) {
        return 12;
    }
}
