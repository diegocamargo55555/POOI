public class Main {
    public static void main(String[] args){
        int m[][] = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++)
            m[i][j] = 3+j;
        }
        for(int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++)
                System.out.print(m[i][j] + " ");

            System.out.println("\n");
        }
    }



}