package com.openclassrooms.arista.data.repository;

import com.openclassrooms.arista.data.FakeApiService;
import com.openclassrooms.arista.domain.model.User;

public class UserRepository {

    // Get the current user
    public User getUser() {
        return FakeApiService.getUser();
    }

    // Set or update the user
    public void setUser(User user) {
        FakeApiService.setUser(user);
    }

    // Delete the user
    public void deleteUser() {
        FakeApiService.deleteUser();
    }
}
