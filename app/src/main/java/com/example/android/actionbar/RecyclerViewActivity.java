package com.example.android.actionbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangmuyun on 3/27/18.
 */

public class RecyclerViewActivity extends AppCompatActivity {
    private List<Person> person;
    private PersonAdapter personsAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        initialData();
        setTitle("Second Activity!");
        initialData();
        recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        personsAdapter=new PersonAdapter(person,this);
        recyclerView.setAdapter(personsAdapter);
    }

    private void initialData(){
        person= new ArrayList<>();
        person.add(new Person("Bill Clinton","1993-2001",R.drawable.clinton));
        person.add(new Person("George W Bush","2001-2009",R.drawable.bush));
        person.add(new Person("Barack Obama","2009-2017",R.drawable.obama));
    }

    private  void Add(View view){
        person.add(getRandomPerson());
        personsAdapter.notifyDataSetChanged();

    }

    private Person getRandomPerson() {
        int num = (int) (Math.random() * 3);
        if (num == 0)
            return new Person("Bill Clinton", "1993-2001", R.drawable.clinton);
        else if (num == 1)
            return new Person("George W Bush", "2001-2009", R.drawable.bush);
        else {
            return new Person("Barack Obama", "2009-2017", R.drawable.obama);
        }
    }

}
