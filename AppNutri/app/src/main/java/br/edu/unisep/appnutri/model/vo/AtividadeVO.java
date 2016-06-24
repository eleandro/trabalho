package br.edu.unisep.appnutri.model.vo;

/**
 * Created by Eleandro on 23/06/2016.
 */
public class AtividadeVO {

    private Integer id;


    private String atividade;

    private Double km;

    private CategoriaVO categoria;

    public CategoriaVO getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaVO categoria) {
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public Double getKm() {
        return km;
    }

    public void setKm(Double km) {
        this.km = km;
    }
}
