package com.testbanco1.testbanco1.Cliente;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DatosMovimientos {

    @GET("rest/tarjetacredito-movimientos.php/3")
    Call<List<com.testbanco1.testbanco1.modelo.DatosMovimientos>> getDatos();
}
