package Visitor;

public class ImprimeDadosVisitor implements Visitor{
    @Override
    public void visit(Carro carro) {
        System.out.println("Carro - (" +
                "cor=" + carro.getCor() +
                ", marca=" +carro.getMarca()+
                ", modelo=" + carro.getModelo() +
                ')');
    }

    @Override
    public void visit(Onibus onibus) {
        System.out.println("Onibus - (" +
                "Ano Fabricacao=" + onibus.getAnoFabricacao() +
                ", Numero de Assentos =" + onibus.getQuantidade_lugares()+
                ')');

    }

    @Override
    public void visit(Bicicleta bicicleta) {
        System.out.println("Bicicleta - (" +
                "cor=" + bicicleta.getCor() +
                ')');

    }
}
