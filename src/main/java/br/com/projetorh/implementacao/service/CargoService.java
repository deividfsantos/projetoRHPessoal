package br.com.projetorh.implementacao.service;

import br.com.projetorh.implementacao.dao.tabelas.CargoDAO;
import br.com.projetorh.implementacao.model.CargoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoService {

    @Autowired
    CargoDAO cargoDAO;

    public List<CargoModel> listarTodosCargos(){
        return cargoDAO.retornaCargos();
    }
}
