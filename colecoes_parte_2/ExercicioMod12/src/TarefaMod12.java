import java.util.Arrays;
import java.util.Scanner;

public class TarefaMod12 {


    public static void main(String[] args) {
        exercicio();
    }

    private static void exercicio() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome e o sexo separados por - e por ,:");
        String  pessoas = input.nextLine();

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
