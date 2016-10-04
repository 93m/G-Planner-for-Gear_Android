package com.example.jinhyoung.gplannerforgear;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by JinHyoung on 2016-10-03.
 */
public class GPlannerAdapter extends BaseAdapter {
    private LayoutInflater mInflater;
    private List<InfoClass> InfoArrays;
    private ViewHolder holder;

    public GPlannerAdapter(Context context, List<InfoClass> array){
        this.mInflater = LayoutInflater.from(context);
        this.InfoArrays = array;
    }
    private class ViewHolder {
        TextView title;
        TextView time;
    }
    @Override
    public int getCount() {
        return InfoArrays.size();
    }

    @Override
    public Object getItem(int position) {
        return this.InfoArrays.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View v = view;
        if(v == null){
            holder = new ViewHolder();
            v = mInflater.inflate(R.layout.list_item, null);
            holder.time = (TextView)v.findViewById(R.id.list_time);
            holder.title = (TextView)v.findViewById(R.id.list_title);
            v.setTag(holder);
        } else {
            holder = (ViewHolder)v.getTag();
        }
        //InfoClass를 생성하여 각 뷰의 포지션에 맞는 데이터를 가져옴
        InfoClass infoClass = (InfoClass) getItem(position);
        holder.time.setText(infoClass.getTime());
        holder.title.setText(infoClass.getTitle());


        return v;
    }

}
