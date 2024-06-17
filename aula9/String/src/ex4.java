public class ex4 {
    public static void main(String args[]) {
        System.out.println(processa("ola"));
    }
    public static String processa(String str){
        if (str.isEmpty()){
            return str;
        }
        else
            return str.toUpperCase();
    }
}
