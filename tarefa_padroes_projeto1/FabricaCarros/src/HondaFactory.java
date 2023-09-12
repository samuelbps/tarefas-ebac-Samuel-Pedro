public class HondaFactory extends AbstractFactory{
    @Override
    public Carro getBrand(String carModel) {
       if (carModel.equalsIgnoreCase("CIVIC")){
           return new Civic();
       }else if (carModel.equalsIgnoreCase("FIT")){
      return new Fit();
        }
        return null;
    }
}
