package dasi.com.laguanak;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;

public class Home extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button pilih = (Button) findViewById(R.id.button);
        pilih.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent myIntent = new
                        Intent(view.getContext(),Pilihan.class );
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton web = (ImageButton) findViewById(R.id.ass);
        web.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent myIntent = new
                        Intent(view.getContext(),web.class );
                startActivityForResult(myIntent, 0);
            }
        });


        ImageButton profil = (ImageButton) findViewById(R.id.profile);
        profil.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent myIntent = new
                        Intent(view.getContext(),Profile.class );
                startActivityForResult(myIntent, 0);
            }
        });

        Button exit = (Button) findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Home.this);
                builder.setMessage("Apakah Kamu Benar-Benar Ingin Keluar?")
                        .setCancelable(false)
                        .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                               Home.this.finish();
                            }
                        })
                        .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int arg1) {

                                dialog.cancel();
                            }
                        }).show();

            }
        });

    }


}
