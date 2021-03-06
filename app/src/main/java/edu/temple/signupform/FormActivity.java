package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {
    String name, email, password,Cpassword ;
    Button save;

    EditText nameInput;
    EditText emailInput;
    EditText passwordInput;
    EditText conformPasswordInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameInput = (EditText) findViewById(R.id.TextPersonFirstName);
        emailInput = (EditText) findViewById(R.id.editTextTextEmailAddress);
        passwordInput = (EditText) findViewById(R.id.TextPassword);
        conformPasswordInput = (EditText) findViewById(R.id.TextConformPassword);

        save = (Button) findViewById(R.id.button);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name = nameInput.getText().toString();
                email = emailInput.getText().toString();
                password = passwordInput.getText().toString();
                Cpassword = conformPasswordInput.getText().toString();

                if (name.isEmpty() ) {
                    Toast.makeText(FormActivity.this, "Please fill in all the fields", Toast.LENGTH_LONG).show();
                } else if (email.isEmpty()){
                    Toast.makeText(FormActivity.this, "Please fill in all the fields", Toast.LENGTH_LONG).show();
            } else if( password.isEmpty()){
                    Toast.makeText(FormActivity.this, "Please fill in all the fields", Toast.LENGTH_LONG).show();
                } else if ( Cpassword.isEmpty()){
                    Toast.makeText(FormActivity.this, "Please fill in all the fields", Toast.LENGTH_LONG).show();
                }else{
                    if(password.contentEquals(Cpassword)) {
                        showTest(name);
                    }else{
                        Toast.makeText(FormActivity.this, "Error: Password does not match", Toast.LENGTH_LONG).show();
                    }
                }

            }
        });

    }
    private void showTest(String text){
        Toast.makeText(FormActivity.this,"Welcome, " + text + ", to the SignUpForm App",Toast.LENGTH_LONG).show();
    }
}