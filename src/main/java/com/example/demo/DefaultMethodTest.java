package com.example.demo;

@FunctionalInterface
public interface DefaultMethodTest {

    default  void test(){
        int l=10000000;
        System.out.println(l);
        System.out.println("testing default method");
    }
   static   void test(String a){
        System.out.println("testing default method");
    }

    //public void test(Integer a);


    void hh();

    public static void main(String[] args) {
      //  DefaultMethodTest.test();
    }


}
