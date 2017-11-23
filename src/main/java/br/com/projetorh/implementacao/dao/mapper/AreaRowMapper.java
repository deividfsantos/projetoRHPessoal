package br.com.projetorh.implementacao.dao.mapper;

import br.com.projetorh.implementacao.model.AreaModel;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AreaRowMapper implements RowMapper<AreaModel> {

    public AreaModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        AreaModel areaModel = new AreaModel();
        areaModel.setIdArea(rs.getInt("idArea"));
        areaModel.setNomeArea(rs.getString("nomeArea"));
        return areaModel;
    }

}
