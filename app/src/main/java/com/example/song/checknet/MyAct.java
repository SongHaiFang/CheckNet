package com.example.song.checknet;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import static android.R.attr.data;


/**
 * data:2017/7/7 0007.
 * Created by ：宋海防  song on
 */

public class MyAct extends Activity{
    private  List<Data> list;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.er);

        Data data = new Data();
        list = new ArrayList<Data>();
        for (int i = 0 ; i < 10;i++) {

            data.setName("是是是");
            data.setSex("男");
            list.add(data);
        }



        listView = (ListView) findViewById(R.id.listview);
        myAdapter adapter = new myAdapter(MyAct.this,list);
        listView.setAdapter(adapter);
    }

    class myAdapter extends BaseAdapter{
        Context context;
        List<Data> list;

        public myAdapter(Context context, List<Data> list) {
            super();
            this.context = context;
            this.list = list;
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int i) {
            return list.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = View.inflate(context,R.layout.erzi,null);
            TextView sex = (TextView) view.findViewById(R.id.textView);
            TextView name = (TextView) view.findViewById(R.id.textView2);

            sex.setText(list.get(i).getSex());
            name.setText(list.get(i).getName());
            return view;


        }




    }
}
