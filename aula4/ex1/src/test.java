public class test {
    public static void main(String[] args){
        turma turma1 = new turma();
        turma1 .setCurso("Ciencia da computação");
        turma1.setDisciplina("POOI");

        System.out.println("curso: "+ turma1.getCurso() + "\nDisciplina: " + turma1.getDisciplina() );


        turma1.imprime();
    }




}
