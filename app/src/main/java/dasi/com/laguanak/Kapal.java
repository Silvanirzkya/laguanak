package dasi.com.laguanak;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class Kapal extends AppCompatActivity {

    private Button btnplay;
    private Button btnpause;
    private Button btnstop;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kapal);

        mp = new MediaPlayer();

        btnplay =(Button) findViewById(R.id.btnplay);
        btnpause =(Button) findViewById(R.id.btnpause);
        btnstop =(Button) findViewById(R.id.btnstop);

        stateAwal();

        btnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play();
                btnplay.setEnabled(false);
                btnpause.setEnabled(true);
                btnstop.setEnabled(true);
            }

        });

        btnpause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pause();
            }
        });


        btnstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stop();
            }
        });


    }

    private void stateAwal() {
        btnplay.setEnabled(true);
        btnpause.setEnabled(false);
        btnstop.setEnabled(false);
    }

    /** Dijalankan Oleh Tombol Play**/
    private void play(){
        /** Memanggil Lagu**/
        mp =MediaPlayer.create(this,R.raw.kapal);

        try {
            mp.prepare();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }

        /** Menjalankan Audio**/
        mp.start();


        /** Penanganan ketika suara berakhir**/
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                stateAwal();
            }
        });
    }

    /** Dijalankan Oleh Tombol Pause**/
    public void pause(){
        if (mp.isPlaying()){
            if(mp!=null){
                mp.pause();
            }
        } else {
            if (mp!=null){
                mp.start();
            }
        }

    }

    /** Dijalankan Oleh Tombol Stop**/
    public void stop(){
        mp.stop();

        try{
            mp.prepare();
            mp.seekTo(0);
        }catch (Throwable t){
            t.printStackTrace();
        }
        stateAwal();
    }
}
