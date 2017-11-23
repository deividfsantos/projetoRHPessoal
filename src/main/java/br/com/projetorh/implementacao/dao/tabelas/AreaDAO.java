package br.com.projetorh.implementacao.dao.tabelas;

import br.com.projetorh.implementacao.dao.mapper.AreaRowMapper;
import br.com.projetorh.implementacao.model.AreaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public class AreaDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Transactional(readOnly = true)
    public List<AreaModel> retornaAreas(){
        List<AreaModel> areaModels = jdbcTemplate.query("SELECT * FROM Area", new AreaRowMapper());
        return areaModels;
    }
}
