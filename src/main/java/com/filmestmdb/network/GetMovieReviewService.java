package com.filmestmdb.network;

import com.filmestmdb.model.MovieReviewPageResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GetMovieReviewService {
    @GET("movie/{id}/reviews")
    Call<MovieReviewPageResult> getReviews(@Path("id") int movieId, @Query("api_key") String userkey);
}
