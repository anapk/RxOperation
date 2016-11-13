package com.li.pro.model;

import com.li.pro.bean.home.BeanHomeBase;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by Administrator on 2016/11/11 0011.
 */

public interface IFragmentCAll {
    @GET("all/{number}/{page}")
    Observable<BeanHomeBase> getFragmentCAll(@Path("number") int number, @Path("page") int page);
}
