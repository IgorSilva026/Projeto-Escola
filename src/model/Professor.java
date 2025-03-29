package model;

public class Professor {

    private String nomeProfessor;
    private String iadeProfessor;
    private String materiaProfessor;

    public Professor(String nomeProfessor, String iadeProfessor, String materiaProfessor) {
        this.nomeProfessor = nomeProfessor;
        this.iadeProfessor = iadeProfessor;
        this.materiaProfessor = materiaProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public String getIadeProfessor() {
        return iadeProfessor;
    }

    public String getMateriaProfessor() {
        return materiaProfessor;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nomeProfessor='" + nomeProfessor + '\'' +
                ", iadeProfessor='" + iadeProfessor + '\'' +
                ", materiaProfessor='" + materiaProfessor + '\'' +
                '}';
    }
}

