package com.filmestmdb.ui.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class FavoriteHelper extends SQLiteOpenHelper{

    public static final String DATABASE_NAME = "filmestmdb.db";
    private static final int DATABASE_VERSION = 1;

    public FavoriteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        final String SQL_CREATE_FAVORITE_TABLE =
                "CREATE TABLE " + FavoriteContract.FavoriteEntry.TABLE_NAME + " (" +
                        FavoriteContract.FavoriteEntry.MOVIE_ID       + " INTEGER UNIQUE PRIMARY KEY NOT NULL,"                  +

                        FavoriteContract.FavoriteEntry.MOVIE_TITLE       + " TEXT NOT NULL, "                 +

                        FavoriteContract.FavoriteEntry.MOVIE_OVERVIEW       + " TEXT NOT NULL,"                  +

                        FavoriteContract.FavoriteEntry.MOVIE_VOTE_COUNT       + " INTEGER NOT NULL,"                  +

                        FavoriteContract.FavoriteEntry.MOVIE_VOTE_AVERAGE       + " DOUBLE NOT NULL,"                  +

                        FavoriteContract.FavoriteEntry.MOVIE_RELEASE_DATE       + " TEXT NOT NULL,"                  +

                        FavoriteContract.FavoriteEntry.MOVIE_POSTER_PATH     + " TEXT NOT NULL);";

        db.execSQL(SQL_CREATE_FAVORITE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + FavoriteContract.FavoriteEntry.TABLE_NAME);
        onCreate(db);
    }
}
