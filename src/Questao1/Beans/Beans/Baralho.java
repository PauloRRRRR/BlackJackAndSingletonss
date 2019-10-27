package Questao1.Beans.Beans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Baralho extends Carta {
    private static Baralho deckPrincipal;
    private ArrayList<Carta> cartas;
    private Carta carta;

    public Baralho() {
        this.cartas = new ArrayList();
        for (int i=0; i<13; i++)
        {
            Valor valor = Valor.values()[i];

            for (int j=0; j<4; j++)
            {
                Carta carta = new Carta(valor, Naipe.values()[j]);
                this.cartas.add(carta);
            }
        }

        Collections.shuffle(cartas);

        Iterator cardIterator = cartas.iterator();
        while (cardIterator.hasNext())
        {
            Carta aCard = (Carta) cardIterator.next();
            System.out.println(aCard.getValor() + " of " + aCard.getNaipe());
        }
    }

    public static Baralho getInstance(){
        if(deckPrincipal == null){
            deckPrincipal = new Baralho();
        }
        return deckPrincipal;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public Carta drawCard(){
        Carta cartaTopo = this.cartas.get(0);
        this.cartas.remove(this.cartas.get(0));
        return cartaTopo;
    }

    public void embaralhar(){
        Collections.shuffle(cartas);
    }

    public String toString() {
        String retorno = "[ ";
        for(Carta c: cartas) {
            retorno += c.toString() + " , ";
        }
        return retorno + " ]";
    }

}
