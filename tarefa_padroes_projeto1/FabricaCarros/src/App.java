

public class App {
    public static void main(String[] args) {
        //Qual fabrica vai ser
        AbstractFactory abstractFactory1 = Producer.getFactory(true);

        Carro onix = abstractFactory1.getBrand("ONIX");
        onix.build();
        Carro cruze = abstractFactory1.getBrand("CRUZE");
        cruze.build();

        //Qual fabrica vai ser
        AbstractFactory abstractFactory2 = Producer.getFactory(false);

        Carro civic = abstractFactory2.getBrand("civic");
        civic.build();
        Carro fit = abstractFactory2.getBrand("fit");
        fit.build();
    }
}
