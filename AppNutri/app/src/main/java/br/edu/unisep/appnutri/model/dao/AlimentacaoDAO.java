package br.edu.unisep.appnutri.model.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import br.edu.unisep.appnutri.model.helper.AppNutriHelper;
import br.edu.unisep.appnutri.model.vo.AlimentacaoVO;

/**
 * Created by Eleandro on 23/06/2016.
 */
public class AlimentacaoDAO {
    private AppNutriHelper helper;

    public AlimentacaoDAO(Context context) {
        this.helper = new AppNutriHelper(context);
    }

    public Cursor listar(Long id){
        SQLiteDatabase db = helper.getReadableDatabase();

        String [] where = {id.toString()};
        Cursor cursor = db.rawQuery("select * from where id = ?", where);
        return cursor;
    }

    public void salvar(AlimentacaoVO aliementacao){
        SQLiteDatabase db = helper.getWritableDatabase();

        ContentValues valores =new ContentValues();
        valores.put("id_", aliementacao.getId());
        valores.put("ds_alimentacao", aliementacao.getAlimento());
        valores.put("id_categoria", aliementacao.getCategoria().getId());
        valores.put("nr_caloria", aliementacao.getNrcategoria());

        db.insert("alimentacao", null, valores);

        db.close();

    }





}
