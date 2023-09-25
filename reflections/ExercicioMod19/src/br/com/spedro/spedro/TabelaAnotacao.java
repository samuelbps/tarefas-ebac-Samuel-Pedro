package br.com.spedro.spedro;
@Tabela(value = "Primeira")
public class TabelaAnotacao {
    @Tabela(value = "Tabela")
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
