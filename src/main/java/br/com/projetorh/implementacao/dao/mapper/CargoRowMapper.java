package br.com.projetorh.implementacao.dao.mapper;

import br.com.projetorh.implementacao.model.CargoModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CargoRowMapper implements RowMapper<CargoModel>{

    public CargoModel mapRow (ResultSet rs, int rowNum) throws SQLException {
        CargoModel cargoModel = new CargoModel();
        cargoModel.setIdCargo(rs.getInt("idCargo"));
        cargoModel.setNomeCargo(rs.getString("nomeCargo"));
        return cargoModel;

    }
}
