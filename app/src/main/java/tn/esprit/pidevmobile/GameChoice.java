package tn.esprit.pidevmobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;
import android.net.Uri;

import androidx.appcompat.app.AppCompatActivity;

public class GameChoice extends AppCompatActivity {
    Button buttoncs, buttonval, joincommunity, cspatch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_choice);
        cspatch = (Button) findViewById(R.id.cspatch);
        buttoncs = (Button) findViewById(R.id.buttoncs);
        buttonval = (Button) findViewById(R.id.buttonval);
        joincommunity = (Button) findViewById(R.id.joincommunity);
        buttoncs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(GameChoice.this,PatchCSGO.class);
                startActivity(intent);
                //setContentView(R.layout.csgo_page);


            }
        });
        buttonval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent val = new Intent(GameChoice.this,PatchValo.class);
                startActivity(val);
                //setContentView(R.layout.valorant_page);


            }
        });
        joincommunity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameChoice.this,Register.class);
                startActivity(intent);
            }
        });


}}
