package Abstraction;

public interface Browser {

       int browsersize = 100;

      void closeBrowser();

      void openBrowser();

      void navigate();

//      static void navigate(){
//            System.out.println("in navigate");
//      }
//
//      default void browse(){
//            System.out.println("Browse");
//      }



}
