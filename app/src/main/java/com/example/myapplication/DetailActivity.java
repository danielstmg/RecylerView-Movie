package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView iv_detail_title = findViewById(R.id.iv_detail_title);
        TextView iv_detail_desc = findViewById(R.id.iv_detail_desc);
        ImageView iv_detail_poster = findViewById(R.id.iv_detail_poster);

        String desc = getIntent().getStringExtra("desc");
        String title = getIntent().getStringExtra("title");
        int poster = getIntent().getIntExtra("poster", 0);

        iv_detail_title.setText(title);
        iv_detail_desc.setText(desc);
        iv_detail_poster.setImageResource(poster);

    }
}