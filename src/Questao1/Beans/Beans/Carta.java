package Questao1.Beans.Beans;

public class Carta {
    private static Carta instanciaCarta;
    private Naipe naipe;
    private Valor valor;

    public Carta(Valor valor, Naipe naipe) {
        this.naipe = naipe;
        this.valor = valor;
    }

    public Carta() {
    }

    public static Carta getInstance(){
        return instanciaCarta;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    public Valor getValor() {
        return valor;
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "naipe=" + naipe +
                ", valor=" + valor +
                '}';
    }
}

