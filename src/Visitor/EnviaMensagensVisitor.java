package Visitor;

public class EnviaMensagensVisitor implements Visitor{
    @Override
    public void visit(Carro carro) {
        System.out.println("Dono do Veículo : Favor atualizar dados do IPVA!");
    }

    @Override
    public void visit(Onibus onibus) {
        System.out.println("Dono do Veículo : Atenção para atualização das licenças!");

    }

    @Override
    public void visit(Bicicleta bicicleta) {
        System.out.println("Dono do Veículo : Comemore no parque no Dia do Ciclismo!");

    }
}
