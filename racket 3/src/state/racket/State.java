package state.racket;


public interface State
{
    public abstract void CreateRacket();
    public abstract void playRacket();
    public abstract void serviceRacket();
    public abstract void idleRacket();
}
