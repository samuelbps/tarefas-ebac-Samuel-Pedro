package br.com.spedro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        cadastroPessoas();


    }

    private static void cadastroPessoas() {
        Pessoa pessoa;
        List<Pessoa> list = new ArrayList<Pessoa>();
        int opcao = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Digite 1 para cadastrar uma pessoa, 2 para imprimir uma lista, 3 para filtrar somente as mulheres e 0 para sair");
            opcao = Integer.parseInt(sc.nextLine());

            if (opcao == 1) {
                pessoa = new Pessoa();
                System.out.println("Digite o nome da pessoa: ");
                pessoa.setName(sc.nextLine());
                System.out.println("Digite o sexo da pessoa: ");
                pessoa.setGender(sc.nextLine());
                list.add(pessoa);

            } else if (opcao == 2) {
                if (list.isEmpty()) {
                    System.out.println("Não existem pessoas cadastradas, pressione uma tecla para continuar");
                    sc.nextLine();
                } else {
                    System.out.println(list.toString());

                    System.out.println("Pressione uma tecla para continuar");
                    sc.nextLine();
                }

                         } else if (opcao == 3) {
                if (list.isEmpty()) {
                    System.out.println("Não existem pessoas cadastradas, pressione uma tecla para continuar");
                    sc.nextLine();
                } else {
                    list.stream().filter(p -> p.getGender().equalsIgnoreCase("F"))
                                 .forEach(p -> System.out.println(p));
                }

            }

            }while (opcao != 0);

            sc.close();


    }
}


