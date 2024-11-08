package org.example.patterns.factory;

class Sushi implements Dish {

    @Override
    public void prepare() {
        System.out.println("Preparing Sushi...");
    }

    @Override
    public void serve() {
        System.out.println("Serving Sushi...");
    }
}

