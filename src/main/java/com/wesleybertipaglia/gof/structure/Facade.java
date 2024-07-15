package com.wesleybertipaglia.gof.structure;

public class Facade {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, screen);

        homeTheater.watchMovie("The Avengers");

        homeTheater.endMovie();
    }
}

class DVDPlayer {
    public void on() {
        System.out.println("DVD Player is on");
    }

    public void off() {
        System.out.println("DVD Player is off");
    }

    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }
}

class Projector {
    public void on() {
        System.out.println("Projector is on");
    }

    public void off() {
        System.out.println("Projector is off");
    }

    public void setInput(DVDPlayer dvdPlayer) {
        System.out.println("Setting DVD player input to projector");
    }
}

class Screen {
    public void up() {
        System.out.println("Screen is up");
    }

    public void down() {
        System.out.println("Screen is down");
    }
}

class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private Screen screen;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, Screen screen) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.screen = screen;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        screen.down();
        projector.on();
        projector.setInput(dvdPlayer);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down the movie theater...");
        dvdPlayer.off();
        projector.off();
        screen.up();
    }
}