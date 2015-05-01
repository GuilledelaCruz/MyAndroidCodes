package hypercube.com.lists;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by guilledelacruz on 1/05/15.
 */
public class SpinnerTest extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner);

        final TextView texto = (TextView) findViewById(R.id.texto);
        final Spinner spin = (Spinner) findViewById(R.id.spin);
        String array[] = {"Objeto 1", "Objeto 2", "Objeto 3"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,
                array);

        spin.setAdapter(adaptador);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent,
                                       android.view.View v, int position, long id) {
                texto.setText("Seleccionado: " +
                        parent.getItemAtPosition(position));
            }

            public void onNothingSelected(AdapterView<?> parent) {
                texto.setText("");
            }
        });
    }
}
