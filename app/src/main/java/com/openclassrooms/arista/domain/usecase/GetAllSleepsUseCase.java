package com.openclassrooms.arista.domain.usecase;

import com.openclassrooms.arista.data.repository.SleepRepository;
import com.openclassrooms.arista.domain.model.Sleep;

import java.util.List;

import javax.inject.Inject;

public class GetAllSleepsUseCase {

    private final SleepRepository sleepRepository;

    @Inject
    public GetAllSleepsUseCase(SleepRepository sleepRepository) {
        this.sleepRepository = sleepRepository;
    }

    public List<Sleep> execute() {
        return sleepRepository.getAllSleeps();
    }
}