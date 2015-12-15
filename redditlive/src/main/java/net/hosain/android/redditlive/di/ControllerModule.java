package net.hosain.android.redditlive.di;

import net.hosain.android.redditlive.controller.ThreadListActivityController;
import net.hosain.android.redditlive.controller.ThreadDetailFragmentController;
import net.hosain.android.redditlive.service.ApiService;
import net.hosain.android.redditlive.service.DataService;
import net.hosain.android.redditlive.service.RedditApiService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ControllerModule {

    @Provides
    @Singleton
    public ThreadListActivityController providesIndexActivityController(ApiService apiService, DataService dataService) {
        return new ThreadListActivityController(apiService, dataService);
    }

    @Provides
    @Singleton
    public ThreadDetailFragmentController providesThreadFragmentController(RedditApiService redditApiService, DataService dataService) {
        return new ThreadDetailFragmentController(redditApiService, dataService);
    }
}
