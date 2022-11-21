package org.example;

import java.util.Arrays;

public class UC {
    private String nomeUC;
    private Nota[] notas;
    private int totalAlunos;

    public UC(String nomeUC, int totalAlunos) {
        this.nomeUC = nomeUC;
        this.notas = new Nota[totalAlunos];
        this.totalAlunos = totalAlunos;
    }

    public Nota[] getNotas() {
        return notas;
    }

    public boolean insereNotaUC(int numAluno, double nota) {
        if (numAluno < 0 || nota < 0)
            return false;
        if (nota > 20) {
            return false;
        }
            Nota novaNota = new Nota(numAluno, nota);
            for (int i = 0; i < notas.length; i++) {
                if (notas[i] == null) {
                    notas[i] = novaNota;
                    System.out.println(Arrays.toString(notas));
                    return true;
                }
            }
        return false;
    }

        public boolean pesquisaAluno(int numAluno){
            for(Nota n : notas){
                if(n != null && n.getNumAluno() == numAluno){
                    return true;
                }
            }
            return false;
        }


    public double media() {
        double sum = 0;
        for(Nota notas : notas) {
            sum += notas.getNota();
        }
        return sum/notas.length;
    }
        public boolean aprovado(int numAluno){
            for (Nota n : notas) {
                if (n != null && n.getNumAluno() == numAluno) {
                    return n.getNota() >= 9.5;
                }
            }
            System.out.println("Aluno reprovou");
            return false;
        }

    }
