package br.com.projetorh.contrato.bind;

import br.com.projetorh.contrato.model.CidadeContrato;
import br.com.projetorh.implementacao.model.CidadeModel;

import java.util.List;
import java.util.stream.Collectors;

public class CidadeBinder {

    public static List<CidadeContrato> bind(List<CidadeModel> cidades){
        return cidades.stream()
            .map(modelo -> {
                CidadeContrato contrato = new CidadeContrato();
                contrato.setNomeCidade(modelo.getNomeCidade());
                contrato.setIdCidade(modelo.getIdCidade());
                return contrato;
            }).collect(Collectors.toList());
    }

}
