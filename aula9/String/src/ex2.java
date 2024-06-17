public class ex2 {
    public static void main(String args[]) {
        String str1 = "a ";
        String str2 = " 1";
        System.out.println(args[0] + args[1]);

        System.out.println(args[0].equals(args[1])); // Returns true because they are equal

        System.out.println(args[0].equalsIgnoreCase(args[1]));
    }
}
