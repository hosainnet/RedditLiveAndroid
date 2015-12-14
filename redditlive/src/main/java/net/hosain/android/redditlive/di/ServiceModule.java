package net.hosain.android.redditlive.di;

import net.hosain.android.redditlive.service.ApiService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

@Module
public class ServiceModule {

    private static final String API_HOST = "http://redditlive.hosain.net";

    @Provides
    @Singleton
    public ApiService providesApiService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_HOST)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(ApiService.class);
    }
}
