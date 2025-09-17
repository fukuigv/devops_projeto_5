package br.com.valueprojects.teste_unidade_2.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.valueprojects.teste_unidade_2.builder.CriadorDeJogo;
import br.com.valueprojects.teste_unidade_2.dominio.Jogo;
import br.com.valueprojects.teste_unidade_2.dominio.Participante;
import br.com.valueprojects.teste_unidade_2.dominio.Resultado;

public class ParticipanteTest {
    @Test
    public void comparaIdNomeParticipanteTest() {
        Participante participante = new Participante(1, "Joao");

        assertEquals(1, participante.getId());
        assertEquals("Joao", participante.getNome());
    }
}
