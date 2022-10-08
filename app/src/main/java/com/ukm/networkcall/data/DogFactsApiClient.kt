package com.ukm.networkcall.data

import com.ukm.networkcall.models.DogFactData
import retrofit2.Call
import retrofit2.http.GET

interface DogFactsApiClient {
    @GET("api/facts?number=20")
    fun getFacts(): Call<DogFactData>
}