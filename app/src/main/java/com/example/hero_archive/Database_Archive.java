package com.example.hero_archive;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

 public class Database_Archive extends SQLiteOpenHelper {
    public static final String Database_name = "registerDb";
    public static final String Table_name = "registerUser";
    public static final String  Col1= "Id";
    public static final String Col2 = "username";
    public static final String Col3 = "password";

    public Database_Archive(Context context) {
        super(context, Database_name, null, 1);

    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE registerUser (ID INTEGER PRIMARY KEY AUTOINCREMENT, username TEXT, password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(" DROP TABLE IF EXISTS " + Table_name);
        onCreate(sqLiteDatabase);
    }

    public long addUser(String user, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("username", user);
        contentValues.put("password", password);
        long res = db.insert("registerUser", null, contentValues);
        db.close();
        return res;
    }

     public boolean checkUser(String userName, String senha){
         String[] collumns = {Col1};

         SQLiteDatabase db = this.getWritableDatabase();
         String selection = Col2 + " = ?" + " AND " + Col3 + " = ?";
         String[] selectionArgs = { userName, senha };

         Cursor cursor = db.query(Table_name, collumns, selection, selectionArgs, null, null, null);

         int cursorCount = cursor.getCount();
         cursor.close();

         db.close();

         if (cursorCount > 0 ){
             return true;
         }
         return false;
     }
 }
