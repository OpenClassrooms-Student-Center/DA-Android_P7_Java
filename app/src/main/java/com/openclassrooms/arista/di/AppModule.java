package com.openclassrooms.arista.di;

import com.openclassrooms.arista.data.repository.ExerciseRepository;
import com.openclassrooms.arista.data.repository.SleepRepository;
import com.openclassrooms.arista.data.repository.UserRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class AppModule {

    @Provides
    @Singleton
    public UserRepository provideUserRepository() {
        return new UserRepository();
    }

    @Provides
    @Singleton
    public SleepRepository provideSleepRepository() {
        return new SleepRepository();
    }

    @Provides
    @Singleton
    public ExerciseRepository provideExerciseRepository() {
        return new ExerciseRepository();
    }

}
