package net.hosain.android.redditlive.di;

public class InjectHelper {

    private static RootComponent sRootComponent;

    static {
        initModules();
    }

    private static void initModules() {
        sRootComponent = getRootComponentBuilder()
                .build();
    }

    private static DaggerRootComponent.Builder getRootComponentBuilder() {
        return DaggerRootComponent.builder();
    }

    public static RootComponent getRootComponent() {
        if (sRootComponent == null) {
            initModules();
        }
        return sRootComponent;
    }
}