package model;

public class Professor {

    private String nomeProfessor;
    private int idadeProfessor;
    private String materiaProfessor;

    public Professor(String nomeProfessor, int idadeProfessor, String materiaProfessor) {
        this.nomeProfessor = nomeProfessor;
        this.idadeProfessor = idadeProfessor;
        this.materiaProfessor = materiaProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public int getIdadeProfessor() {
        return idadeProfessor;
    }

    public String getMateriaProfessor() {
        return materiaProfessor;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nomeProfessor = '" + nomeProfessor + '\'' +
                ", iadeProfessor = '" + idadeProfessor + '\'' +
                ", materiaProfessor = '" + materiaProfessor + '\'' +
                '}';
    }
}

