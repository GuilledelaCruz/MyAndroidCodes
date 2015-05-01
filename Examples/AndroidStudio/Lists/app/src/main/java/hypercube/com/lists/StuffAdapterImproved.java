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
public class StuffAdapterImproved extends ArrayAdapter<Stuff> {

    private Stuff[] stuffs;

    public StuffAdapterImproved (Context context, Stuff[] stuffs){
        super(context, android.R.layout.simple_list_item_1, stuffs);
        this.stuffs = stuffs;
    }

    public View getView(int position, View convertView, ViewGroup group){

        View v = convertView;
        ViewHolder vh;

        if (v == null){

            LayoutInflater lay = LayoutInflater.from(getContext());
            v = lay.inflate(R.layout.stuff, null);
            vh = new ViewHolder();

            vh.title = (TextView) v.findViewById(R.id.title);
            vh.number = (TextView) v.findViewById(R.id.number);

            v.setTag(vh);

        } else {
            vh = (ViewHolder) v.getTag();
        }

        vh.title.setText(stuffs[position].getTitle());
        vh.number.setText(stuffs[position].getNumber().toString());

        return v;
    }

    static class ViewHolder {
        TextView title;
        TextView number;
    }
}
