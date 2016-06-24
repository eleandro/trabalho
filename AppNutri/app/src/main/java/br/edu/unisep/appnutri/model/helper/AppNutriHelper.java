package br.edu.unisep.appnutri.model.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Eleandro on 23/06/2016.
 */
public class AppNutriHelper extends SQLiteOpenHelper{

    public AppNutriHelper(Context context){
        super(context, "app_nutri", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE alimentacao (" +
                "_id INTEGER PRIMARY KEY, " +
                "ds_alimentacao TEXT, " +
                "nr_caloria INTEGER ) ");

        db.execSQL("CREATE TABLE categoria (" +
                "_id INTEGER PRIMARY KEY, " +
                "id_categoria INTEGER, " +
                "ds_cafe TEXT," +
                "ds_almoco TEXT, " +
                "ds_janta TEXT, ");

        db.execSQL("CREATE TABLE atividade (" +
                "_id INTEGER PRIMARY KEY, " +
                "ds_atividade TEXT, " +
                "nr_km INTEGER ) ");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
