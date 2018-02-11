package com.example.android.pets.data;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by Satya on 2/5/2018.
 */

public final class PetContract {

    //creating a constant for the PetProvider
    public static final String CONTENT_AUTHORITY = "com.example.android.pets";

    //we concatenate the content:// with above CONTENT_AUTHORITY
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    //this stores the path to the pets table
    public static final String PATH_PETS = "pets";
    //just an empty constructor
    private PetContract(){ }

    public static final class PetEntry implements BaseColumns {

        //complete URI will be this
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PETS);

        //name of the table
        public static final String TABLE_NAME = "pets";

        //names of the columns in the table
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN__PET_WEIGHT = "weight";

        //the constants for gender
        public static final int GENDER_MALE = 1 ;
        public static final int GENDER_FEMALE = 2 ;
        public static final int GENDER_UNKNOWN = 0;
    }
}
