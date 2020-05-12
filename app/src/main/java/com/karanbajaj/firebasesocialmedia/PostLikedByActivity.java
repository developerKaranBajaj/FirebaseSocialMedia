package com.karanbajaj.firebasesocialmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class PostLikedByActivity extends AppCompatActivity {

    String postId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_liked_by);

        Intent intent = getIntent();
        postId = intent.getStringExtra("postId");

    }
}
