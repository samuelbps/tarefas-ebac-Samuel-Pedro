public class ChevroletFactory extends AbstractFactory{
    @Override
   public Carro getBrand(String carModel) {
        if (carModel.equalsIgnoreCase("ONIX")){
            return new Onix();
        }else if (carModel.equalsIgnoreCase("CRUZE")){
            return new Cruze();
        }
        return null;
    }
}
