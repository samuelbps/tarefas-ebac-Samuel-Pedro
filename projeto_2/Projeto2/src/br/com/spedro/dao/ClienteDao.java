package br.com.spedro.dao;

import br.com.spedro.Cliente;
import br.com.spedro.generics.GenericDAO;

public class ClienteDao extends GenericDAO<Cliente> implements IClienteDAO {

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {

    }
}
