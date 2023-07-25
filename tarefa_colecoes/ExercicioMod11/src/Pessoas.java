import java.util.Objects;

public class Pessoas implements Comparable<Pessoas>{
   private String name;
   private String sexo;

    public Pessoas(String name, String sexo) {
        this.name = name;
        this.sexo = sexo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return
                name +
                sexo  ;
    }

    @Override
    public int compareTo(Pessoas pessoas) {
        return this.sexo.compareTo(pessoas.getSexo());
    }
}
