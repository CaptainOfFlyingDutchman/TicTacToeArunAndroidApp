package com.example.arunv.tictactoe;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arunv on 01-03-2018.
 */

public class MyDatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "ScoreHistory";
    private static final String KEY_NAME = "name";
    private static final String TABLE_SCORE= "ScoreHistory";

    public MyDatabaseHelper(Context context) {

        super(context, DATABASE_NAME, null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_SCORE = "CREATE TABLE" + TABLE_SCORE + "("
                + KEY_NAME + " TEXT" + ")";
        db.execSQL(CREATE_SCORE);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


        db.execSQL("DROP TABLE IF EXISTS ScoreHistory");

        onCreate(db);

    }


    public void addScore(String name)

    {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values=new ContentValues(2);

        values.put(KEY_NAME, name);
        db.insert(TABLE_SCORE,null,values);


    }




    public ArrayList<String> getMyScore() {
        ArrayList<String> array_list = new ArrayList<String>();

        //hp = new HashMap();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from ScoreHistory", null );
        res.moveToFirst();

        while(res.isAfterLast() == false){
            array_list.add(res.getString(res.getColumnIndex(KEY_NAME)));
            res.moveToNext();
        }
        return array_list;
    }



}