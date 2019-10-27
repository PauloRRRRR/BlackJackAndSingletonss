package Questao1.Beans.GUI;

import Questao1.Beans.Beans.Jogador;
import Questao1.Beans.Dados.Mesa;
import Questao1.Beans.Negocio.Aposta;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Jogador j1 = new Jogador();
        ArrayList<Jogador> jogadores = new ArrayList<>(6);

        Aposta aposta1 = new Aposta(j1, 10);
        Mesa mesa = new Mesa();
        System.out.println("O jogador recebe a seguinte carta: ");
        aposta1.hit(j1);
        aposta1.escolha(aposta1,j1);
    }

}
