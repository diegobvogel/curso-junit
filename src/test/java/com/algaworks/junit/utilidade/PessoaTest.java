package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void assercaoAgrupada(){
        Pessoa pessoa = new Pessoa("Diego", "Vogel");
            assertAll("Asserções de Pessoa",
            () -> assertEquals("Diego", pessoa.getNome()),
            () -> assertEquals("Vogel", pessoa.getSobrenome())
        );
    }

}