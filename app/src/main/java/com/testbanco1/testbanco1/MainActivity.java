package com.testbanco1.testbanco1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.testbanco1.testbanco1.Cliente.Cliente;
import com.testbanco1.testbanco1.Cliente.DatosPersonales;
import com.testbanco1.testbanco1.modelo.DatosMovimientos;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    TextView txtTar, txtNom, txtFecExp, txtCvv, txtBanco;
    List<DatosMovimientos> datos;
    DatosPersonales datosPersonales;
    RecyclerView recyclerView;
    com.testbanco1.testbanco1.Adapter.DatosMovimientos datosMovimientos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponentes();

        cargarDatosPersonales();
        cargarDatosMoviminetos();


    }

    public void initComponentes(){
        txtTar = findViewById(R.id.txtTar1);
        txtNom = findViewById(R.id.txtNom);
        txtFecExp = findViewById(R.id.txtFecExp);
        txtCvv = findViewById(R.id.txtCvv);
        txtBanco = findViewById(R.id.txtBanco);

        recyclerView = findViewById(R.id.rvRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

    }

    public void cargarDatosMoviminetos(){
        Call<List<DatosMovimientos>> call = Cliente.getCliente().create(com.testbanco1.testbanco1.Cliente.DatosMovimientos.class).getDatos();
        call.enqueue(new Callback<List<DatosMovimientos>>() {
            @Override
            public void onResponse(Call<List<DatosMovimientos>> call, Response<List<DatosMovimientos>> response) {
                if (response.isSuccessful()){
                    datos =response.body();
                    datosMovimientos=new com.testbanco1.testbanco1.Adapter.DatosMovimientos(datos,getApplicationContext());
                    recyclerView.setAdapter(datosMovimientos);
                }
            }

            @Override
            public void onFailure(Call<List<DatosMovimientos>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "ERROR AL CARGAR LOS DATOS", Toast.LENGTH_SHORT).show();
            }
        });


    }

    public void cargarDatosPersonales(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://xqualo.com.mx/")
                .addConverterFactory(GsonConverterFactory.create()).build();

    }
}