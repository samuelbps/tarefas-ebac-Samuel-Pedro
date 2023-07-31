import java.util.Arrays;
import java.util.Scanner;

public class TarefaMod12 {


    public static void main(String[] args) {
        exercicio();
    }

    private static void exercicio() {
        String pessoas = "Julia-F,Marcio-M,Amanda-F, Pedro-M";
        String[] parts = pessoas.split(",");
        String feminino = "";
        String masculino = "";



        for (int i=0; i< parts.length ; i++){
            if (parts[i].contains("F")){

                feminino += parts[i] + ",";

            }
            else {
                masculino += parts[i] + ",";
            }

        }
        System.out.println("GRUPO FEMININO");
        System.out.println(feminino);
        System.out.println("GRUPO MASCULINO");
        System.out.println(masculino);
    }


}
