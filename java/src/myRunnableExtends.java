public class myRunnableExtends extends Thread {
    
    @Override
    public void run(){
        System.out.println("thread in esecuzione");
    }

    public static void main(String[] args) {
        myRunnableExtends m = new myRunnableExtends();
        m.start();
    }
}
