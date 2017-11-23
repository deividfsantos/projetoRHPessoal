package br.com.projetorh.contrato.bind;


import br.com.projetorh.contrato.model.AreaContrato;
import br.com.projetorh.implementacao.model.AreaModel;

import java.util.List;
import java.util.stream.Collectors;

public class AreaBinder {

    public static List<AreaContrato> bind(List<AreaModel> areas){
        return areas.stream()
                .map(modelo -> {
                    AreaContrato contrato = new AreaContrato();
                    contrato.setNomeArea(modelo.getNomeArea());
                    contrato.setIdArea(modelo.getIdArea());
                    return contrato;
                }).collect(Collectors.toList());

    }

}
