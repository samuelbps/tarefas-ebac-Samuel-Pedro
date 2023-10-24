import br.com.spedro.Cliente;
import br.com.spedro.dao.ClienteDao;
import br.com.spedro.dao.ClienteDaoMock;
import br.com.spedro.dao.IClienteDAO;
import br.com.spedro.exceptions.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDAOTest {
    private IClienteDAO clienteDAO;
    private Cliente cliente;

    public ClienteDAOTest(){
     clienteDAO = new ClienteDaoMock();
    }

    @Before
    public void init(){
        cliente = new Cliente();
        cliente.setCpf(1234567891L);
        cliente.setEstado("SP");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setNome("João");
        cliente.setNumero(10);
        cliente.setTel(11999999999L);
        clienteDAO.cadastrar(cliente);

    }

    @Test
    public void pesquisarCliente(){
        Cliente clienteConsultado = clienteDAO.cadastrar(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }



    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        Boolean retorno = clienteDAO.cadastrar(cliente);
        Assert.assertTrue(retorno);
    }
    @Test
    public void excluirCliente(){
        clienteDAO.excluir(cliente.getCpf());
    }
    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("João Reis");
        clienteDAO.alterar(cliente);

        Assert.assertEquals("João Reis", cliente.getNome());
    }
}
