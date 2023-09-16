package com.example.cafeemenusalahyaaqba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class DrinksActivity extends AppCompatActivity {
    ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);
        button=findViewById(R.id.imageButton3);

        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<Drink>(this,
                android.R.layout.simple_list_item_1,
                Drink.drinks);

        ListView listView = (ListView) findViewById(R.id.drinks_list);
        listView.setAdapter(listAdapter);
        AdapterView.OnItemClickListener onItemClickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {

                Intent intent = new Intent(DrinksActivity.this,
                        DrinkDetail.class);
                intent.putExtra("drink_id", (int) id);
                startActivity(intent);

            }
        };
        listView.setOnItemClickListener(onItemClickListener);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DrinksActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}