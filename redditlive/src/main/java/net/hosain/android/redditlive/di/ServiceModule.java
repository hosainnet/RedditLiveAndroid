package net.hosain.android.redditlive.di;

import net.hosain.android.redditlive.service.ApiService;
import net.hosain.android.redditlive.service.DataService;
import net.hosain.android.redditlive.service.RedditApiService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

@Module
public class ServiceModule {

    private static final String API_HOST = "http://redditlive.hosain.net";
    private static final String REDDIT_API_HOST = "http://reddit.com";

    @Provides
    @Singleton
    public ApiService providesApiService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_HOST)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(ApiService.class);
    }

    @Provides
    @Singleton
    public RedditApiService providesRedditApiService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(REDDIT_API_HOST)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(RedditApiService.class);
    }

    @Provides
    @Singleton
    public DataService providesDataService() {
        return new DataService();
    }
}
