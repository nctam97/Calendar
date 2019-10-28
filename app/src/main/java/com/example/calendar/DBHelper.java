package com.example.calendar;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {

    DBHelper(Context context) {
        super(context, "Calendar.sqlite", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table Book(id interger primary key," + "title text," + "id_author interger)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Book");
        onCreate(db);
    }

    public boolean insertBook(Noidung book) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", book.getTitle());
        contentValues.put("content", book.getContent());
        db.insert("Noidung", null, contentValues);
        return true;

    }



    public Noidung getNoidung(int id) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from Book where id=" + id, null);
        if (cursor != null) {
            cursor.moveToFirst();
        }
        Noidung book = new Noidung(cursor.getString(0), cursor.getString(1));
        cursor.close();
        db.close();
        return book;

    }



    public ArrayList<Noidung> getAllBook() {
        ArrayList<Noidung> listBook = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from Book", null);
        if (cursor != null) {
            cursor.moveToFirst();
        }
        while (cursor.isAfterLast() == false) {
            listBook.add(new Noidung(cursor.getString(0), cursor.getString(1)));
            cursor.moveToNext();
        }
        cursor.close();
        db.close();
        return listBook;

    }










}

