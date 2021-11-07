package tn.esprit.pidevmobile;



import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class UserProfile extends AppCompatActivity {

    private static final String PREFER_NAME = "Reg";
    Button teamformbutton, web;
    private SharedPreferences sharedPreferences;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_profile);
        sharedPreferences = getSharedPreferences(PREFER_NAME, Context.MODE_PRIVATE);
        teamformbutton = findViewById(R.id.teamformbutton);
        web = findViewById(R.id.web);
        txt = findViewById(R.id.txt);
        String login = getSharedPreferences("Reg", MODE_PRIVATE).getString("Name", "");
        txt.setText(String.format("%s", login));
        teamformbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserProfile.this, TeamCreation.class);
                startActivity(intent);
            }
        });
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserProfile.this,Browser.class);
                startActivity(intent);
            }
        });
    }



}
