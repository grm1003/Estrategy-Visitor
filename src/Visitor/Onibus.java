package Visitor;

public class Onibus implements Veículo{
    private int anoFabricacao;
    private int quantidade_lugares;

    public Onibus(int anoFabricacao, int quantidade_lugares) {
        this.anoFabricacao = anoFabricacao;
        this.quantidade_lugares = quantidade_lugares;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public int getQuantidade_lugares() {
        return quantidade_lugares;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visit(this);
    }
}
