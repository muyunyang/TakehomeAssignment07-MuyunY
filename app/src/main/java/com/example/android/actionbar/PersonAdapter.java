package com.example.android.actionbar;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by yangmuyun on 3/27/18.
 */

public class PersonAdapter extends RecyclerView.Adapter<PersonViewHolder> {
    private List<Person> persons;
    private Context context;

    public PersonAdapter(List<Person>persons,Context context){
        this.persons=persons;
        this.context=context;
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        return new PersonViewHolder(view,context);
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position){
        Person person=persons.get(position);
        holder.personName.setText(person.getName());
        holder.personInfo.setText(person.getInfo());
        holder.personPhoto.setImageResource(person.getPhotoId());
    }
    @Override
    public int getItemCount(){return persons.size();}

}
