package one.digitalinnovation.gof.factory_method;

public class MontadoraMotos extends Montadora {
    @Override
    public Automovel criarAutomovel() {
        return new Motocicleta();
    }
}
