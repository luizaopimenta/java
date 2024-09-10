package multithread;

public class Multithread {

    public static void main(String[] args) {

        for(int i = 0; i<4; i++){
            MultithreadThing myThing = new MultithreadThing(i);
            myThing.start();
        }

    }
    
}
