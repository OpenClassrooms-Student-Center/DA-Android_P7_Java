package com.openclassrooms.arista.ui.user;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.MutableLiveData;

import com.openclassrooms.arista.domain.model.User;
import com.openclassrooms.arista.domain.usecase.GetUserUsecase;

import javax.inject.Inject;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class UserDataViewModel extends ViewModel {

    private final GetUserUsecase getUserUsecase;
    private final MutableLiveData<User> userLiveData = new MutableLiveData<>();

    @Inject
    public UserDataViewModel(GetUserUsecase getUserUsecase) {
        this.getUserUsecase = getUserUsecase;
        loadUserData();
    }

    private void loadUserData() {
        User user = getUserUsecase.execute();
        userLiveData.setValue(user);
    }

    public MutableLiveData<User> getUserLiveData() {
        return userLiveData;
    }
}
