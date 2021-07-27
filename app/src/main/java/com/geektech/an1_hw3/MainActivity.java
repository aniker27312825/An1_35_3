package com.geektech.an1_hw3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Country> list;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initRecyclerView();
    }

    private void initRecyclerView() {
        recyclerView=findViewById(R.id.recycler);

        adapter = new Adapter(list);
        recyclerView.setAdapter(adapter);

        adapter.notifyDataSetChanged();
    }

    private void initData() {
        list = new ArrayList<>();



        list.add(new Country(R.drawable.fr,"France","Paris"));
        list.add(new Country(R.drawable.china,"China","Pekin"));
        list.add(new Country(R.drawable.es,"Spain","Madrid"));
        list.add(new Country(R.drawable.tr,"Turkey","Istanbul"));
        list.add(new Country(R.drawable.switzerland,"Switzerland","Jeneva"));
        list.add(new Country(R.drawable.sg,"Singapore","Singapore"));
        list.add(new Country(R.drawable.ie,"Ireland","Dublin"));
        list.add(new Country(R.drawable.gr,"Greece","Athens"));
        list.add(new Country(R.drawable.gb,"Great Britain","London"));
        list.add(new Country(R.drawable.fi,"Finland","Helsinki"));
        list.add(new Country(R.drawable.de,"Germany","Berlin"));
        list.add(new Country(R.drawable.ca,"Canada","Ottawa"));
        list.add(new Country(R.drawable.br,"Brazil","Brazilia"));
        list.add(new Country(R.drawable.bl,"Belgium","Brusselle"));
        list.add(new Country(R.drawable.av,"Austria","Vena"));

    }
}