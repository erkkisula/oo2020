class Loend implements Runnable {
    private Thread A;
    private String loendiNimi;
    
    Loend( String name) {
       loendiNimi = name;
       System.out.println("Loomisel:  " +  loendiNimi );
    }
    
    public void run() {
       System.out.println("Jooksmisel:  " +  loendiNimi );
       try {
          for(int i = 0; i < 100; i++) {
             System.out.println("Haru: " + loendiNimi + " ; " + i);
             Thread.sleep(25);
          }
       } catch (InterruptedException e) {
          System.out.println("Haru " +  loendiNimi + " häiritud");
       }
       System.out.println("Haru " +  loendiNimi + " lõpetamas");
    }
    
    public void start () {
       System.out.println("alustamas: " +  loendiNimi );
       if (A == null) {
          A = new Thread (this, loendiNimi);
          A.start();
       }
    }
 }