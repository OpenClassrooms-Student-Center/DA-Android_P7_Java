package com.openclassrooms.arista.data;

import com.openclassrooms.arista.domain.model.Exercise;
import com.openclassrooms.arista.domain.model.ExerciseCategory;
import com.openclassrooms.arista.domain.model.Sleep;
import com.openclassrooms.arista.domain.model.User;

import org.threeten.bp.LocalDateTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FakeApiService {

    // Static data
    private static User user = new User("John Doe", "johndoe@example.com", "password123");

    private static List<Sleep> sleepData = new ArrayList<>(
            Arrays.asList(
                    new Sleep(LocalDateTime.now().minusDays(1), 7, 8),
                    new Sleep(LocalDateTime.now().minusDays(2), 6, 5),
                    new Sleep(LocalDateTime.now().minusDays(3), 8, 9)
            ));

    private static List<Exercise> exerciseData = new ArrayList<>(
            Arrays.asList(
                    new Exercise(LocalDateTime.now().minusHours(5), 30, ExerciseCategory.Running, 7),
                    new Exercise(LocalDateTime.now().minusDays(1).minusHours(3), 45, ExerciseCategory.Natation, 6),
                    new Exercise(LocalDateTime.now().minusDays(2).minusHours(4), 60, ExerciseCategory.Football, 8)
            ));

    // CRUD for User
    public static User getUser() {
        return user;
    }

    public static void setUser(User newUser) {
        user = newUser;
    }

    public static void deleteUser() {
        user = null;
    }

    // CRUD for Sleep
    public static List<Sleep> getAllSleeps() {
        return new ArrayList<>(sleepData);
    }

    public static Optional<Sleep> findSleepByStartTime(LocalDateTime startTime) {
        return sleepData.stream().filter(s -> s.getStartTime().equals(startTime)).findFirst();
    }

    // CRUD for Exercise
    public static List<Exercise> getAllExercises() {
        return new ArrayList<>(exerciseData);
    }

    public static void addExercise(Exercise exercise) {
        exerciseData.add(exercise);
    }

    public static void deleteExercise(Exercise exercise) {
        exerciseData.remove(exercise);
    }

}
