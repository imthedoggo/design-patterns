package com.avgu.singleton;

public class LazyInstantiation {

    private static LazyInstantiation lazyInstance;

    private LazyInstantiation() {}

    public  LazyInstantiation getLazyInstance() {
        if(lazyInstance == null) {
            lazyInstance = new LazyInstantiation();
        }
        return lazyInstance;
    }
}
