package com.example.demo;

public class EvenOddThread {

    int counter =1;
   static int N=20;
    public void printOddNumber()
    {
        synchronized (this)
        {
            // Print number till the N
            while (counter < N) {

                // If count is even then print
                while (counter % 2 == 0) {

                    // Exception handle
                    try {
                        wait();
                    }
                    catch (
                            InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // Print the number
                System.out.println("print odd "+
                        counter );


                // Increment counter
                counter++;

                // Notify to second thread
                notify();
            }
        }
    }

    // Function to print even numbers
    public void printEvenNumber()
    {
        synchronized (this)
        {
            // Print number till the N
            while (counter < N) {

                // If count is odd then print
                while (counter % 2 == 1) {

                    // Exception handle
                    try {
                        wait();
                    }
                    catch (
                            InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // Print the number
                System.out.println("print even "+
                        counter );

                // Increment counter
                counter++;

                // Notify to 2nd thread
                notify();
            }
        }
    }

    public static void main(String[] args) {
        EvenOddThread evenOddThread = new EvenOddThread();
        Thread thread1 = new Thread(evenOddThread::printOddNumber);
        Thread thread2 = new Thread(evenOddThread::printEvenNumber);
        thread1.start();
        thread2.start();
    }
}
