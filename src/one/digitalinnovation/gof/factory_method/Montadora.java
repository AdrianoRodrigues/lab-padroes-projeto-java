package one.digitalinnovation.gof.factory_method;

public abstract class Montadora {

    public abstract Automovel criarAutomovel();

    public void montarAutomovel() {
        Automovel automovel = criarAutomovel();
        automovel.montar();
    }

}
