package com.example.indicadores.network

import com.example.indicadores.pojos.Indicadores
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface IndicadoresApi {

    @GET("api/")
    fun fetchAllIndicadores(): Call<List<Indicadores>>

    @GET("api/")
    suspend fun fetchAllIndicadoresWithCourutines(): Response<List<Indicadores>>

}