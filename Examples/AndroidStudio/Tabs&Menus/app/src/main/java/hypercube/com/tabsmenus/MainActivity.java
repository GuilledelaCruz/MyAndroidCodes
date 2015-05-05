package hypercube.com.tabsmenus;

import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        TabHost th = (TabHost) findViewById(android.R.id.tabhost);
        th.setup();

        TabHost.TabSpec spec = th.newTabSpec("tab1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("",
                res.getDrawable(android.R.drawable.ic_btn_speak_now));
        th.addTab(spec);

        spec = th.newTabSpec("tab2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("TAB2",
                res.getDrawable(android.R.drawable.ic_dialog_map));
        th.addTab(spec);

        th.setCurrentTab(0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        final TextView txt = (TextView) findViewById(R.id.texto1);
        switch (item.getItemId()) {
            case R.id.MnuOpc1:
                txt.setText("Opcion 1 pulsada!");
                return true;
            case R.id.MnuOpc2:
                txt.setText("Opcion 2 pulsada!");;
                return true;
            case R.id.MnuOpc3:
                txt.setText("Opcion 3 pulsada!");;
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public boolean onKeyDown(int keyCode, KeyEvent event){

        //1a forma
        if(keyCode == KeyEvent.KEYCODE_BACK){
            finish();
            return true;
        }

        //2a forma
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                finish(); return true;
            default: return false;
        }
    }
}
