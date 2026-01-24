package com.example.garrafa;

class Garrafa {

    private boolean tampada;
    private int capacidade;

    int getCapacidade() {
    return capacidade;
    }

    Garrafa() {
        tampada = true;
        capacidade = 100;
    }

    void abrir () {
        if (!tampada) {
            System.out.println("A garrafa já está aberta.");
            return;
        }
            System.out.println("Garrafa aberta.");
            tampada = false;
    } 

    void fechar() {
        if (tampada) {
            System.out.println("A garrafa já está fechada.");
            return;
        } 
            System.out.println("Garrafa fechada.");
            tampada = true;
    }

    void tomar() {
        if (tampada) {
            System.out.println("A garrafa está tampada.");
            return;
        }

        if (capacidade == 0) {
            System.out.println("Não há água na garrafa.");
            return;
        }

        System.out.println("Água tomada.");
        capacidade--;
    }

    void encher() {
        if (tampada) {
            System.out.println("A Garrafa está fechada");
            return;
        }

        if (capacidade == 100) {
            System.out.println("Garrafa está cheia.");
            return;
        }

        System.out.println("Garrafa enchida.");
        capacidade = 100;
    }
}

public class Main {
    public static void main(String[] args) {
            Garrafa minhaGarrafa = new Garrafa();
            minhaGarrafa.abrir();
            minhaGarrafa.tomar();
            minhaGarrafa.encher();
            minhaGarrafa.fechar();
    }
}