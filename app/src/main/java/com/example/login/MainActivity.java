package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import interfacesDesign.MainActivity2s;

public class MainActivity extends AppCompatActivity{

    EditText username, password;
    Button btnLogin;
    //VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.android_email);
        password = (EditText) findViewById(R.id.pass_et);
        btnLogin = (Button)findViewById(R.id.btn_order);

        //videoView = findViewById(R.id.videoView_main);
        // Video bc_mainLogins
        // int view = 1\


        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video2);
//        videoView.setVideoURI(uri);
//        videoView.start();
//        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mp.setLooping(true);
//            }
        //Add Looping VIdeo inspector

//        });


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usernameKey = username.getText().toString();
                String passwordKey = password.getText().toString();

                if (usernameKey.equals("admin") && passwordKey.equals("123")){
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, MainActivity2s.class);
                    startActivity(intent);
                }else {
                    //jika login gagal
                        Toast.makeText(getApplicationContext(), "LOGIN FAILED",
                                Toast.LENGTH_SHORT).show();
                }
            }

        });

    }

}