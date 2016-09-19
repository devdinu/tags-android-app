package com.android.tags;

import com.android.tags.models.Tag;

import java.util.List;

import retrofit2.http.GET;
import rx.Observable;

public interface TagsService {

    public final String endPoint = "http://10.0.2.2/";

    @GET("tags")
    Observable<List<Tag>> getTags();
}
