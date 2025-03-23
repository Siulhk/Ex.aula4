public class TurmaApp {
    public static void main(String[] args) {
        Turma turma1 = new Turma();
        turma1.setCurso("Ciência da computação");
        turma1.setDisciplina("POOI TA");

        System.out.println("Curso: " + turma1.getCurso());
        System.out.println("Disciplina: " + turma1.getDisciplina());

        turma1.exibeDados();

        Turma turma2 = new Turma();
        turma2.setCurso("Ciência da computação");
        turma2.setDisciplina("POOI TB");

        System.out.println("Curso: " + turma2.getCurso());
        System.out.println("Disciplina: " + turma2.getDisciplina());

        turma2.exibeDados();
    }
}
