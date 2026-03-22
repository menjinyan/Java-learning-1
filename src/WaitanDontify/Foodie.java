package WaitanDontify;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread{
    ArrayBlockingQueue<String> queue;
    public Foodie(ArrayBlockingQueue<String> queue){
        this.queue=queue;
    }
    @Override
    public void run() {
        while(true){
            try {
                String foodie=queue.take();
                System.out.println(foodie);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
