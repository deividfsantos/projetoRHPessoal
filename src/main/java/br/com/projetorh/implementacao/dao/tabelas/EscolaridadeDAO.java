package br.com.projetorh.implementacao.dao.tabelas;

import br.com.projetorh.implementacao.dao.mapper.EscolaridadeRowMapper;
import br.com.projetorh.implementacao.model.EscolaridadeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EscolaridadeDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Transactional(readOnly = true)
    public List<EscolaridadeModel> retornaEscolaridades(){
        List<EscolaridadeModel> escolaridadeModels = jdbcTemplate.query("Select * from Escolaridade", new EscolaridadeRowMapper());
        return escolaridadeModels;
    }

}
