package Strategy;

public class Mian {
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras("Rua dos Ipes, 182");
        carrinho.adicionaItem(new Item("", 50.0, 2));
        carrinho.adicionaItem(new Item("", 30.0, 1));
        carrinho.setPagamentoStrategy(new CartaoPagamento());
        carrinho.setFreteStrategy(new Sedex());
        carrinho.realizaPagamento();


    }
}
