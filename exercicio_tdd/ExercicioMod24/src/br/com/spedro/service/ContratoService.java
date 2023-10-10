package br.com.spedro.service;

import br.com.spedro.dao.IContratoDao;

import javax.swing.*;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;
    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    public String buscar(){
        contratoDao.buscar();
        return "Sucesso";
    }
    public String excluir(){
        contratoDao.excluir();
        return "Sucesso";
    }

    public String atualizar(){
        contratoDao.atualizar();
        return "Sucesso";
    }


}
