import br.com.spedro.Cliente;
import br.com.spedro.dao.ClienteDaoMock;
import br.com.spedro.dao.IClienteDAO;
import br.com.spedro.exceptions.TipoChaveNaoEncontradaException;
import br.com.spedro.services.ClienteService;
import br.com.spedro.services.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteServiceTest {
    private IClienteService clienteService;
    private Cliente cliente;

    public ClienteServiceTest(){
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init() throws TipoChaveNaoEncontradaException {
        cliente = new Cliente();
        cliente.setCpf(1234567891L);
        cliente.setEstado("SP");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setNome("João");
        cliente.setNumero(10);
        cliente.setTel(11999999999L);

        clienteService.salvar(cliente);
    }
    @Test
    public void pesquisarCliente(){


        Cliente clienteConsultado = clienteService.buscarPorCpf(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }
    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        Boolean retorno = clienteService.salvar(cliente);
        Assert.assertTrue(retorno);
    }
    @Test
    public void excluirCliente(){
        clienteService.excluir(cliente.getCpf());
    }
    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("João Reis");
        clienteService.alterar(cliente);

        Assert.assertEquals("João Reis", cliente.getNome());
    }


}