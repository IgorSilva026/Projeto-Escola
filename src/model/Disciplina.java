package model;

public class Disciplina {
    private String nomeDisciplina;
    private int cargaHoraria;
    private Professor professor;

    public Disciplina(String nomeDisciplina, int cargaHoraria, Professor professor) {
        this.nomeDisciplina = nomeDisciplina;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
    }
    public void exibirDestalhes(){
        System.out.println("Nome da Disciplina: " + nomeDisciplina);
        System.out.println("Carga Horaria: " + cargaHoraria);
        System.out.println("Professor da Matéria: " + professor.getNomeProfessor());
    }
}
