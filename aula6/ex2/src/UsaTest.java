public class UsaTest {

    public static void main(String[] args) {
        Test test1 = new Test(5);
        Test test2 = new Test(10);

        System.out.println("Antes da troca");
        System.out.println("ob1.a = " + test1.getA());
        System.out.println("ob2.a = " + test2.getA());
        troca (test1, test2);

        System.out.println("Depois da troca");
        System.out.println("ob1.a = " + test1.getA());
        System.out.println("ob2.a = " + test2.getA());
    }
    public static void troca(Test g, Test a) {
        Test temp = g;
        g = a;
        a = temp;
    }
}