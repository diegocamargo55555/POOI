public class Estudante extends Pessoa implements Falante{

    public Estudante(String name, int age){
         super(name, age);

    }


    public void falar(){
        System.out.println("Olá, eu sou estudante de Ciência da Computação!");
    }
    public void identificarSe(){
        System.out.println("Eu sou estudante: " + getNome());
    }

    public String seuIdioma(){
        return "portugues";
    }


}
