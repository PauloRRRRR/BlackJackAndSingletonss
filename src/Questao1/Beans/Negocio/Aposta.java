package Questao1.Beans.Negocio;

import Questao1.Beans.Beans.Baralho;
import Questao1.Beans.Beans.Jogador;
import Questao1.Beans.Dados.Mesa;

import java.util.Scanner;

public class Aposta {
    private static int disputas;
    private Jogador jogador;
    private int valorAposta;
    private Mesa mesa;
    private boolean rodada;

    public Aposta(Jogador jogador, int valorAposta) {
        this.jogador = jogador;
        this.valorAposta = valorAposta;
        this.mesa = Mesa.getInstance();
        this.disputas = 1;
        this.rodada = false;
    }

    public void escolha(Aposta aposta1, Jogador j1){
        do {
            System.out.println("O que deseja fazer 1 - Pedir carta / 2 - Parar ");
            Scanner sc = new Scanner(System.in);
            int escolha = sc.nextInt();
            if (escolha == 1) {
                aposta1.hit(j1);
            }
            if (escolha == 2) {
                aposta1.stay(j1);
            }
        }while(disputas<8);
        if(j1.getFichas()>100){
            System.out.println("PARABÉNS VITORIA TOTAL DO JOGADOR: "+j1);
        }
        else if(j1.getFichas()<100){
            System.out.println("QUE PENA VOCE PERDEU FICHAS");
        }
    }

    public void terminarDisputa(){
        disputas = disputas+1;
    }

    public void hit(Jogador jogador) {
        if(jogador!=null) {
                    jogador.hit(mesa.tirarCarta());
                    if(mesa.getDeck().getCartas().size() == 1){
                        mesa.setDeck(new Baralho());
                    }
            System.out.println(""+jogador.getCartas());
                    if (jogador.verificarValorCartas() > 21) {
                        System.out.println("Derrota do jogador: " + jogador);
                        jogador.setFichas(jogador.getFichas() - valorAposta);
                        mesa.setFichasMesa(mesa.getFichasMesa() + valorAposta);
                        mesa.setCartasMesa(mesa.getDeck().getCartas());
                        jogador.getCartas().clear();
                        terminarDisputa();
                    }
                    if (jogador.verificarValorCartas() == 21) {
                        System.out.println("Fez 21 o jogador: " + jogador);
                        jogador.setFichas(jogador.getFichas() + valorAposta);
                        mesa.setFichasMesa(mesa.getFichasMesa() - valorAposta);
                        mesa.setCartasMesa(mesa.getDeck().getCartas());
                        jogador.getCartas().clear();
                        terminarDisputa();
                    }
                }
            }


    public void stay(Jogador jogador) {
        mesa.stay(jogador);
            if(jogador.verificarValorCartas()>mesa.verificarValorCartasMesa()){
                System.out.println("Jogador venceu");
                jogador.setFichas(jogador.getFichas()+20);
                jogador.getCartas().clear();
                terminarDisputa();
            }
            else if(jogador.verificarValorCartas()<mesa.verificarValorCartasMesa()){
                System.out.println("Jogador perdeu");
                jogador.setFichas(jogador.getFichas()-20);
                jogador.getCartas().clear();
                terminarDisputa();
            }
        }

    public Jogador getJogadores() {
        return jogador;
    }

    public void setJogadores(Jogador jogador) {
        this.jogador = jogador;
    }

    public int getValorAposta() {
        return valorAposta;
    }

    public void setValorAposta(int valorAposta) {
        this.valorAposta = valorAposta;
    }
}
