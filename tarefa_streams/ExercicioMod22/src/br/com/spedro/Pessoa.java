package br.com.spedro;

public class Pessoa {

    private String name;
    private String gender;

    public Pessoa(String name, String gender) {
        this.name = name;
        this.gender = gender;
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

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
