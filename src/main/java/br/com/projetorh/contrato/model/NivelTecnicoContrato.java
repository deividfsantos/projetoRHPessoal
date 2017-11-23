package br.com.projetorh.contrato.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NivelTecnicoContrato {

    private Integer idNivelTecnico;
    private String nivel;

    public NivelTecnicoContrato() {
    }

    public Integer getIdNivelTecnico() {
        return idNivelTecnico;
    }

    public void setIdNivelTecnico(Integer idNivelTecnico) {
        this.idNivelTecnico = idNivelTecnico;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

}
