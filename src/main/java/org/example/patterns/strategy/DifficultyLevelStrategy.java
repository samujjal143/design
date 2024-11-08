package org.example.patterns.strategy;

// BEHAVIORAL

/*
1. Strategy Pattern defines a family of behaviours, puts each of them into a separate class, and makes their objects interchangeable
2. Strategies are easily replaceable and interchangeable by clients at runtime
3. Applies the Single Responsibility and the Open-Closed principles
4. Each strategy is now isolated in a separate class, and we can easily introduce new strategies
*/

public interface DifficultyLevelStrategy {
    void modifyGameRules();
}
