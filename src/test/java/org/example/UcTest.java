package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class UcTest{

    private UC uc;

    @BeforeAll
    public static void setupAll(){
        System.out.println("Should print before All test");
    }
    @BeforeEach
    public void setup(){
        System.out.println("Instantiating Uc Manager");
        uc = new UC("QA",26);
        uc.insereNotaUC(1,17);
        uc.insereNotaUC(-1,-1);
        uc.insereNotaUC(2017,20);
        uc.insereNotaUC(2,20);
        uc.insereNotaUC(20,7);
    }
    @ParameterizedTest
    @DisplayName("Deve criar uma nota")
    @CsvSource(value = {"1, 10", "2, 10","3,20","4,12","5,23"})
    public void inserirNotaTest(int arg, int arg2){
        assertTrue(uc.insereNotaUC(arg,arg2),"Nota Invalida");
    }

    @ParameterizedTest
    @DisplayName("Pesquisar alunos")
    @ValueSource(ints ={20,40,1,2017})
    public void pesquisarAlunoTest(int arg){
        assertTrue(uc.pesquisaAluno(arg),"Aluno nao existe");
    }
    @Test
    @DisplayName("Media")
    public void media() {
        assertEquals(18.5, uc.media(),"Media Errada");
    }
    @ParameterizedTest
    @DisplayName("Aprovado")
    @ValueSource(ints ={20,30,2,1})
    public void aprovado(int arg){
        assertTrue(uc.aprovado(arg),"Aluno nao aprovado");
    }

}
