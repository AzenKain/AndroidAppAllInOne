package com.example.appandroidinone.Tuan1;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.appandroidinone.R;

import java.util.List;

public class Tuan3CustomAdapter extends ArrayAdapter<Tuan3Contact> {

    private Context context;
    private int resource;
    private List<Tuan3Contact> objects;
    private LayoutInflater inflater;
    public Tuan3CustomAdapter(Context context, int resource, List<Tuan3Contact> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.tuan3_itemlistview_layout, null);
            holder = new ViewHolder();
            holder.tvAvatar = convertView.findViewById(R.id.avatarItem);
            holder.tvName = convertView.findViewById(R.id.nameItem);
            holder.tvPhone = convertView.findViewById(R.id.phoneItem);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Tuan3Contact contact = objects.get(position);
        holder.tvAvatar.setText(String.valueOf(position));
        holder.tvAvatar.setText(contact.getAva());
        holder.tvAvatar.setBackgroundColor(Color.GREEN);
        holder.tvName.setText(contact.getName());
        holder.tvPhone.setText(contact.getPhone());

        return convertView;
    }


    public class ViewHolder {
        TextView tvAvatar, tvName, tvPhone;
    }
}
