public class Main {
    public static void main(String[] args){
        int array[] = {5,8,4,13,3,6};
        int dif=0, x = 5, maior_count =0, menor_count= 0, igual_count = 0;
        for (int i =0; i < array.length-1; i++){
            if (array[i] - array[i+1] > dif){
                dif = array[i] - array[i+1];
            }
            else if (array[i+1] - array[i] > dif){
                dif = array[i+1] - array[i];
            }
        }
        for (int i: array){
            if (x < i) {
                maior_count++;
            }
            if (x > i) {
                menor_count++;
            }
            if (x == i) {
                igual_count++;
            }
        }
    }
}