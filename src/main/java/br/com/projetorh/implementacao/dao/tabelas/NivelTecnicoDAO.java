package br.com.projetorh.implementacao.dao.tabelas;


import br.com.projetorh.implementacao.dao.mapper.NivelTecnicoRowMapper;
import br.com.projetorh.implementacao.model.NivelTecnicoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class NivelTecnicoDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Transactional(readOnly = true)
    public List<NivelTecnicoModel> retornaNiveisTecnicos(){
        List<NivelTecnicoModel> nivelTecnicoModels = jdbcTemplate.query("select * from NivelTecnico", new NivelTecnicoRowMapper());
        return nivelTecnicoModels;
    }

}
