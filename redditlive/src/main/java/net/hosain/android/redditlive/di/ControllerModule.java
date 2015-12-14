package net.hosain.android.redditlive.di;

import net.hosain.android.redditlive.controller.IndexActivityController;
import net.hosain.android.redditlive.service.ApiService;
import net.hosain.android.redditlive.service.DataService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ControllerModule {

    @Provides
    @Singleton
    public IndexActivityController providesIndexActivityController(ApiService apiService, DataService dataService) {
        return new IndexActivityController(apiService, dataService);
    }
}
