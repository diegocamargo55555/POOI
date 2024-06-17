public class ex3 {
    public static void main(String args[]) {
        String plavra = "dadwdawdawd";

        verificarPalavra(plavra);

    }
    public static void verificarPalavra(String str){
        int n = str.length();

        if (n > 7) {
            String word = "";

            word += str.charAt(0);
            word += str.charAt(1);
            word += str.charAt(n - 1);
            word += str.charAt(n - 2);

            System.out.println(": " + word);
        }
    }
}