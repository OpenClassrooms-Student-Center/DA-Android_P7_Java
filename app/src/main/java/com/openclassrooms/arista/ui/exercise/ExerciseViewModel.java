package com.openclassrooms.arista.ui.exercise;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;

import com.openclassrooms.arista.domain.model.Exercise;
import com.openclassrooms.arista.domain.usecase.AddNewExerciseUseCase;
import com.openclassrooms.arista.domain.usecase.DeleteExerciseUseCase;
import com.openclassrooms.arista.domain.usecase.GetAllExercisesUseCase;

import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class ExerciseViewModel extends ViewModel {

    private final GetAllExercisesUseCase getAllExercisesUseCase;
    private final AddNewExerciseUseCase addNewExerciseUseCase;
    private final DeleteExerciseUseCase deleteExerciseUseCase;

    private final MutableLiveData<List<Exercise>> exercisesLiveData = new MutableLiveData<>();

    @Inject
    public ExerciseViewModel(GetAllExercisesUseCase getAllExercisesUseCase,
                             AddNewExerciseUseCase addNewExerciseUseCase,
                             DeleteExerciseUseCase deleteExerciseUseCase) {
        this.getAllExercisesUseCase = getAllExercisesUseCase;
        this.addNewExerciseUseCase = addNewExerciseUseCase;
        this.deleteExerciseUseCase = deleteExerciseUseCase;
        loadAllExercises();
    }

    void deleteExercise(Exercise exercise) {
        deleteExerciseUseCase.execute(exercise);
        loadAllExercises();
    }

    private void loadAllExercises() {
        List<Exercise> exercises = getAllExercisesUseCase.execute();
        exercisesLiveData.setValue(exercises);
    }

    public LiveData<List<Exercise>> getExercisesLiveData() {
        return exercisesLiveData;
    }

    public void addNewExercise(Exercise exercise) {
        addNewExerciseUseCase.execute(exercise);
        loadAllExercises();
    }
}
