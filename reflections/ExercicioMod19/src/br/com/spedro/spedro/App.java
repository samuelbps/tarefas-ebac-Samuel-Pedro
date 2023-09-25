package br.com.spedro.spedro;

import java.lang.reflect.Field;

public class App {
    public static void main(String[] args) {
        for (Field f: TabelaAnotacao.class.getDeclaredFields()) {
            Tabela tabela = f.getAnnotation(Tabela.class);
            if (tabela != null)
                System.out.println(tabela.value());
        }
    }
}
