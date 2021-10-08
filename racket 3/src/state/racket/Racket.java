package state.racket;


public class Racket
{
    PlayState playState;
    ServiceState serviceState;
    CreateState CreateState;
    IdleState idleState;
    State state;

    Racket()
    {
        playState = new PlayState(this);
        serviceState= new ServiceState(this);
        idleState = new IdleState(this);
        CreateState=new CreateState(this);
        state=CreateState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public PlayState getPlayState() {
        return playState;
    }

    public ServiceState getServiceState() {
        return serviceState;
    }

    public CreateState getCreateState() {
        return CreateState;
    }

    public IdleState getIdleState() {
        return idleState;
    }

    public void CreateRacket()  {
        state.CreateRacket();
    }

    public void playRacket()  {
        state.playRacket();
    }

    public void serviceRacket() {
        state.serviceRacket();
    }
    public void idleRacket() {
        state.idleRacket();
    }

    public String toString() {
        StringBuffer sbuffer=new StringBuffer();

        sbuffer.append("\nRacket State  \nRacket "+state);

        return sbuffer.toString();
    }
}
