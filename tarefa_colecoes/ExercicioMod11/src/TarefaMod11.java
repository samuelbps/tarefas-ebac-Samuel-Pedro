import java.lang.reflect.Array;
import java.util.*;

public class TarefaMod11 {

    public static void main(String[] args) {
        exercicio1();

        exercicio2();


    }



    //EX1
    //Ler no console nome de pessoas separado por virgula
    //Separar os valores lidos e guardar em variavel
    //ordenar variavel
    //imprimir console
    //Split
    private static void exercicio1() {
        List<String> lista = new ArrayList<String>();

        lista.add("Luana");
        lista.add("João");
        lista.add("Lucas");
        lista.add("Amanda");
        Arrays.toString(lista.toString().split(","));
        System.out.println("Lista não ordenada: " + lista);
        Collections.sort(lista);
        System.out.println("Lista ordenada: " + lista + "");








    }
    //EX2
    //Ler no console nome de pessoas separado por virgula e o sexo da pessoa
    //Ler nomes console e separar grupos por generos
    //imprimir com os grupos separados



    private static void exercicio2() {
        List<Pessoas> pessoas = new ArrayList<>();
        String feminino = "" ;
        String masculino = "";


        Pessoas a = new Pessoas("Luana-", "F");
        Pessoas b = new Pessoas("João-", "M");
        Pessoas c = new Pessoas("Lucas-", "M");
        Pessoas d = new Pessoas("Amanda-", "F");
        pessoas.add(a);
        pessoas.add(b);
        pessoas.add(c);
        pessoas.add(d);
        System.out.println(pessoas);
        Collections.sort(pessoas);
        System.out.println(pessoas + "\n");

        for (int i = 0; i< pessoas.size() ; i++){
            if (pessoas.get(i).toString().contains("F")){
                feminino += pessoas.get(i) + "\n";

            } else {

                masculino += pessoas.get(i) + "\n";
            }

        }
        System.out.println("GRUPO FEMININO");
        System.out.println(feminino.split(","));
        System.out.println("GRUPO MASCULINO");
        System.out.println(masculino);





    }
}
