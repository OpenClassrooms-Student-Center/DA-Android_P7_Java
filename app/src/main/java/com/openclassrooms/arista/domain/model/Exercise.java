package com.openclassrooms.arista.domain.model;


import org.threeten.bp.LocalDateTime;

import java.util.Objects;

public class Exercise {
    private LocalDateTime startTime;
    private int duration;
    private ExerciseCategory category;
    private int intensity;

    public Exercise(LocalDateTime startTime, int duration, ExerciseCategory category, int intensity) {
        this.startTime = startTime;
        this.duration = duration;
        this.category = category;
        this.intensity = intensity;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public ExerciseCategory getCategory() {
        return category;
    }

    public void setCategory(ExerciseCategory category) {
        this.category = category;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exercise exercise = (Exercise) o;
        return duration == exercise.duration && intensity == exercise.intensity && Objects.equals(startTime, exercise.startTime) && category == exercise.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, duration, category, intensity);
    }
}