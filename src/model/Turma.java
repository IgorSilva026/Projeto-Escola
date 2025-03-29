package model;

import java.util.ArrayList;

public class Turma {
    private String nomeTurma;
    private int anoTurma;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Turma(String nomeTurma, int anoTurma, Professor professor) {
        this.nomeTurma = nomeTurma;
        this.anoTurma = anoTurma;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    public void listarAlunos() {
        System.out.println("Turma: " + nomeTurma + ", ano: " + anoTurma);
        System.out.println("Professor: " + professor.getNomeProfessor());
        System.out.println("Alunos Matriculados");

        for (Aluno aluno : alunos) {
            System.out.println("-" + aluno.getNomeAluno());
        }
    }
}
