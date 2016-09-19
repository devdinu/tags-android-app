package com.android.tags;

import com.android.tags.adapters.TagsAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class TagsLoader {

    private TagsAdapter tagsAdapter;
    private TagsSubscriber tagsSubscriber;

    private static TagsService createTagService() {


        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(TagsService.endPoint)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();


        return retrofit.create(TagsService.class);
    }

    public static TagsService getTagsService() {
        return createTagService();
    }
}
