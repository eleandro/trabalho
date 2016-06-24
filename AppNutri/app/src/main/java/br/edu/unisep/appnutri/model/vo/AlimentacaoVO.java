package br.edu.unisep.appnutri.model.vo;

/**
 * Created by Eleandro on 23/06/2016.
 */
public class AlimentacaoVO {

    private Integer id;

    private String alimento;

    private Integer nrcategoria;


    private CategoriaVO categoria;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Integer getNrcategoria() {
        return nrcategoria;
    }

    public void setNrcategoria(Integer nrcategoria) {
        this.nrcategoria = nrcategoria;
    }

    public CategoriaVO getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaVO categoria) {
        this.categoria = categoria;
    }
}
