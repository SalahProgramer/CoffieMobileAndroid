package com.example.cafeemenusalahyaaqba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkDetail extends AppCompatActivity {
ImageButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_detail);
button=findViewById(R.id.imageButton);
        Intent intent = getIntent();
        int id = (int)intent.getExtras().get("drink_id");

        Drink drink = Drink.drinks[id];

        ImageView image = (ImageView)findViewById(R.id.coffee_image);
        image.setImageResource(drink.getImageID());

        TextView txtName= (TextView)findViewById(R.id.txtName);
        TextView txtDesc= (TextView)findViewById(R.id.txtDesc);

        txtName.setText(drink.getName().trim());
        txtDesc.setText(drink.getDescription());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(DrinkDetail.this, DrinksActivity.class);
                startActivity(intent);
            }
        });
    }
}