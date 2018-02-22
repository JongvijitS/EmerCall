package masterying.snru.ac.th.emercall.utility;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import masterying.snru.ac.th.emercall.R;

/**
 * Created by Admin on 22/2/2561.
 */

public class HopitaAdapter extends BaseAdapter{

    //    Explicit
  private Context context;
  private int[] ints;
  private String[] titleStrings, phonesStrings;

    public HopitaAdapter(Context context, int[] ints, String[] titleStrings, String[] phonesStrings) {
        this.context = context;
        this.ints = ints;
        this.titleStrings = titleStrings;
        this.phonesStrings = phonesStrings;
    }

    @Override
    public int getCount() {
        return ints.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.listview_layout, viewGroup, false);

        ImageView imageView = view1.findViewById(R.id.imageLstView);
        TextView titleTextView = view1.findViewById(R.id.textViewTitle);
        TextView phoneTextView = view1.findViewById(R.id.textViewPhone);

        imageView.setImageResource(ints[i]);
        titleTextView.setText(titleStrings[i]);
        phoneTextView.setText(phonesStrings[i]);


        return view1;
    }
} // Main Class
