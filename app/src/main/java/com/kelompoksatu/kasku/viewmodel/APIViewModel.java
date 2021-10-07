package com.kelompoksatu.kasku.viewmodel;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import com.kelompoksatu.kasku.repository.ApiRepository;

import java.util.List;

public class APIViewModel extends AndroidViewModel {
    private ApiRepository apiRepository;
    public APIViewModel(@NonNull Application application) {
        super(application);
        this.apiRepository = new ApiRepository();

    }

    public MutableLiveData<List<String>> getData() {
        return this.apiRepository.getData();
    }
}
