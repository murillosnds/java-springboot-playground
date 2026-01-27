package com.example.televisao;

class TV {
    private String modelo;
    private double tamanho;
    private String tipo;
    private String cor;
    private boolean ligada;
    private int volume;
    public static final int VOLUME_MAX = 100;
    public static final int VOLUME_MIN = 0;
    
    public TV() {
        modelo = "TV-5249";
        tamanho = 50; // Polegadas.
        tipo = "plana";
        cor = "preta";
        ligada = false;
        volume = 20;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public double getTamanho() {
        return tamanho;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public String getCor() {
        return cor;
    }
    
    public boolean isLigada() {
        return ligada;
    }
    
    public int getVolume() {
        return volume;
    }
    
    public void ligar() {
        if (ligada) {
            System.out.println("A televisão já está ligada.");
            return;
        }
        
        System.out.println("A televisão foi ligada.");
        ligada = true;
    }
    
    public void desligar() {
        if (!ligada) {
            System.out.println("A televisão já está desligada.");
            return;
        }
        
        System.out.println("A televisão foi desligada.");
        ligada = false;
    }
    
    // Especificações: hardware e características físicas.
    public void verEspecificacoes() {
        System.out.printf("Especificações: Modelo: %s | tamanho: %.2f | tipo: %s | cor: %s.%n",
             modelo, tamanho, tipo, cor);
    }
    
    public void aumentarVolume() {
        
        if (!ligada) {
            System.out.println("Televisão está desligada.");
            return;
        }
        
        if (volume == VOLUME_MAX) {
            System.out.println("O volume já está no máximo.");
            return;
        }
        
        volume++;
        System.out.println("Volume atual: " + volume);
    }
    
    public void diminuirVolume() {
        
        if (!ligada) {
            System.out.println("Televisão está desligada.");
            return;
        }
        
        if (volume == VOLUME_MIN) {
            System.out.println("O volume já está no mínimo.");
            return;
        }
        
        volume--;
        System.out.println("Volume atual: " + volume);
    }
}

public class Main {
    public static void main(String[] args) {
        TV televisao = new TV();
        televisao.verEspecificacoes();
        televisao.ligar();
        televisao.diminuirVolume();
        televisao.aumentarVolume();
        televisao.desligar();
    }
}