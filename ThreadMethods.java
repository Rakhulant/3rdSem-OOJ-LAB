
class A extends Thread
{

     public void run()
   {

     for(int i=1;i<=5;i++)
    {

   
     System.out.println("\t From thread A : i="+i);
    }

     System.out.println("Exit from A");
    }
 }


 class B extends Thread
 {

     public void run()
   {

     for(int j=1;j<=5;j++)
    {
         
        System.out.println("\t From thread B : j="+j);


     }

     System.out.println("Exit from B");
    }
 }



 class C extends Thread
 {

     public void run()
   {

     for(int k=1;k<=5;k++)
    {
         
        System.out.println("\t From thread c : k="+k);


            }
               System.out.println("Exit from C");
            }
        }



          class ThreadMethods
       {

              public static void main (String args[])
             {

                 /*A tha=new A();
                  B thb=new B();
                 C thc=new C();  */

                  
                System.out.println("start thread A");
                //tha.start();
                new A().start();

                  System.out.println("start thread B");
                   //thb.start();
                   new B().start();

                System.out.println("start thread C");
                  //thc.start();
                  new C().start();


                 System.out.println("End of main Thread");              
             }
         }  
