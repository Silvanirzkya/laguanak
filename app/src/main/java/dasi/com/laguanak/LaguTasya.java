package dasi.com.laguanak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LaguTasya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu_tasya);

        Button pilih = (Button) findViewById(R.id.gembala);
        pilih.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent myIntent = new
                        Intent(view.getContext(), Gembala.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button pilih1 = (Button) findViewById(R.id.gembira);
        pilih1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent myIntent = new
                        Intent(view.getContext(), Gembira.class);
                startActivityForResult(myIntent, 0);
            }
        });


        Button pilih2 = (Button) findViewById(R.id.gelap);
        pilih2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent myIntent = new
                        Intent(view.getContext(), Gelap.class);
                startActivityForResult(myIntent, 0);
            }
        });


        Button pilih3 = (Button) findViewById(R.id.libur);
        pilih3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent myIntent = new
                        Intent(view.getContext(), Libur.class);
                startActivityForResult(myIntent, 0);
            }
        });


        Button pilih4 = (Button) findViewById(R.id.paman);
        pilih4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent myIntent = new
                        Intent(view.getContext(), Paman.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
