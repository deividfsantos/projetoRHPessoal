package br.com.projetorh.contrato.bind;

import br.com.projetorh.contrato.model.NivelTecnicoContrato;
import br.com.projetorh.implementacao.model.NivelTecnicoModel;

import java.util.List;
import java.util.stream.Collectors;

public class NivelTecnicoBinder {

    public static List<NivelTecnicoContrato> bind(List<NivelTecnicoModel> nivelTecnicoModels){
        return nivelTecnicoModels.stream()
                .map(model -> {
                    NivelTecnicoContrato nivelTecnicoContrato = new NivelTecnicoContrato();
                    nivelTecnicoContrato.setIdNivelTecnico(model.getIdNivelTecnico());
                    nivelTecnicoContrato.setNivel(model.getNivel());
                    return nivelTecnicoContrato;
                }).collect(Collectors.toList());
    }

}
