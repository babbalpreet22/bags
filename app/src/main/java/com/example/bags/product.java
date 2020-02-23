package com.example.bags;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class product extends AppCompatActivity {

    ListView listView1;
    int[] images={R.drawable.creditcards, R.drawable.bgs, R.drawable.shopping, R.drawable.creditcards};

    String[] names={"school bag", "purse","clucher","side bag"};
    int[] prices={90,60,80,50};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        listView1=(ListView)findViewById(R.id.listView1);

        CustomAdaptor customAdaptor=new CustomAdaptor();
        listView1.setAdapter(customAdaptor);
    }
    private class CustomAdaptor extends BaseAdapter{
        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view=getLayoutInflater().inflate(R.layout.custom, null);
            ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
            TextView textView=(TextView)view.findViewById(R.id.textView1a);
            TextView textView1=(TextView)view.findViewById(R.id.textView1b);

            imageView.setImageResource(images[position]);
            textView.setText(names[position]);
            textView.setText(prices[position]);

            return view;

        }
    }
}
