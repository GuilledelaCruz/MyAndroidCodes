package hypercube.com.lists;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * Created by guilledelacruz on 1/05/15.
 */
public class ListViewTest extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        final ListView list = (ListView) findViewById(R.id.lv);
        Stuff[] stuffs = {new Stuff(),
                          new Stuff("Cosa 1", 1)};
        StuffAdapter stuffAdapter = new StuffAdapter(this, stuffs);

        list.setAdapter(stuffAdapter);
    }
}
