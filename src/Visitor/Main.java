package Visitor;
import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {

            List<Veículo> veículos = new ArrayList<>();
            veículos.add(new Carro("Prata", "Honda", "Fit"));
            veículos.add(new Onibus(2005, 50));
            veículos.add(new Bicicleta("Azul"));
            ImprimeDadosVisitor imprimirDados = new ImprimeDadosVisitor();
            EnviaMensagensVisitor enviarMensagem = new EnviaMensagensVisitor();

            for (Veículo veículo : veículos) {
                veículo.aceitar(imprimirDados);
                veículo.aceitar(enviarMensagem);
                System.out.println("---------------------");
            }
    }
}

