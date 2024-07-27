package one.digitalinnovation.gof.factory_method;

public class Carro implements Automovel {
    @Override
    public void montar() {
        System.out.println("Montando um automóvel de QUATRO rodas...");
    }

    @Override
    public void mover() {
        System.out.println("Movendo-se em um automóvel de QUATRO rodas...");
    }
}
