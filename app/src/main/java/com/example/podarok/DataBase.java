package com.example.podarok;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBase extends SQLiteOpenHelper {

    public DataBase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public static Cursor rawQuery(String query, Object o) {
        return null;
    }

    private void insertTableSQL(SQLiteDatabase db, int numTable, String nameTable) {
        String queries = "INSERT INTO " + TABLE_NAME + "(" +
                COLUMN_ID + ", " + COLUMN_NAME + ")" +
                "VALUES " + "(" + numTable + ", '" + nameTable + "')";

        db.execSQL(queries);
    }

    private void createTableSQL(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NAME + " TEXT)";
        System.out.println(query);
        db.execSQL(query);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        createTableSQL(db);
        insertTableSQL(db, 0, "деньги");
        insertTableSQL(db, 1, "кофемашина");
        insertTableSQL(db, 2, "шоколадка");
        insertTableSQL(db, 3, "одежда");
        insertTableSQL(db, 4, "велосипед");
        insertTableSQL(db, 5, "фонарик");
        insertTableSQL(db, 6, "аквариум");
        insertTableSQL(db, 7, "шампунь");
        insertTableSQL(db, 8, "элитный чай");
        insertTableSQL(db, 9, "шахматы");
        insertTableSQL(db, 10, "подушка");
        insertTableSQL(db, 11, "настольные игры");
        insertTableSQL(db, 12, "часы");
        insertTableSQL(db, 13, "ежедневник");
        insertTableSQL(db, 14, "3d ручка");
        insertTableSQL(db, 15, "кружка");
        insertTableSQL(db, 16, "портрет именинника");
        insertTableSQL(db, 17, "фотоальбом");
        insertTableSQL(db, 18, "билеты на концерт");
        insertTableSQL(db, 19, "фитнес браслет");
        insertTableSQL(db, 20, "посуда");
    }


    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }


    // Данные базы данных и таблиц
    public static final String TABLE_NAME = "MyData";
    private static final String DATABASE_NAME = "podarok.db";
    private static final int DATABASE_VERSION = 2;
    // Название столбцов
    public static final String COLUMN_ID = "Id";
    public static final String COLUMN_NAME = "Date";


    // Номера столбцов
    private static final int NUM_COLUMN_ID = 0;
    private static final int NUM_COLUMN_NAME = 1;


}