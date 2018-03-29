package com.example.android.actionbar;




import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.android.actionbar.Person;
import com.example.android.actionbar.R;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        setTitle("Second Activity!");


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       getMenuInflater().inflate(R.menu.second_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.share:
                Toast.makeText(this,"Your file is shared",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.save:
                Toast.makeText(this,"Your file is saved",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }




}
