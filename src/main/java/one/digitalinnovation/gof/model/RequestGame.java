package one.digitalinnovation.gof.model;

public class RequestGame {
    
    private final GameType gameType;
    private boolean handled;

    public RequestGame(GameType gameType) {
        this.gameType = gameType;
    }

    public void markHandled() {
        this.handled = true;
    }

    public GameType getGameType() {
        return gameType;
    }

    public enum GameType {
        Xadrez, Dama, Go, Poker
    }
}

