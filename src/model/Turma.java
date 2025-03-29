package model;

import java.util.ArrayList;

public class Turma {
    private String nomeTurma;
    private int anoTurma;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Turma(String nomeTurma, int anoTurma, Professor professor, ArrayList<Aluno> alunos) {
        this.nomeTurma = nomeTurma;
        this.anoTurma = anoTurma;
        this.professor = professor;
        this.alunos = alunos;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public int getAnoTurma() {
        return anoTurma;
    }

    public Professor getProfessor() {
        return professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "nomeTurma='" + nomeTurma + '\'' +
                ", anoTurma=" + anoTurma +
                ", professor=" + professor +
                ", alunos=" + alunos +
                '}';
    }
}
