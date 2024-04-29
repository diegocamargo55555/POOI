public class Main {
    public static void main(String[] args) {
        int n1 = 5, n2 = 8, n3 = 4, n4 = 13, n5 = 3;
        System.out.println("soma1 = " + soma(n1, n2, n3, n4, n5));
    }
    public static int soma(int...args){
        int soma = 0;
        for (int i : args){
            soma += i;
        }
        return soma;
    }
}