package state.racket;

public class Main {

    public static void main(String[] args) {

        RacketBuilder sb=new RacketBuilder();
        Racket s=sb. addFrame().addThread().addLogo().build();


        s.CreateRacket();

        s.idleRacket();

        s.serviceRacket();

        s.playRacket();

        s.CreateRacket();


        s.CreateRacket();

        s.serviceRacket();

        s.playRacket();

        s.idleRacket();


        s.CreateRacket();

        s.playRacket();

        s.serviceRacket();

        s.idleRacket();

    }

}
