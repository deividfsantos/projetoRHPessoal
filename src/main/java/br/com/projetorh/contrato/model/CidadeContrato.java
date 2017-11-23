package br.com.projetorh.contrato.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CidadeContrato {
    private String nomeCidade;
    private Integer idCidade;

    public CidadeContrato(String nome, Integer id) {
        this.setNomeCidade(nome);
        this.setIdCidade(id);
    }

    public CidadeContrato() {
    }

    public Integer getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Integer idCidade) {
        this.idCidade = idCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }
}
