package model;

public class Aluno {
    //alt+insert - construtor

    private String nomeAluno;
    private int idadeAluno;
    private String matriculaAluno;

    public Aluno(String nomeAluno, int idadeAluno, String matriculaAluno) {
        this.nomeAluno = nomeAluno;
        this.idadeAluno = idadeAluno;
        this.matriculaAluno = matriculaAluno;
    }


    //alt+insert - getter

    public String getNomeAluno() {
        return nomeAluno;
    }

    public int getIdadeAluno() {
        return idadeAluno;
    }

    public String getMatriculaAluno() {
        return matriculaAluno;

    }

    //alt+insert - topString

    @Override
    public String toString() {
        return "Aluno{" +
                "nomeAluno = '" + nomeAluno + '\'' +
                ", idadeAluno = " + idadeAluno +
                ", matriculaAluno = '" + matriculaAluno + '\'' +
                '}';
    }
}
