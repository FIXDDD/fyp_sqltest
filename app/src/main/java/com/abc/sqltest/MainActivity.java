package com.abc.sqltest;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper myDB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDB = new DatabaseHelper(this);
        roomslist(myDB);

    }

    public String[] roomslist(DatabaseHelper myDB){
        Cursor data = myDB.showRooms();
        List<String> list = new ArrayList<String>();
        while(data.moveToNext()){
            list.add(data.getString(0));
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).charAt(0) == 'c'){
                list.remove(list.get(i));
            }
        }
        String[] result= new String[list.size()];
        Log.i("test",Arrays.toString(list.toArray(result)));
        return list.toArray(result);
    }

}