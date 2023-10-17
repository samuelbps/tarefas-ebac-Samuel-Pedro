import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PessoaTest {
    @Test
    public void cadastrarPessoa() {
        List<Pessoa> list = new ArrayList<Pessoa>();
        Pessoa pessoa = new Pessoa();
        pessoa.setName("Luis");
        pessoa.setGender("M");
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setName("Joana");
        pessoa1.setGender("F");
        list.add(pessoa);
        list.add(pessoa1);
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List empty");
        } else {
            list.stream().filter(p -> p.getGender().equalsIgnoreCase("F"))
                    .forEach(p -> System.out.println(p));

        }
        assertEquals(list.contains(pessoa1), list.contains(pessoa));
    }
}