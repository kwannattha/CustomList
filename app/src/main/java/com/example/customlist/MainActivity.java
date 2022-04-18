package com.example.customlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;


import com.example.customlist.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] imageId = {R.drawable.kwan,R.drawable.make,R.drawable.cream};
        String[] name = {"Nattha Sonsri, Kwan","Alongkorn Praditthawong, Make","Netnapha Thaoang, Cream"};
        String[] id = {"623410032-1","623410037-1","623410069-8"};
        String[] number = {"01","02","03"};
        String[] major = {"Computer and Information Science","Computer and Information Science","Computer and Information Science"};
        String[] university = {"Khon Kean University","Khon Kean University","Khon Kean University"};
        String[] quotation = {"Behind every “it’s okay” is a little pain.\uD83D\uDDA4","Every time it hurts, my walls go up.","Goals: Be happy "};

        ArrayList<User> userArrayList = new ArrayList<>();

        for(int i = 0;i< imageId.length;i++){
            User user = new User(name[i],id[i],number[i],major[i],university[i],quotation[i],imageId[i]);
            userArrayList.add(user);
        }

        ListAdapter listAdapter = new ListAdapter(MainActivity.this,userArrayList);

        binding.listview.setAdapter(listAdapter);
        binding.listview.setClickable(true);
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(MainActivity.this,UserActivity.class);
                i.putExtra("name",name[position]);
                i.putExtra("major",major[position]);
                i.putExtra("university",university[position]);
                i.putExtra("quotation",quotation[position]);
                i.putExtra("imageid",imageId[position]);
                startActivity(i);
            }
        });
    }
}