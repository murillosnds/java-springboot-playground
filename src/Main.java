class Garrafa {

    private boolean tampada = true;
    private int capacidade = 100;

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
            if (!tampada) {
                if (capacidade == 0) {
                    System.out.println("Não há água na garrafa.");
                } else {
                    System.out.println("Água tomada.");
                    capacidade --;
                }
        }  else {
            System.out.println("A garrafa está fechada");
        }
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