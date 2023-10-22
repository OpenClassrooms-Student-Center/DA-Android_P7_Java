package com.openclassrooms.arista.ui.sleep;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.openclassrooms.arista.domain.model.Sleep;
import com.openclassrooms.arista.domain.usecase.GetAllSleepsUseCase;

import javax.inject.Inject;

import androidx.lifecycle.MutableLiveData;

import java.util.List;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class SleepViewModel extends ViewModel {

    private final GetAllSleepsUseCase getAllSleepsUseCase;
    private final MutableLiveData<List<Sleep>> sleeps = new MutableLiveData<>();

    @Inject
    public SleepViewModel(GetAllSleepsUseCase getAllSleepsUseCase) {
        this.getAllSleepsUseCase = getAllSleepsUseCase;
    }

    public void fetchSleeps() {
        List<Sleep> sleepList = getAllSleepsUseCase.execute();
        sleeps.setValue(sleepList);
    }

    public LiveData<List<Sleep>> getSleeps() {
        return sleeps;
    }
}
