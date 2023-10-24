package br.com.spedro.services;

import br.com.spedro.Cliente;
import br.com.spedro.exceptions.TipoChaveNaoEncontradaException;

public interface IClienteService {
     Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException;

    Cliente buscarPorCpf(Long cpf);


    void excluir(Long cpf);

    void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;
}
