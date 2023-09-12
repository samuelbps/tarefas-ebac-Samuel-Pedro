public class Producer {

    public static AbstractFactory getFactory(boolean isChevrolet){
        if(isChevrolet){
            return new ChevroletFactory();
        }else {
            return new HondaFactory();
        }
    }
}
