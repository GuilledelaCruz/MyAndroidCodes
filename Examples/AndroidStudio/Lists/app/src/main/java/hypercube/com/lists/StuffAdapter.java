package hypercube.com.lists;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by guilledelacruz on 1/05/15.
 */
public class StuffAdapter extends ArrayAdapter<Stuff> {

    private Stuff[] stuffs;

    public StuffAdapter (Context context, Stuff[] stuffs){
        super(context, android.R.layout.simple_list_item_1, stuffs);
        this.stuffs = stuffs;
    }

    public View getView(int position, View convertView, ViewGroup group){

        LayoutInflater lay = LayoutInflater.from(getContext());
        View v = lay.inflate(R.layout.stuff, null);

        TextView title = (TextView) v.findViewById(R.id.title);
        TextView number = (TextView) v.findViewById(R.id.number);

        title.setText(stuffs[position].getTitle());
        number.setText(stuffs[position].getNumber().toString());

        return v;
    }
}
