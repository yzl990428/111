package com.example.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class RestaurantDetailActivity extends AppCompatActivity {

    public final static String INTENT_RESTAURANT ="restaurant";
    private Restaurant data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        data = (Restaurant) getIntent().getSerializableExtra(INTENT_RESTAURANT);
        ImageView ivPic = findViewById(R.id.iv_pic);
        TextView tvAddress = findViewById(R.id.tv_address);
        TextView tv_contact = findViewById(R.id.tv_contact);
        TextView comment = findViewById(R.id.comment);
        RatingBar rtbar = findViewById(R.id.rtbar);
        tvAddress.setText(data.getAddress());
        tv_contact.setText(data.getContact());
        comment.setText(data.getComment());
        rtbar.setRating(data.getRate());
        int[] img = data.getPic();

        if (img.length>1){
            ivPic.setImageResource(img[1]);
        }

    }
}
