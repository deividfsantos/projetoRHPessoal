package br.com.projetorh.contrato.bind;

import br.com.projetorh.contrato.model.EscolaridadeContrato;
import br.com.projetorh.implementacao.model.EscolaridadeModel;

import java.util.List;
import java.util.stream.Collectors;

public class EscolaridadeBinder {

    public static List<EscolaridadeContrato> bind(List<EscolaridadeModel> escolaridades){
        return escolaridades.stream()
                .map(modelo -> {
                    EscolaridadeContrato escolaridadeContrato = new EscolaridadeContrato();
                    escolaridadeContrato.setEscolaridade(modelo.getEscolaridade());
                    escolaridadeContrato.setIdEscolaridade(modelo.getIdEscolaridade());
                    return escolaridadeContrato;
                }).collect(Collectors.toList());
    }

}
