package com.android.tags.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.android.tags.models.Tag;
import com.android.tags.R;

import java.util.List;

public class TagsAdapter extends ArrayAdapter<Tag> {

    public TagsAdapter(Context context, int resource, List<Tag> tags) {
        super(context, resource, tags);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Tag tag = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.tag_item, parent, false);
        }
        TextView id = (TextView) convertView.findViewById(R.id.number);
        TextView name = (TextView) convertView.findViewById(R.id.name);
        id.setText(String.valueOf(tag.getId()));
        name.setText(tag.getName());
        return convertView;
    }
}
