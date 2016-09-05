package com.android.tags.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.android.tags.models.Tag;
import com.android.tags.adapters.TagsAdapter;
import com.android.tags.R;

import java.util.List;

import static java.util.Arrays.asList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.tags_list);
        listView.setAdapter(new TagsAdapter(this, R.layout.tag_item, getOrders()));
    }

    private List<Tag> getOrders() {
        return asList(new Tag(1, "Tag1"), new Tag(2, "Tag 2"));
    }
}
