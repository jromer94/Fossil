package com.joshromer.fossil.rest;

import com.joshromer.fossil.models.FossilOccurenceWrapper;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

/**
 * Created by josh on 12/7/15.
 */
public interface PaleobioService {
    @GET("/data1.2/occs/list.json?show=coords")
    Observable<FossilOccurenceWrapper> getFossilsByLatLng(@Query("latmin") double latmin, @Query("latmax") double latmax, @Query("lngmin") double lngmin, @Query("lngmax") double lngmax);
}
