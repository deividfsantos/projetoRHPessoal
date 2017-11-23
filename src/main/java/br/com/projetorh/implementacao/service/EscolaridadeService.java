package br.com.projetorh.implementacao.service;

import br.com.projetorh.implementacao.dao.tabelas.EscolaridadeDAO;
import br.com.projetorh.implementacao.model.EscolaridadeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EscolaridadeService {

    @Autowired
    EscolaridadeDAO escolaridadeDAO;

    public List<EscolaridadeModel> listarTodasEscolaridades(){
        return escolaridadeDAO.retornaEscolaridades();
    }

}
