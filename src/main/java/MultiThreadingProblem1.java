/*
handling multiple threads with synchronization and
incrementing the count variable
 */

import java.util.Scanner;

public class MultiThreadingProblem1 {
    public static void main(String[] args) throws InterruptedException {
        counting1 t1 = new counting1();  //creating object of extending class
        counting2 t2 = new counting2();  //creating object of extending class

        t1.start();  //started the thread 1
        t2.start();  //started thread 2

    }
}

class counting1 extends Thread{
    int count =0 ;  //initializing count varibale with 0
    @Override
    public synchronized void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int limit = sc.nextInt();   //limit input from user
        for(int i=0;i<limit;i++){
            count++;   //incrementing count
            System.out.println(Thread.currentThread().getName()+" :"+i);   //printing the count for each iteration
        }
        System.out.println(Thread.currentThread().getName()+" Final Count: "+count);     //printing final count
    }
}

class counting2 extends Thread{
    int count = 0;
    @Override
    public synchronized void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");   //taking iput from user
        int limit = sc.nextInt();
        for(int i=0;i<limit;i++){
            count++;  //incrementing the count
            System.out.println(Thread.currentThread().getName()+" :"+i);  //printing the count iteration
        }
        System.out.println(Thread.currentThread().getName()+" Final Count: "+count);  //printing final count

    }
}
