package one.digitalinnovation.gof.factory_method;

public class MontadoraCarros extends Montadora {
    @Override
    public Automovel criarAutomovel() {
        return new Carro();
    }
}
