package com.example.garrafa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class GarrafaTest {
    @Test
    void garrafaNovaComecaCheia() {
        Garrafa g = new Garrafa();
        assertEquals(100, g.getCapacidade());
    }

    @Test
    void naoDeveBeberComGarrafaFechada() {
        Garrafa g = new Garrafa();
        g.tomar();
        assertEquals(100, g.getCapacidade());
    }

    @Test
    void deveBeberQuandoAberta() {
        Garrafa g = new Garrafa();
        g.abrir();
        g.tomar();
        assertEquals(99, g.getCapacidade());
    }

    @Test
    void encherDeixaSempreCheia() {
        Garrafa g = new Garrafa();
        g.abrir();
        g.tomar();
        g.tomar(); 
        g.encher();
        assertEquals(100, g.getCapacidade());
    }

    @Test
    void capacidadeNuncaFicaNegativa() {
        Garrafa g = new Garrafa();
        g.abrir();

        for (int i = 0; i < 200; i++) {
            g.tomar();
        }

        assertEquals(0, g.getCapacidade());
    }
}