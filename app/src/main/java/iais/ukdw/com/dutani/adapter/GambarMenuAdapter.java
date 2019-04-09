package iais.ukdw.com.dutani.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import iais.ukdw.com.dutani.R;

public class GambarMenuAdapter extends BaseAdapter {

    private Context context;

    //deklarasi Context


    public GambarMenuAdapter(Context c) {

        context = c;
        //Constructor

    }

    public int getCount() {

        return idGambar.length;
    }

    public Object getItem(int position) {


        return null;
    }

    public long getItemId(int position) {

        return 0;

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView == null) {

            imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {

            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(idGambar[position]);
        return imageView;

    }

    private Integer[] idGambar = {


            R.drawable.ic_lahan_add, R.drawable.ic_profil_icon,
            R.drawable.ic_profil_icon, R.drawable.ic_profil_icon,
    };
}
