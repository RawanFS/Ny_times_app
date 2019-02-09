package com.example.rawanalsh.warba_test_v0;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import java.util.List;

public class NewsListAdapter extends ArrayAdapter<New> {
    private static final String TAG = "NewsListAdapter";
    private Context mContext;
    int mResource;




    public NewsListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<New> objects ) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResource = resource;


    }
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //get the news info
        String title = getItem(position).getTitle();
        String author = getItem(position).getAuthor();
        String date = getItem(position).getDate();

        //create the news object with the news info
        New new_ = new New(title, author, date);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView= inflater.inflate(mResource, parent, false);

        TextView tvTitle =  (TextView) convertView.findViewById(R.id.tvTitle);
        TextView tvAuthor =  (TextView) convertView.findViewById(R.id.tvAuthor);
        TextView tvDate =  (TextView) convertView.findViewById(R.id.tvDate);

        tvTitle.setText(title);
        tvAuthor.setText(author);
        tvDate.setText(date);

        return convertView;
    }
}
