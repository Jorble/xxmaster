package com.jor.xxmaster.intenet;

import com.jor.xxmaster.entity.News;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/*
 * @Title:  ApiService
 * @Description:  ${TODO}<api请求>
 * @author:  Jorble
 * @data:  2016/12/13 16:16
 * @version:  V1.0
 */
public interface ApiService {
    @GET("toutiao/index")
    Call<News> getNews(@Query("key") String key,@Query("type") String type);
}
