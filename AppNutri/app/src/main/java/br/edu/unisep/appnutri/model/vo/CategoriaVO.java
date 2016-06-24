package br.edu.unisep.appnutri.model.vo;

/**
 * Created by Eleandro on 23/06/2016.
 */
public class CategoriaVO {
    private Integer id;


    private String Cafe;

    private String Almoco;

    private String janta;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCafe() {
        return Cafe;
    }

    public void setCafe(String cafe) {
        Cafe = cafe;
    }

    public String getAlmoco() {
        return Almoco;
    }

    public void setAlmoco(String almoco) {
        Almoco = almoco;
    }

    public String getJanta() {
        return janta;
    }

    public void setJanta(String janta) {
        this.janta = janta;
    }
}
