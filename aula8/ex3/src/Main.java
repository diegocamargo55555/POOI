public class Main {
    public static void main(String args[]){
        double [] array = {8,5,4,13,3};
        double sum = 0, media = 0;

        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        media = sum /array.length;
    }
}