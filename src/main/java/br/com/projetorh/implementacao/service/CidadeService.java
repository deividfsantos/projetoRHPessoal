package br.com.projetorh.implementacao.service;

import br.com.projetorh.implementacao.dao.tabelas.CidadeDAO;
import br.com.projetorh.implementacao.model.CidadeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService {

    @Autowired
    CidadeDAO cidadeDAO;

    public List<CidadeModel> listarTodasCidades(){
        return cidadeDAO.retornaCidades();
    }
}
