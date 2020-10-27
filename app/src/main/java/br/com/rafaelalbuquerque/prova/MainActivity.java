package br.com.rafaelalbuquerque.prova;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mySong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySong = MediaPlayer.create(MainActivity.this,R.raw.toque);
        mySong.start();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            @Override public void run(){
                mostrarMainActivity();
                mySong.stop();
            }
        },5000);


        }
        private void mostrarMainActivity(){
        Intent intent = new Intent (MainActivity.this, principal.class);
        startActivity(intent);
        finish();
    }
}