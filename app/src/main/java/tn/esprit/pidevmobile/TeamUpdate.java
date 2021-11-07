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

import com.google.android.material.textfield.TextInputLayout;

import tn.esprit.pidevmobile.entity.User;

public class TeamUpdate extends AppCompatActivity {

    Button buttoneditTeam;
    private static final String PREFER_NAME = "Reg";
    public static final String KEY_NAME = "Team Name";
    public static final String KEY_LEMAIL = "Leader Email";
    public static final String KEY_CIN = "CIN";
    public static final String KEY_PHONE = "Phone";
    private SharedPreferences sharedPreferences;
    EditText teamnameupdate, leaderupdate, cinupdate, phoneupdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teamupdate);
        buttoneditTeam=findViewById(R.id.buttoneditTeam);
        sharedPreferences = getSharedPreferences(PREFER_NAME, Context.MODE_PRIVATE);
        teamnameupdate=findViewById(R.id.teamnameupdate);
        leaderupdate=findViewById(R.id.leaderupdate);
        cinupdate=findViewById(R.id.cinupdate);
        phoneupdate=findViewById(R.id.phoneupdate);
        teamnameupdate.setText(sharedPreferences.getString("Team Name", ""));
        leaderupdate.setText(sharedPreferences.getString("Leader Email", ""));
        cinupdate.setText(sharedPreferences.getString("CIN", ""));
        phoneupdate.setText(sharedPreferences.getString("Phone", ""));

        buttoneditTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor=sharedPreferences.edit();

                if (sharedPreferences.contains(KEY_NAME)){
                    editor.putString(KEY_NAME, teamnameupdate.getText().toString());
                    editor.apply();
                }

                if(sharedPreferences.contains(KEY_LEMAIL)){
                    editor.putString(KEY_LEMAIL, leaderupdate.getText().toString());
                    editor.apply();
                }

                if (sharedPreferences.contains(KEY_CIN)){
                    editor.putString(KEY_CIN, cinupdate.getText().toString());
                    editor.apply();
                }
                if(sharedPreferences.contains(KEY_PHONE)){
                    editor.putString(KEY_PHONE, phoneupdate.getText().toString());
                    editor.apply();
                }
                Intent intent = new Intent(TeamUpdate.this,TeamDetails.class);
                startActivity(intent);
                Toast.makeText(TeamUpdate.this,"Data updated successfully.",Toast.LENGTH_SHORT).show();
            }
        });
    }

    }

