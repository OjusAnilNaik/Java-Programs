package oops;
interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class Smartphone implements Camera, MusicPlayer {
     public void takePhoto() {
        System.out.println("Picture");
    }

     public void playMusic() {
        System.out.println("Music");
    }
}

public class multipleInheritance {
    public static void main (String[] args) {
        Smartphone ph = new Smartphone();
        ph.takePhoto();
        ph.playMusic();
    }
}
