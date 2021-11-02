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


public class Register extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Button buttonReg2;
    TextInputLayout txtUsername, txtPassword, txtEmail,txtPhone;

    // Shared preferences file name
    public static final String PREFER_NAME = "Reg";

    // All Shared Preferences Keys
    public static final String IS_USER_LOGIN = "IsUserLoggedIn";

    // User name (make variable public to access from outside)
    public static final String KEY_NAME = "Name";

    // Email address (make variable public to access from outside)
    public static final String KEY_EMAIL = "Email";

    // password
    public static final String KEY_PASSWORD = "txtPassword";
    // Phone
    public static final String KEY_PHONE = "txtPhone";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_signup);
        txtUsername = findViewById(R.id.nameUser);
        txtPassword = findViewById(R.id.passwordUser);
        txtEmail = findViewById(R.id.emailUser);
        txtPhone =  findViewById(R.id.phoneUser);
        buttonReg2 = findViewById(R.id.buttonRegister);

// creating an shared Preference file for the information to be stored
// first argument is the name of file and second is the mode, 0 is private mode

        sharedPreferences = getSharedPreferences(PREFER_NAME, MODE_PRIVATE);
// get editor to edit in file

        buttonReg2.setOnClickListener(new OnClickListener(){
            public void onClick (View v) {
                SharedPreferences.Editor editor=sharedPreferences.edit();
                String name = txtUsername.getEditText().getText().toString();
                String email = txtEmail.getEditText().getText().toString();
                String pass = txtPassword.getEditText().getText().toString();
                String phone = txtPhone.getEditText().getText().toString();
                if(txtUsername.getEditText().getText().length()<=0){
                    Toast.makeText(Register.this, "Enter name", Toast.LENGTH_SHORT).show();
                }
                else if( txtEmail.getEditText().getText().length()<=0){
                    Toast.makeText(Register.this, "Enter email", Toast.LENGTH_SHORT).show();
                }
                else if( txtPassword.getEditText().getText().length()<=0){
                    Toast.makeText(Register.this, "Enter password", Toast.LENGTH_SHORT).show();
                }
                else if( txtPhone.getEditText().getText().length()<=0){
                    Toast.makeText(Register.this, "Enter Phone", Toast.LENGTH_SHORT).show();
                }
                else{

                    // as now we have information in string. Lets stored them with the help of editor
                    editor.putString(KEY_NAME, name);
                    editor.putString(KEY_EMAIL,email);
                    editor.putString(KEY_PASSWORD,pass);
                    editor.putString(KEY_PHONE,phone);
                    editor.apply();  // commit the values

                // after saving the value open next activity
                Intent ob = new Intent(Register.this,Login.class);
                startActivity(ob);

                Toast.makeText(Register.this,"Hello",Toast.LENGTH_SHORT).show();
            }}
        });
    }

    }
