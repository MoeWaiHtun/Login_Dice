package it.moe.dice;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class Login_Activity extends AppCompatActivity {

    /*
        EditText username;
        EditText password;
        Button loginButton;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);
            username = findViewById(R.id.user);
            password = findViewById(R.id.pass);
            loginButton = findViewById(R.id.loginButton);
        }


        public void cardItemClick(View view) {

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

            loginButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (username.getText().toString().equals("Moe Wai Htun") && password.getText().toString().equals("123456")) {
                        Toast.makeText(Login_Activity.this, "Login Success!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Login_Activity.this, "Login Failed!", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            }
            */
    private final String EMAIL = "moe@gmail.com";
    private final String PASSWORD = "1234";
    private EditText etEmail, etPassword;
    private Button btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail = findViewById(R.id.email);
        etPassword = findViewById(R.id.pass);
        btLogin = findViewById(R.id.loginButton);



    btLogin.setOnClickListener(new View.OnClickListener() {

        public void onClick(View view) {
            String email = etEmail.getText().toString();
            String password = etPassword.getText().toString();
            if (email.equals(EMAIL) && password.equals(PASSWORD)) {
                cardItemClick();
                Toast.makeText(getApplicationContext(), "Login Success!", Toast.LENGTH_SHORT).show();

            } else {
                if (!email.equals(EMAIL)) {
                    Toast.makeText(Login_Activity.this, "Wrong Email Address", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Login_Activity.this, "Wrong Password", Toast.LENGTH_SHORT).show();
                }
            }
        }
        });
    }

        public void cardItemClick() {

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

    }




