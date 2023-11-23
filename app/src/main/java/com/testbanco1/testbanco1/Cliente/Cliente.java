package com.testbanco1.testbanco1.Cliente;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Cliente {

    private static Retrofit retrofit;

    public static Retrofit getCliente(){
        retrofit = new Retrofit.Builder()
                .baseUrl("https://xqualo.com.mx/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }

}
