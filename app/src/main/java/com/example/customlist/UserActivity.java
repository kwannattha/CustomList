package com.example.customlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.customlist.databinding.ActivityUserBinding;

public class UserActivity extends AppCompatActivity {

    ActivityUserBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUserBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = this.getIntent();

        if (intent != null){
            if (intent != null){
                String name = intent.getStringExtra("name");
                String major = intent.getStringExtra("major");
                String university = intent.getStringExtra("university");
                String quotation = intent.getStringExtra("quotation");
                int imageid = intent.getIntExtra("imageid",R.drawable.kwan);

                binding.Name.setText(name);
                binding.Major.setText(major);
                binding.University.setText(university);
                binding.Quotation.setText(quotation);
                binding.profileImage.setImageResource(imageid);
            }
        }
    }
}