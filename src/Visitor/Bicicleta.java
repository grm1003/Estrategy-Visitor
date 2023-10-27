package Visitor;

public class Bicicleta implements Veículo{
    private String cor;


    public Bicicleta(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visit(this);
    }
}
