package com.example.restaurantreview.data.retrofit

import com.example.restaurantreview.data.response.Response
import retrofit2.Call
import retrofit2.http.*
import com.example.restaurantreview.data.response.PostReviewResponse

interface ApiService {
    @GET("detail/{id}")
    fun getRestaurant(
        @Path("id") id: String
    ): Call<Response>

    @FormUrlEncoded
    @Headers("Authorization: token 12345")
    @POST("review")
    fun postReview(
        @Field("id") id: String,
        @Field("name") name: String,
        @Field("review") review: String
    ): Call<PostReviewResponse>
}