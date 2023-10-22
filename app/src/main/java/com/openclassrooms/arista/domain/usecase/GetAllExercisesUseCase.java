package com.openclassrooms.arista.domain.usecase;

import com.openclassrooms.arista.data.repository.ExerciseRepository;
import com.openclassrooms.arista.domain.model.Exercise;

import java.util.List;
import javax.inject.Inject;

public class GetAllExercisesUseCase {

    private final ExerciseRepository exerciseRepository;

    @Inject
    public GetAllExercisesUseCase(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    public List<Exercise> execute() {
        return exerciseRepository.getAllExercises();
    }
}
