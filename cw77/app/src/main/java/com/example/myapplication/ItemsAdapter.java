package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.myapplication.Items;

import java.util.List;

public class ItemsAdapter extends ArrayAdapter<Items> {
    List<Items> itemsList;

    public ItemsAdapter(@NonNull Context context, int resource, @NonNull List<Items> objects) {
        super(context, resource, objects);
        itemsList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.list,parent,false);

        Items currentItem = itemsList.get(position);

        ImageView itemImage = view.findViewById(R.id.itemImage);
        TextView itemName = view.findViewById(R.id.itemName);
        TextView itemPrice = view.findViewById(R.id.itemPrice);

        itemImage.setImageResource(currentItem.getItemImage());
        itemName.setText(currentItem.getItemNme());
        itemPrice.setText(currentItem.getItemPrice()+"");

      return view;


    }
}
