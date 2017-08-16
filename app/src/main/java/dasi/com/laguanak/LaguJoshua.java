package dasi.com.laguanak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LaguJoshua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu_joshua);


        Button pilih = (Button) findViewById(R.id.air);
        pilih.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent myIntent = new
                        Intent(view.getContext(), Air.class);
                startActivityForResult(myIntent, 0);
            }
        });


        Button pilih1 = (Button) findViewById(R.id.cit);
        pilih1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent myIntent = new
                        Intent(view.getContext(), Cit.class);
                startActivityForResult(myIntent, 0);
            }
        });


        Button pilih2 = (Button) findViewById(R.id.kapal);
        pilih2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent myIntent = new
                        Intent(view.getContext(), Kapal.class);
                startActivityForResult(myIntent, 0);
            }
        });


        Button pilih3 = (Button) findViewById(R.id.tul);
        pilih3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent myIntent = new
                        Intent(view.getContext(), Tul.class);
                startActivityForResult(myIntent, 0);
            }
        });


        Button pilih4 = (Button) findViewById(R.id.balon);
        pilih4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent myIntent = new
                        Intent(view.getContext(), Balon.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
