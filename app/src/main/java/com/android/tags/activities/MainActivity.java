package com.android.tags.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.android.tags.R;
import com.android.tags.TagsLoader;
import com.android.tags.TagsService;
import com.android.tags.TagsSubscriber;
import com.android.tags.adapters.TagsAdapter;
import com.android.tags.models.Tag;

import rx.Subscription;

import static java.util.Arrays.asList;

public class MainActivity extends Activity {

    private TagsSubscriber tagsSubscriber;
    private TagsService tagsService;
    private TagsAdapter tagsAdapter;
    private Subscription subscriber;
    private Button updateTags;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.tags_list);
        tagsAdapter = new TagsAdapter(this, R.layout.tag_item, asList(new Tag(1, "1tag"), new Tag(2, "2 Tags")));
        listView.setAdapter(tagsAdapter);
        tagsService = TagsLoader.getTagsService();
        updateTags = (Button) findViewById(R.id.update_tags);
    }

    @Override
    protected void onStart() {
        super.onStart();
        updateTags.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                fetch results and show in UI with use of tagsService
            }
        });
    }
}
