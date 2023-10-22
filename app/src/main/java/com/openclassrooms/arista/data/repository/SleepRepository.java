package com.openclassrooms.arista.data.repository;

import com.openclassrooms.arista.data.FakeApiService;
import com.openclassrooms.arista.domain.model.Sleep;


import org.threeten.bp.LocalDateTime;

import java.util.List;
import java.util.Optional;

public class SleepRepository {

    // Get all sleep records
    public List<Sleep> getAllSleeps() {
        return FakeApiService.getAllSleeps();
    }

}
