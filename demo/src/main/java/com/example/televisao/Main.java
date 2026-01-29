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
    
    public boolean ligar() {
        if (ligada) {
            return false;
        }

        ligada = true;
        return true;
    }
    
    public boolean desligar() {
        if (!ligada) {
            return false;
        }

        ligada = false;
        return true;
    }

    public enum ResultadoVolume {
    OK,
    TV_DESLIGADA,
    VOLUME_MAXIMO,
    VOLUME_MINIMO
    }
    
    public ResultadoVolume aumentarVolume() {
        if (!ligada) {
            return ResultadoVolume.TV_DESLIGADA;
        }
        
        if (volume == VOLUME_MAX) {
            return ResultadoVolume.VOLUME_MAXIMO;
        }
        
        volume++;
        return ResultadoVolume.OK;
        
    }
    
    public ResultadoVolume diminuirVolume() {
        
        if (!ligada) {
            return ResultadoVolume.TV_DESLIGADA;
        }
        
        if (volume == VOLUME_MIN) {
            return ResultadoVolume.VOLUME_MINIMO;
        }
        
        volume--;
        return ResultadoVolume.OK;
    }
}

class TVEspecificacoes {

    // Especificações: hardware e características físicas.
    public static String formatarEspecificacoes(TV tv) {
        return String.format(
            "Especificações: Modelo: %s | tamanho: %.2f | tipo: %s | cor: %s.",
            tv.getModelo(),
            tv.getTamanho(),
            tv.getTipo(),
            tv.getCor()
        );
    }
}

public class Main {
    public static void main(String[] args) {
        TV televisao = new TV();
        System.out.println(TVEspecificacoes.formatarEspecificacoes(televisao));

        if (televisao.ligar()) {
            System.out.println("Televisão ligada.");
        } else {
            System.out.println("Televisão já está ligada.");
        }

        switch (televisao.aumentarVolume()) {
            case OK:
                System.out.printf("Volume atual: %d%n", televisao.getVolume());
                break;
            case TV_DESLIGADA:
                System.out.println("Televisão está desligada.");
                break;
            case VOLUME_MAXIMO:
                System.out.println("Televisão já está no volume máximo.");
            default:
                break;
        }
        
        switch (televisao.diminuirVolume()) {
            case OK:
                System.out.printf("Volume atual: %d%n", televisao.getVolume());
                break;
            case TV_DESLIGADA:
                System.out.println("Televisão está desligada.");
                break;
            case VOLUME_MINIMO:
                System.out.println("Televisão já está no volume mínimo.");
                break;
            default:
                break;
        }

        if (televisao.desligar()) {
            System.out.println("Televisão desligada.");
        } else {
            System.out.println("Televisão já está desligada.");
        }
    }
}