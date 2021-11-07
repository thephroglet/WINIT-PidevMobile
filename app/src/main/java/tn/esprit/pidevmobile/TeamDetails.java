package tn.esprit.pidevmobile;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TeamDetails extends AppCompatActivity {
    Button teamdel, teamedit;
    private static final String PREFER_NAME = "Reg";
    private static final String TEAM = "Reg3";
    public static final String KEY_NAME = "Team Name";
    public static final String KEY_LEMAIL = "Leader Email";
    public static final String KEY_CIN = "CIN";
    public static final String KEY_PHONE = "Phone";
    private SharedPreferences sharedPreferences;


    EditText leadermailshow, phoneshow, cinshow, teamnameshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teamdetails);
        sharedPreferences = getSharedPreferences(PREFER_NAME, Context.MODE_PRIVATE);
        leadermailshow = findViewById(R.id.leadermailshow);
        phoneshow = findViewById(R.id.phoneshow);
        cinshow = findViewById(R.id.cinshow);
        teamnameshow = findViewById(R.id.teamnameshow);
        teamnameshow.setText(sharedPreferences.getString("Team Name", ""));
        leadermailshow.setText(sharedPreferences.getString("Leader Email", ""));
        cinshow.setText(sharedPreferences.getString("CIN", ""));
        phoneshow.setText(sharedPreferences.getString("Phone", ""));
        teamedit = findViewById(R.id.teamedit);
        teamdel = findViewById(R.id.teamdel);
        teamdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.remove(KEY_NAME);
                editor.remove(KEY_LEMAIL);
                editor.remove(KEY_CIN);
                editor.remove(KEY_PHONE);
                editor.apply();
                Intent intent = new Intent(TeamDetails.this, UserProfile.class);
                startActivity(intent);
                Toast.makeText(TeamDetails.this, "You can create another Team!", Toast.LENGTH_SHORT).show();
            }
        });
        teamedit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeamDetails.this, TeamUpdate.class);
                startActivity(intent);
/*
                SharedPreferences.Editor editor = sharedPreferences.edit();

                if (sharedPreferences.contains(KEY_NAME)) {
                    editor.putString(KEY_NAME, teamnameshow.getText().toString());
                    editor.apply();
                }

                if (sharedPreferences.contains(KEY_LEMAIL)) {
                    editor.putString(KEY_LEMAIL, leadermailshow.getText().toString());
                    editor.apply();
                }

                if (sharedPreferences.contains(KEY_CIN)) {
                    editor.putString(KEY_CIN, cinshow.getText().toString());
                    editor.apply();
                }
                if (sharedPreferences.contains(KEY_PHONE)) {
                    editor.putString(KEY_PHONE, phoneshow.getText().toString());
                    editor.apply();
                }*/
            }
        });
    }

}