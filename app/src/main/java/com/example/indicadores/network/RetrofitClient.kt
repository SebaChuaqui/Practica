package com.example.indicadores.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class RetrofitClient {

    companion object{
        private const val URL_BASE = "https://mindicador.cl/"
        fun getRetrofitClient(): IndicadoresApi{
            val mRetorfit = Retrofit.Builder()
                .baseUrl(URL_BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return mRetorfit.create(IndicadoresApi::class.java)

        }
    }
}