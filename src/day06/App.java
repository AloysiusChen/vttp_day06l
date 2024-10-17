//compile: javac -d bin --source-path . ./*.java
//run: java -cp bin App
//package to jar
//run the jar

package day06;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App{
    public static void main(String[] args) {

        // Thread th = new Thread(new Runnable() {
        //     public void run(){
        //         for(int i=0 ; i<10 ; i++){
        //             System.out.println(Thread.currentThread().getName() + "->" + i);
        //         }    
        //     }
        // });
        // th.start();

        MyImplementation my1 = new MyImplementation();
        MyImplementation my2 = new MyImplementation();
        MyImplementation my3 = new MyImplementation();
        MyImplementation my4 = new MyImplementation();
        MyImplementation my5 = new MyImplementation();

        // execute the tasks using a single thread
        ExecutorService es = Executors.newSingleThreadExecutor();
        es.execute(my1);
        es.execute(my2);
        es.shutdown();

        //execute the tasks using fixed thread pool
    }
}