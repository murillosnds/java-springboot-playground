class Garrafa {

    private boolean tampada;
    private int capacidade;

    Garrafa() {
        tampada = true;
        capacidade = 100;
    }

    void abrir () {
        if (!tampada) {
            System.out.println("A garrafa já está aberta.");
        } else {
            System.out.println("Garrafa aberta.");
            tampada = false;
        } 
    }

    void fechar() {
        if (tampada) {
            System.out.println("A garrafa já está fechada.");
        } else {
            System.out.println("Garrafa fechada.");
            tampada = true;
        }
    }

        void tomar() {
        if (tampada) {
            System.out.println("A garrafa já está tampada.");
            return;
        }

        if (capacidade == 0) {
            System.out.println("Não há água na garrafa.");
            return;
        }

        System.out.println("Água tomada.");
        capacidade--;
    }
}

public class Main {
    public static void main(String[] args) {
            Garrafa minhaGarrafa = new Garrafa();
            minhaGarrafa.abrir();
            minhaGarrafa.tomar();
            minhaGarrafa.fechar();
        }
}