class Garrafa {

    boolean tampada = true;
    double capacidade = 100;

    void Abrir () {
        if (!tampada) {
            System.out.println("A garrafa já está aberta.");
        } else {
            System.out.println("Garrafa aberta.");
            tampada = false;
        }
    }

    void Fechar() {
        if (tampada) {
            System.out.println("A garrafa já está fechada.");
        } else {
            System.out.println("Garrafa fechada.");
            tampada = true;
        }
    }

    void Tomar() {
        if (capacidade <= 1) {
            System.out.println("Não há água na garrafa.");
        } else {
            System.out.println("Água tomada.");
            capacidade --;
        }
    }
}

public class Main {
    public static void main(String[] args) {
            Garrafa minha_garrafa = new Garrafa();
            minha_garrafa.Abrir();
            minha_garrafa.Tomar();
            minha_garrafa.Fechar();
        }
}