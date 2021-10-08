package state.racket;

public interface Builder {
    Builder addFrame();
    Builder addThread();
    Builder addLogo();
    Racket build();
}
