package com.android.tags.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.android.tags.R;
import com.android.tags.models.Tag;

import java.util.ArrayList;
import java.util.List;

public class TagsAdapter extends ArrayAdapter<Tag> {

    List<Tag> tags = new ArrayList<>();
    Context context;

    public TagsAdapter(Context context, int resource, List<Tag> tags) {
        super(context, resource, tags);
        this.context = context;
        this.tags.addAll(tags);
    }

    @Override
    public int getCount() {
        return tags.size();
    }

    @Override
    public Tag getItem(int position) {
        return tags.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void setTags(List<Tag> recentTags) {
        tags.clear();
        tags.addAll(recentTags);
        this.notifyDataSetChanged();
    }

    public void addTag(Tag tag) {
        tags.add(tag);
        this.notifyDataSetChanged();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Tag tag = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.tag_item, null);
        }

        TextView id = (TextView) convertView.findViewById(R.id.number);
        TextView name = (TextView) convertView.findViewById(R.id.name);
        id.setText(String.valueOf(tag.getId()));
        name.setText(tag.getName());
        return convertView;
    }

}
