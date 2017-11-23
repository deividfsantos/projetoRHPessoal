package br.com.projetorh.implementacao.dao.mapper;

import br.com.projetorh.implementacao.model.NivelTecnicoModel;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NivelTecnicoRowMapper implements RowMapper{

    public NivelTecnicoModel mapRow(ResultSet rs, int rowNum)throws SQLException{

        NivelTecnicoModel nivelTecnicoModel = new NivelTecnicoModel();
        nivelTecnicoModel.setIdNivelTecnico(rs.getInt("idNivelTecnico"));
        nivelTecnicoModel.setNivel(rs.getString("nivel"));
        return nivelTecnicoModel;

    }


}
