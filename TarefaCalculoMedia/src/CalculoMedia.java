public class CalculoMedia {
    public static void main(String[] args) {
        calculoMedia();
    }

    private static void calculoMedia() {
        double nota1= 6;
        double nota2= 8;
        double nota3= 10;
        double nota4= 5;
        double media = (nota1+nota2+nota3+nota4)/4;
        System.out.println("A média do aluno é:" + media);
    }
}
