package guilledelacruz.helloworldextended;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

/**
 * Created by GuilledelaCruz on 14/03/15.
 */
public class TextClass extends ActionBarActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.textclass);

        final TextView text = (TextView) findViewById(R.id.textview);
        Intent intent = getIntent();

        text.setText((String) intent.getExtras().get("Text"));
    }
}
