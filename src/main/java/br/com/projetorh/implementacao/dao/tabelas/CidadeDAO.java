package br.com.projetorh.implementacao.dao.tabelas;

import br.com.projetorh.implementacao.dao.mapper.CidadeRowMapper;
import br.com.projetorh.implementacao.model.CidadeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CidadeDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Transactional(readOnly = true)
    public List<CidadeModel> retornaCidades() {
        List<CidadeModel> cidadeModels = jdbcTemplate.query("SELECT * FROM Cidade", new CidadeRowMapper());
        return cidadeModels;
    }

}









