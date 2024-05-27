public class test {
    public static void main(String[] arg) {
        Animal el = new Animal();
        Gato gabii = new Gato();
        Cachorro au = new Cachorro();
        Preguiça flash = new Preguiça();

        // o polimorfismo ocorre no metodo emitirSom()
        gabii.emitirSom();
        el.emitirSom();
        au.emitirSom();
        flash.emitirSom();

    }
}
