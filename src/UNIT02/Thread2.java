package UNIT02;

public class Thread2 extends Thread{
    @Override
    public void run() {
        try{
            for(int i=0;i<50;i++){
                System.out.println(" 2 "+i+" "+2*i);
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
