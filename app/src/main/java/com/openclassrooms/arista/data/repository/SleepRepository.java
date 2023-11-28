package com.openclassrooms.arista.data.repository;

import com.openclassrooms.arista.data.FakeApiService;
import com.openclassrooms.arista.domain.model.Sleep;
import java.util.List;

public class SleepRepository {

    // Get all sleep records
    public List<Sleep> getAllSleeps() {
        return FakeApiService.getAllSleeps();
    }

}
