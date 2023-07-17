import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a nota 1:");
        double nota1 = s.nextDouble();
        System.out.println("Digite a nota 2:");
        double nota2 = s.nextDouble();
        System.out.println("Digite a nota 3:");
        double nota3 = s.nextDouble();
        System.out.println("Digite a nota 4:");
        double nota4 = s.nextDouble();

        double media = (nota1+nota2+nota3+nota4)/4;

        String mediaSt = getMedia(media);
        System.out.println(mediaSt);

    }

    public static String getMedia(double media){
       if (media >= 7){
           return "Aluno aprovado, média: " + media;
       } else if(media>=5){
           return "Aluno de recuperacão, média: " + media;
       }else{
           return "Aluno reprovado, média: " + media;
       }

    }
}
