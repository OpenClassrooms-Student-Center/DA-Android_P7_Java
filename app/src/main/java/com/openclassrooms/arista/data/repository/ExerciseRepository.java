package com.openclassrooms.arista.data.repository;

import com.openclassrooms.arista.data.FakeApiService;
import com.openclassrooms.arista.domain.model.Exercise;
import java.util.List;

public class ExerciseRepository {

    // Get all exercises
    public List<Exercise> getAllExercises() {
        return FakeApiService.getAllExercises();
    }

    // Add a new exercise
    public void addExercise(Exercise exercise) {
        FakeApiService.addExercise(exercise);
    }

    // Delete an exercise
    public void deleteExercise(Exercise exercise) {
        FakeApiService.deleteExercise(exercise);
    }

}
