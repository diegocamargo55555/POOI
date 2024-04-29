import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        Compositor D5 = new Compositor("Diego", "55555.");
        Compositor L8 = new Compositor("Luminous", "88888.");

        //Compositor [] array = new Compositor[];


        List<Compositor> array = new ArrayList<Compositor>();
        array.add(D5);
        array.add(L8);

    }
}
