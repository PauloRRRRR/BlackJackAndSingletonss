package Questao1.Beans.Beans;

public enum Valor {
    DOIS(2),TRES(3),QUATRO(4),CINCO(5),SEIS(6),SETE(7),OITO(8),NOVE(9),DEZ(10),VALETE(11),RAINHA(12),REI(13),AS(14);
    private int valor;

    Valor(int i) {
        this.valor = i;
    }
    public int getNumero(){
        return valor;
    }
}
