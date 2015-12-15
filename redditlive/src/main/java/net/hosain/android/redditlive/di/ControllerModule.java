package net.hosain.android.redditlive.di;

import net.hosain.android.redditlive.controller.IndexActivityController;
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
    public IndexActivityController providesIndexActivityController(ApiService apiService, DataService dataService) {
        return new IndexActivityController(apiService, dataService);
    }

    @Provides
    @Singleton
    public ThreadDetailFragmentController providesThreadFragmentController(RedditApiService redditApiService, DataService dataService) {
        return new ThreadDetailFragmentController(redditApiService, dataService);
    }
}
