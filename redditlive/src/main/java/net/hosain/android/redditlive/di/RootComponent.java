package net.hosain.android.redditlive.di;

import net.hosain.android.redditlive.view.ThreadListActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        ControllerModule.class,
        ServiceModule.class,
})
public interface RootComponent {
    void inject(ThreadListActivity threadListActivity);
}