package com.example.restaurant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final List<Restaurant> list = Restaurant.getList();
        RecyclerView  recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        RestaurantAdapter adapter = new RestaurantAdapter(this,list);
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new RestaurantAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Restaurant data = list.get(position);
                Intent intent = new Intent(MainActivity.this, RestaurantDetailActivity.class);
                intent.putExtra(RestaurantDetailActivity.INTENT_RESTAURANT,data);
                startActivity(intent);
            }
        });
    }
}
