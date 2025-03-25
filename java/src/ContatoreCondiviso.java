public class ContatoreCondiviso extends Thread{

    private static int n;
    
    
    public ContatoreCondiviso() {
    
    }
    
        
    
    public synchronized void incrementa(){
    
         n = n + 1000;
    
    }
    
        
    
    @Override
    
    public void run(){
    
         incrementa();
    
         System.out.println(n);
    
    }
    
    
    public static void main(String[] args) {
    
         ContatoreCondiviso c = new ContatoreCondiviso();
    
         ContatoreCondiviso c1 = new ContatoreCondiviso();
    
         ContatoreCondiviso c2 = new ContatoreCondiviso();
    
         ContatoreCondiviso c3 = new ContatoreCondiviso();
    
         ContatoreCondiviso c4 = new ContatoreCondiviso();
    
         ContatoreCondiviso c5 = new ContatoreCondiviso();
    
         ContatoreCondiviso c6 = new ContatoreCondiviso();
    
         ContatoreCondiviso c7 = new ContatoreCondiviso();
    
         ContatoreCondiviso c8 = new ContatoreCondiviso();
    
         ContatoreCondiviso c9 = new ContatoreCondiviso();
    
         
    
         c.start();
    
         c1.start();
    
         c2.start();
    
         c3.start();
    
         c4.start();
    
         c5.start();
    
         c6.start();
    
         c7.start();
    
         c8.start();
    
         c9.start();
    
    }
    
        
    
    }