package dasi.com.laguanak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Pilihan extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihan);

        ImageButton tasya = (ImageButton) findViewById(R.id.tasya);
        tasya.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent myIntent = new
                        Intent(view.getContext(),LaguTasya.class );
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton joshua = (ImageButton) findViewById(R.id.joshua);
        joshua.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent myIntent = new
                        Intent(view.getContext(),LaguJoshua.class );
                startActivityForResult(myIntent, 0);
            }
        });


    }

    @Override
    public void onClick(View view) {

    }
}
