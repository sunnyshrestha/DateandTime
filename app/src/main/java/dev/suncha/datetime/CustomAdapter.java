package dev.suncha.datetime;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Sunny on 1/10/2015.
 */
public class CustomAdapter extends BaseAdapter {
    String[] result;
    Context context;
    int[] imageId;
    private static LayoutInflater inflater=null;

    public CustomAdapter(MainActivity mainActivity, String[] settingsList,int[] settingsImages){
        result=settingsList;
        context=mainActivity;
        imageId=settingsImages;
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    public class Holder{
        TextView tv;
        ImageView img;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        Holder holder =new Holder();
        View rowView;
        rowView=inflater.inflate(R.layout.row_item,null);
        holder.tv=(TextView)rowView.findViewById(R.id.title);
        holder.img=(ImageView)rowView.findViewById(R.id.image);

        holder.tv.setText(result[position]);
        holder.img.setImageResource(imageId[position]);

        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"You Clicked "+result[position],Toast.LENGTH_SHORT).show();
            }
        });
        return rowView;
    }
}
