package state.racket;

public class RacketBuilder implements Builder{

    RacketBuilder(){

    }

    @Override
    public Builder addFrame() {
        System.out.println("Rackets are used in badminton.");
        return this;
    }

    @Override
    public Builder addThread() {
        System.out.println("The threads are inserted into the racket frame.");
        return this;
    }

    @Override
    public Builder addLogo() {
        System.out.println("The threads are to be tied tightly for the racket to be in a good quality");
        return this;
    }

    @Override
    public Racket build() {
        Racket s=new Racket();
        System.out.println("New racket made!");
        return s;
    }
}