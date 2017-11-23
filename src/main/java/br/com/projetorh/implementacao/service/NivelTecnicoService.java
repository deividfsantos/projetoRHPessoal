package br.com.projetorh.implementacao.service;


import br.com.projetorh.implementacao.dao.tabelas.NivelTecnicoDAO;
import br.com.projetorh.implementacao.model.NivelTecnicoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NivelTecnicoService {

    @Autowired
    NivelTecnicoDAO nivelTecnicoDAO;

    public List<NivelTecnicoModel> listarTodosNiveisTecnicos(){
        return nivelTecnicoDAO.retornaNiveisTecnicos();
    }

}
