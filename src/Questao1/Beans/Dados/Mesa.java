package Questao1.Beans.Dados;

import Questao1.Beans.Beans.Baralho;
import Questao1.Beans.Beans.Carta;
import Questao1.Beans.Beans.Jogador;

import java.util.ArrayList;

public class Mesa {
    private static Mesa mesa;
    private ArrayList<Carta> cartasMesa;
    private Baralho deck;
    private Carta cartaAtual;
    private int fichasMesa;

    public Mesa() {
        deck = Baralho.getInstance();
        cartasMesa = new ArrayList<>();
        cartasMesa = deck.getCartas();
        fichasMesa = 200;
        cartaAtual = deck.drawCard();
    }

    public static Mesa getInstance(){
        if(mesa == null){
            mesa = new Mesa();
        }
        return mesa;
    }

    public int verificarValorCartasMesa(){
        int valor = 0;
        for(Carta f: cartasMesa){
            valor = valor+f.getValor().getNumero();
        }
        return valor;
    }

    public Carta getCartaAtual() {
        return cartaAtual;
    }

    public void setCartaAtual(Carta cartaAtual) {
        this.cartaAtual = cartaAtual;
    }

    public Carta tirarCarta(){
        if(deck == null){
            deck = Baralho.getInstance();
        }
        cartaAtual = deck.drawCard();
        cartasMesa.add(cartaAtual);
        System.out.println(cartaAtual.toString());
        return cartaAtual;
    }

    public void stay(Jogador jogador){
        if(jogador.getFichas()<100){
            System.out.println("Derrota do jogador: "+jogador);
        }
        else if(jogador.getFichas()>100){
            System.out.println("Vitoria do jogador: "+jogador);
        }
        else{
            System.out.println("Empate da mesa e do jogador: "+jogador);
        }
    }

    public int getFichasMesa() {
        return fichasMesa;
    }

    public void setFichasMesa(int fichasMesa) {
        this.fichasMesa = fichasMesa;
    }

    public ArrayList<Carta> getCartasMesa() {
        return cartasMesa;
    }

    public void setCartasMesa(ArrayList<Carta> cartasMesa) {
        this.cartasMesa = cartasMesa;
    }

    public Baralho getDeck() {
        return deck;
    }

    public void setDeck(Baralho deck) {
        this.deck = deck;
    }
}
