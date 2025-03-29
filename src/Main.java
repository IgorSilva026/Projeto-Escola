import model.*;

public class Main {
    public static void main(String[] args) {

    Escola escola = new Escola("Escola Igor");

    Aluno aluno = new Aluno("Aluno Igor",20,"7");
    Aluno aluno01 = new Aluno("Aluno Fernando",40,"12");
    Aluno aluno02 = new Aluno("Aluno Lucilene",50,"20");
    Aluno aluno03 = new Aluno("Aluno Emilly",20,"31");

    Professor professor = new Professor("Professor João", 20, "Python");
    Professor professor01 = new Professor("Professor Alfredo", 50, "MySQL");
    Professor professor02 = new Professor("Professor Thiago", 40, "C++");
    Professor professor03 = new Professor("Professor Luiz", 60, "CSS");

    escola.adicionaProfessor(professor);
    escola.adicionaProfessor(professor01);
    escola.adicionaProfessor(professor02);
    escola.adicionaProfessor(professor03);

    escola.adicionaAluno(aluno);
    escola.adicionaAluno(aluno01);
    escola.adicionaAluno(aluno02);
    escola.adicionaAluno(aluno03);

    escola.listarAlunos();

    System.out.println("=========================");

    escola.listarProfessores();

    System.out.println("=========================");


    Turma turma = new Turma("JAVA",2025,professor);
    Disciplina disciplina = new Disciplina("TI", 80, professor);
    turma.listarAlunos();
    disciplina.exibirDestalhes();


    }
}