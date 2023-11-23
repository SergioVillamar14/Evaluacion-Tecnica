package com.testbanco1.testbanco1.Cliente;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DatosPersonales {


    @GET("rest/tarjetacredito.php/1")
    Call<List<DatosPersonales>> getDatosPersonales();
}
