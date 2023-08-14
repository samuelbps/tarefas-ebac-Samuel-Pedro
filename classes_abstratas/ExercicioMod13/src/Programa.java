public class Programa {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Lucas");
        pessoaFisica.setCpf("999.999.999-x");

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Julia");
        pessoaJuridica.setCnpj("XX.XXX.XXX/0001-XX");

        System.out.println("O cliente fisico " + pessoaFisica.getNome() + " de CPF: " + pessoaFisica.getCpf() );
        System.out.println("A cliente juridica " + pessoaJuridica.getNome() + " de CPF: " + pessoaJuridica.getCnpj() );
    }
}
