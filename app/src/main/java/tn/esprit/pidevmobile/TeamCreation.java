package tn.esprit.pidevmobile;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;


public class TeamCreation extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Button teambutton;
    TextInputLayout txtteam, txtleaderemail , txtcin ,txtPhone;

    // Shared preferences file name
    public static final String PREFER_NAME = "Reg";

    // All Shared Preferences Keys
    public static final String IS_USER_LOGIN = "IsUserLoggedIn";

    // User name (make variable public to access from outside)
    public static final String KEY_NAME = "Team Name";

    // Email address (make variable public to access from outside)
    public static final String KEY_EMAIL = "Leader Email";

    // password
    public static final String KEY_PASSWORD = "CIN";
    // Phone
    public static final String KEY_PHONE = "Phone";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_tournament);
        txtteam = findViewById(R.id.teamname);
        txtleaderemail = findViewById(R.id.leader);
        txtcin = findViewById(R.id.cin);
        txtPhone =  findViewById(R.id.phone);
        teambutton = findViewById(R.id.buttonSaveTeam);

// creating an shared Preference file for the information to be stored
// first argument is the name of file and second is the mode, 0 is private mode

        sharedPreferences = getSharedPreferences(PREFER_NAME, MODE_PRIVATE);
// get editor to edit in file

        teambutton.setOnClickListener(new OnClickListener(){
            public void onClick (View v) {
                SharedPreferences.Editor editor=sharedPreferences.edit();
                String team = txtteam.getEditText().getText().toString();
                String leader = txtleaderemail.getEditText().getText().toString();
                String cin = txtcin.getEditText().getText().toString();
                String phone = txtPhone.getEditText().getText().toString();
                if(txtteam.getEditText().getText().length()<=0){
                    Toast.makeText(TeamCreation.this, "Enter name", Toast.LENGTH_SHORT).show();
                }
                else if( txtleaderemail.getEditText().getText().length()<=0){
                    Toast.makeText(TeamCreation.this, "Enter email", Toast.LENGTH_SHORT).show();
                }
                else if( txtcin.getEditText().getText().length()<=0){
                    Toast.makeText(TeamCreation.this, "Enter password", Toast.LENGTH_SHORT).show();
                }
                else if( txtPhone.getEditText().getText().length()<=0){
                    Toast.makeText(TeamCreation.this, "Enter Phone", Toast.LENGTH_SHORT).show();
                }
                else{

                    // as now we have information in string. Lets stored them with the help of editor
                    editor.putString(KEY_NAME, team);
                    editor.putString(KEY_EMAIL,leader);
                    editor.putString(KEY_PASSWORD,cin);
                    editor.putString(KEY_PHONE,phone);
                    editor.apply();  // commit the values

                    // after saving the value open next activity
                    Intent ob = new Intent(TeamCreation.this,Login.class);
                    startActivity(ob);

                    Toast.makeText(TeamCreation.this,"Hello",Toast.LENGTH_SHORT).show();
                }}
        });
    }

}
