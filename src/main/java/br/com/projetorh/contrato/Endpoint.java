package br.com.projetorh.contrato;

import br.com.projetorh.contrato.bind.*;
import br.com.projetorh.contrato.model.*;
import br.com.projetorh.implementacao.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class Endpoint {

    @Autowired
    private CidadeService cidadeService;
    @Autowired
    private AreaService areaService;
    @Autowired
    private CargoService cargoService;
    @Autowired
    private EscolaridadeService escolaridadeService;
    @Autowired
    private NivelTecnicoService nivelTecnicoService;

    @RequestMapping(
                    value = "cidades",
                    method = RequestMethod.GET,
                    produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CidadeContrato> listarCidades(){
        return CidadeBinder.bind(cidadeService.listarTodasCidades());
    }

    @RequestMapping(
                    value = "areas",
                    method = RequestMethod.GET,
                    produces = MediaType.APPLICATION_JSON_VALUE
                    )
    public List<AreaContrato> listarAreas(){
        return AreaBinder.bind(areaService.listarTodasAreas());
    }

    @RequestMapping(
                    value = "cargos",
                    method = RequestMethod.GET,
                    produces = MediaType.APPLICATION_JSON_VALUE
                    )
    public List<CargoContrato> listarCargos(){
        return CargoBinder.bind(cargoService.listarTodosCargos());
    }

    @RequestMapping(value = "escolaridades",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EscolaridadeContrato> listarEscolaridades(){
        return EscolaridadeBinder.bind(escolaridadeService.listarTodasEscolaridades());
    }

    @RequestMapping(value = "niveistecnicos",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<NivelTecnicoContrato> listarTodosNiveis(){
        return NivelTecnicoBinder.bind(nivelTecnicoService.listarTodosNiveisTecnicos());
    }


}
