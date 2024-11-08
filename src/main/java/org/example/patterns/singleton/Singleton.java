package org.example.patterns.singleton;

public class Singleton {
    // Make instance static
    private static volatile Singleton instance;

    // Make constructor private
    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) { // Also known as the double-checked locking idiom
            synchronized (Singleton.class) {

                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
