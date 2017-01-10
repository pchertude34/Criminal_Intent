package com.example.paytonchertude.criminalintent.database;

import android.database.sqlite.SQLiteDatabase;

/**
 * Created by paytonchertude on 10/26/16.
 */
public class CrimeDbSchema
{
    public static final class CrimeTable
    {
        public static final String NAME = "crimes";

        public static final class Cols
        {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
            public static final String SUSPECT = "suspect";
        }
    }
}
