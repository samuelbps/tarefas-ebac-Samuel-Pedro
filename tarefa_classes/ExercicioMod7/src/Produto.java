public class Produto {

    private int preco;
    private String name;
    private String type;

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

   //Imprimindo as propriedades do Produto
    public void imprimir(){
        System.out.println(this.preco);
        System.out.println(this.name);
        System.out.println(this.type);
    }
}
