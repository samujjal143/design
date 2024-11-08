package org.example.patterns.strategy;

public class Game {
    private DifficultyLevelStrategy difficultyLevelStrategy;

    public Game(DifficultyLevelStrategy difficultyLevelStrategy) {
        this.difficultyLevelStrategy = difficultyLevelStrategy;
    }

    public void setDifficultyLevelStrategy(DifficultyLevelStrategy difficultyLevelStrategy) {
        this.difficultyLevelStrategy = difficultyLevelStrategy;
    }

    public void startGame() {
        difficultyLevelStrategy.modifyGameRules();
    }
}
