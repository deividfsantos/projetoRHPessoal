package br.com.projetorh.implementacao.dao.mapper;

import br.com.projetorh.implementacao.model.EscolaridadeModel;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EscolaridadeRowMapper implements RowMapper<EscolaridadeModel> {

    public EscolaridadeModel mapRow(ResultSet rs, int rowNum) throws SQLException{

        EscolaridadeModel escolaridadeModel = new EscolaridadeModel();
        escolaridadeModel.setIdEscolaridade(rs.getInt("idEscolaridade"));
        escolaridadeModel.setEscolaridade(rs.getString("escolaridade"));
        return escolaridadeModel;
    }

}
