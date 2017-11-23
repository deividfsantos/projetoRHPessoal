package br.com.projetorh.implementacao.dao.tabelas;

import br.com.projetorh.implementacao.dao.mapper.CargoRowMapper;
import br.com.projetorh.implementacao.model.CargoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CargoDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Transactional(readOnly = true)
    public List<CargoModel> retornaCargos(){
        List<CargoModel> cargoModels = jdbcTemplate.query("SELECT * FROM Cargo",new CargoRowMapper());
        return cargoModels;
    }

}
