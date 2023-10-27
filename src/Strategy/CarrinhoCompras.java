package Strategy;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> items = new ArrayList<>();
    private PagamentoStrategy pagamentoStrategy;
    private FreteStrategy freteStrategy;
    private String endereco;

    public CarrinhoCompras(String endereco) {
        this.endereco = endereco;
    }

    public void setPagamentoStrategy(PagamentoStrategy pagamentoStrategy) {
        this.pagamentoStrategy = pagamentoStrategy;
    }

    public void setFreteStrategy(FreteStrategy freteStrategy) {
        this.freteStrategy = freteStrategy;
    }

    public void adicionaItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double calculaTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPreco()* item.getQuantidade();
        }
        return total + freteStrategy.valorFrete(endereco);
    }

    public void realizaPagamento() {
        double total = calculaTotal();
        pagamentoStrategy.realizarPagamento(total);
        freteStrategy.realizarFrete(endereco);
    }
}
