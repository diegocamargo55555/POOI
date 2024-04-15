public class test {
    public static  void main(String[] args){
        universidade uni1 = new universidade();
        uni1.nome = "unicentro";
        uni1.cidade = "bauru";
        uni1.estado = "PR";

        aluno aluno1 = new aluno();
        aluno1.nome = "gabi";
        aluno1.curso = "engenharia";

        uni1.exibeDados();
        aluno1.exibeDados();
    }
}
