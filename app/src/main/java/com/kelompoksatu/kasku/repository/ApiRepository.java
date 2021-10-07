package com.kelompoksatu.kasku.repository;

import androidx.lifecycle.MutableLiveData;
import com.kelompoksatu.kasku.service.APIInterface;
import com.kelompoksatu.kasku.service.ApiService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

public class ApiRepository {
    private APIInterface apiInterface;

    public ApiRepository() {
        this.apiInterface = ApiService.getInstance();
    }

    public MutableLiveData<List<String>> getData() {
        MutableLiveData<List<String>> data = new MutableLiveData<>();
        Call<List<String>> dataRes = apiInterface.getData();
        dataRes.enqueue(new Callback<List<String>>() {
            @Override
            public void onResponse(Call<List<String>> call, Response<List<String>> response) {
                data.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<String>> call, Throwable t) {
                data.postValue(null);
            }
        });

        return data;
    }
}
