package com.android.tags;

import android.util.Log;

import com.android.tags.adapters.TagsAdapter;
import com.android.tags.models.Tag;

import java.util.List;

import rx.Subscriber;

public class TagsSubscriber extends Subscriber<List<Tag>> {

    private TagsAdapter tagsAdapter;

    public TagsSubscriber(TagsAdapter tagsAdapter) {
        this.tagsAdapter = tagsAdapter;
    }

    @Override
    public void onCompleted() {
        Log.d("TagsObserver", "Completed Fetch");
    }

    @Override
    public void onError(Throwable e) {
        Log.e("TagsObserver", "Error while fetching tags");
    }

    @Override
    public void onNext(List<Tag> tags) {
        Log.d("TagsObserver", "Fetched tags");
        tagsAdapter.addAll(tags);
    }
}
