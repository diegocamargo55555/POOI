public class main {
    public static void main(String[] args){
        Series jjk[] = new Series[2];

        jjk[0] = new MaisDois();
        jjk[1] = new MaisTrês();


        for (int i = 0; i < 5; i++){
            System.out.println(jjk[0].getNext());
        }
        System.out.println("--------");
        jjk[0].reset();
        for (int i = 0; i < 5; i++){
            System.out.println(jjk[0].getNext());
        }
        System.out.println("--------");
        jjk[0].setStart(100);
        for (int i = 0; i < 5; i++){
            System.out.println(jjk[0].getNext());
        }
        System.out.println("--------");
        System.out.println("--------");

        for (int i = 0; i < 5; i++){
            System.out.println(jjk[1].getNext());
        }
        System.out.println("--------");
        jjk[1].reset();
        for (int i = 0; i < 5; i++){
            System.out.println(jjk[1].getNext());
        }
        System.out.println("--------");
        jjk[1].setStart(100);
        for (int i = 0; i < 5; i++){
            System.out.println(jjk[1].getNext());
        }




    }






}
