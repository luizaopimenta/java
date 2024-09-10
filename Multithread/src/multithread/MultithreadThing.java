package multithread;

public class MultithreadThing extends Thread {
    
    private int threadNumber;
    
    public MultithreadThing(int threadNumber){
        this.threadNumber = threadNumber;
    }
    
    @Override
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println( i + " from thread " + this.threadNumber);
            
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                
            }
        }
    }
    
}
