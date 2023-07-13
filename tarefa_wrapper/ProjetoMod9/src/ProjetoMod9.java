public class ProjetoMod9 {
    public static void main(String[] args) {
        //Fazendo casting implicito de numero inteiro para Long
        int num = 20;
        System.out.println(num);
        Long num2 = Long.valueOf(num);
        System.out.println(num2);

        //Alocando variaval Wrapper em uma variavel primitiva e fazendo casting implicito para Double
        float num3 = new Float(20.6);
        System.out.println(num3);
        Double num4 = Double.valueOf(num3);
        System.out.println(num4);

    }
}
