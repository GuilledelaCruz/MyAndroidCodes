package guilledelacruz.layaouts;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Main extends ActionBarActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final Button buttonframe = (Button) findViewById(R.id.buttonframe);
        final Button buttonlinear = (Button) findViewById(R.id.buttonlinear);
        final Button buttontable = (Button) findViewById(R.id.buttontable);
        final Button buttongrid = (Button) findViewById(R.id.buttongrid);
        final Button buttonrelative = (Button) findViewById(R.id.buttonrelative);

        buttonframe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main.this,FrameClass.class);
                startActivity(intent);
            }
        });

        buttonlinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main.this,LinearClass.class);
                startActivity(intent);
            }
        });

        buttontable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main.this,TableClass.class);
                startActivity(intent);
            }
        });

        buttongrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main.this,GridClass.class);
                startActivity(intent);
            }
        });

        buttonrelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main.this,RelativeClass.class);
                startActivity(intent);
            }
        });
    }
}
