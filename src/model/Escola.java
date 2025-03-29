package model;

import java.util.ArrayList;

public class Escola {

    private String nomeEscola;
    private ArrayList<Professor> professores;
    private ArrayList<Aluno> alunos;

    public Escola(String nome) {
        this.nomeEscola = nome;
        this.professores = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    public void adicionaProfessor(Professor professor) {
        professores.add(professor);
    }
    public void adicionaAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarProfessores() {
        System.out.println("Lista de professores");
        for (Professor professor : professores) {
            System.out.println(professor);
        }
    }

    public void listarAlunos() {
        System.out.println("Lista de alunos");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

}
