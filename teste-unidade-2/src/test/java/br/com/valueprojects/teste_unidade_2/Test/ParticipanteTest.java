package br.com.valueprojects.teste_unidade_2.Test;

import org.junit.jupiter.api.Test;

import br.com.valueprojects.teste_unidade_2.builder.CriadorDeJogo;
import br.com.valueprojects.teste_unidade_2.dominio.Jogo;
import br.com.valueprojects.teste_unidade_2.dominio.Participante;
import br.com.valueprojects.teste_unidade_2.dominio.Resultado;

import static org.junit.jupiter.api.Assertions.*;

public class ParticipanteTest {
    @Test
    public void comparaIdNomeParticipanteTest() {
        Participante participante = new Participante(1, "Joao");

        assertEquals(1, participante.getId());
        assertEquals("Joao", participante.getNome());
    }

    @Test
    public void deveRetornarVerdadeiroParaParticipanteIgual() {
        Participante p1 = new Participante(1, "Joao");
        Participante p2 = new Participante(1, "Joao");
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p1));
    }

    @Test
    public void deveRetornarVerdadeiroParaMesmaInstancia() {
        Participante p1 = new Participante(1, "Joao");
        assertTrue(p1.equals(p1));
    }

    @Test
    public void deveRetornarFalsoParaIdsDiferentes() {
        Participante p1 = new Participante(1, "Joao");
        Participante p2 = new Participante(2, "Joao");
        assertFalse(p1.equals(p2));
    }

    @Test
    public void deveRetornarFalsoParaNomesDiferentes() {
        Participante p1 = new Participante(1, "Joao");
        Participante p2 = new Participante(1, "Pedro");
        assertFalse(p1.equals(p2));
    }

    @Test
    public void deveRetornarFalsoParaObjetoNulo() {
        Participante p1 = new Participante(1, "Joao");
        assertFalse(p1.equals(null));
    }

    @Test
    public void deveRetornarFalsoParaTiposDiferentes() {
        Participante p1 = new Participante(1, "Joao");
        assertFalse(p1.equals(new String("Joao")));
    }

    @Test
    public void deveRetornarVerdadeiroSeNomesNulosSaoIguais() {
        Participante p1 = new Participante(1, null);
        Participante p2 = new Participante(1, null);

        assertTrue(p1.equals(p2));
    }

    @Test
    public void deveRetornarFalsoSeUmNomeNuloEOutroNao() {
        Participante p1 = new Participante(1, null);
        Participante p2 = new Participante(1, "Joao");

        assertFalse(p1.equals(p2));
    }
}

