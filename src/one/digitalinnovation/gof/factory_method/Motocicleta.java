package one.digitalinnovation.gof.factory_method;

public class Motocicleta implements Automovel {
    @Override
    public void montar() {
        System.out.println("Montando um automóvel de DUAS rodas...");
    }

    @Override
    public void mover() {
        System.out.println("Movendo-se em um automóvel de DUAS rodas...");
    }
}
