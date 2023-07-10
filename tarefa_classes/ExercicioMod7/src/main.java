public class main {

    public static void main(String args[]){
        Produto produto = new Produto();
        //Setando valores do produto
        produto.setPreco(2);
        produto.setName("Borracha");
        produto.setType("Material Escolar");

        produto.imprimir();
    }
}
