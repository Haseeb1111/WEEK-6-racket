package state.racket;


public class CreateState implements State {

    Racket racket;
    public CreateState(Racket racket) {
        this.racket = racket;
    }

    @Override
    public void CreateRacket() {
        System.out.println("manufacturing rackets");

    }

    @Override
    public void playRacket() {
        System.out.println("The racket is used to play");
        racket.setState(racket.getPlayState());

    }

    @Override
    public void serviceRacket() {
        System.out.println("the racket should be cleaned and use carefully");
        racket.setState(racket.getServiceState());
    }

    @Override
    public void idleRacket() {
        System.out.println("Racket Idleed");
        racket.setState(racket.getIdleState());
    }
    public String toString() {
        return "brought";
    }
}