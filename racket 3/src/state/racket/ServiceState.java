package state.racket;


public class ServiceState implements State {

    Racket racket;
    public ServiceState(Racket racket) {
        this.racket = racket;
    }

    @Override
    public void CreateRacket() {
        System.out.println("Racket already brought");
        racket.setState(racket.getCreateState());
    }

    @Override
    public void playRacket() {
        System.out.println("Rackets are played in pairs along with a shuttle cock");
        racket.setState(racket.getPlayState());
    }

    @Override
    public void serviceRacket() {
        System.out.println("Racket broken, We can not play with it");
    }

    @Override
    public void idleRacket() {
        System.out.println("racket broke");
        racket.setState(racket.getIdleState());
    }

    public String toString() {
        return "Racket maintaining";
    }

}
