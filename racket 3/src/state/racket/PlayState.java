package state.racket;

public class PlayState implements State{

    Racket racket;
    public PlayState(Racket racket) {
        this.racket = racket;
    }

    @Override
    public void CreateRacket() {
        System.out.println("Racket already brought");
        racket.setState(racket.getCreateState());

    }

    @Override
    public void playRacket() {
        System.out.println("Rackets are made in pairs");
    }

    @Override
    public void serviceRacket() {
        System.out.println("Racket frame must not be subjected to scratching");
        racket.setState(racket.getServiceState());
    }

    @Override
    public void idleRacket() {
        System.out.println("Racket Idleed");
        racket.setState(racket.getIdleState());
    }

    public String toString() {
        return "Protect threads";
    }


}
