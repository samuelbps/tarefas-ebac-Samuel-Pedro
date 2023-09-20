import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class App {

    public static void main(String[] args) {
       List<Carro> listaCarros = new ArrayList<Carro>();

       Onix onix = new Onix("Onix", 100000.0);
       Civic civic = new Civic("Civic", 120000.0);

       listaCarros.add(onix);
       listaCarros.add(civic);
        System.out.println(listaCarros);


    }
}
