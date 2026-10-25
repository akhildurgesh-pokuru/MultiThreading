package Patterns.SingleTonPractice;

 class Company extends Thread{

     private static Company company;

     int x = 10;
    public void run(){
        synchronized (this){
            x+=30;
            System.out.println(Thread.currentThread().getName()+" "+x);
        }

    }

    public static synchronized Company getInstance(){
        if(company==null){
            company =  new Company();
        }

        return company;
    }
}
