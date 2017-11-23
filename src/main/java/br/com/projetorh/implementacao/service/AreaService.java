package br.com.projetorh.implementacao.service;

import br.com.projetorh.implementacao.dao.tabelas.AreaDAO;
import br.com.projetorh.implementacao.model.AreaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaService {

    @Autowired
    AreaDAO areaDAO;

    public List<AreaModel> listarTodasAreas(){
        return areaDAO.retornaAreas();
    }

}
