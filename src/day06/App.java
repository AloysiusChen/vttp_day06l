//compile: javac -d bin --source-path . ./*.java
//run: java -cp bin App
//package to jar
//run the jar

package day06;

public class App{
    public static void main(String[] args) {

        Thread th = new Thread(new Runnable() {
            public void run(){
                for(int i=0 ; i<10 ; i++){
                    System.out.println(Thread.currentThread().getName() + "->" + i);
                }    
            }
        });
        th.start();
    }
}