package state.racket;

public class IdleState implements State {

    Racket racket;
    public IdleState(Racket racket) {
        this.racket = racket;
    }

    @Override
    public void CreateRacket() {
        System.out.println("Buying racket");
        racket.setState(racket.getCreateState());
    }

    @Override
    public void playRacket() {
        System.out.println("Rackets can be dusted if not used for a long time");
    }

    @Override
    public void serviceRacket() {
        System.out.println("If a racket is broken then cannot be repaired");

    }

    @Override
    public void idleRacket() {
        System.out.println("Racket broke");

    }

    public String toString() {
        return "Idle";
    }

}
