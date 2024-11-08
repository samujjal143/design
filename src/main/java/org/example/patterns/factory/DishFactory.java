package org.example.patterns.factory;

// CREATIONAL

/*
1. Use Factory Method Design pattern if you have no idea of the exact types of the objects
out code will work with
2. It makes it easy to extend the product construction code independently from the rest of the application
3. It allows introducing new products without breaking existing code
4. Centralises the product creation code in one place in the program
*/

public interface DishFactory {
    Dish createDish();
}
