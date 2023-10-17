public class Pessoa {

    private String name;
    private String gender;

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public Pessoa(String name, String genre) {
        this.name = name;
        this.gender = genre;
    }

    public Pessoa() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
