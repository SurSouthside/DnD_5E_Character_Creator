package com.south.DnD_5e_character_creator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void newCharacter(View view){
        Intent newCharacterIntent = new Intent(this, RaceActivity.class);
        startActivity(newCharacterIntent);

    }
}
