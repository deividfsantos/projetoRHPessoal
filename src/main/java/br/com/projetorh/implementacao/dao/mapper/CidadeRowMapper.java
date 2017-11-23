package br.com.projetorh.implementacao.dao.mapper;

import br.com.projetorh.implementacao.model.CidadeModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CidadeRowMapper implements RowMapper<CidadeModel> {

    public CidadeModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        CidadeModel cidadeModel = new CidadeModel();
        cidadeModel.setIdCidade(rs.getInt("idCidade"));
        cidadeModel.setNomeCidade(rs.getString("nomeCidade"));
        return cidadeModel;
    }
}
