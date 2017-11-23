package br.com.projetorh.contrato.bind;

import br.com.projetorh.contrato.model.CargoContrato;
import br.com.projetorh.implementacao.model.CargoModel;

import java.util.List;
import java.util.stream.Collectors;

public class CargoBinder {

    public static List<CargoContrato> bind(List<CargoModel> cargos){
        return cargos.stream()
                .map(modelo -> {
                    CargoContrato contrato = new CargoContrato();
                    contrato.setNomeCargo(modelo.getNomeCargo());
                    contrato.setIdCargo(modelo.getIdCargo());
                    return contrato;
                }).collect(Collectors.toList());
    }
}
