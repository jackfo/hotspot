public class TestSyn {
    final static Object obj = new Object();
    public static void test(){
        synchronized (obj){
            System.out.println("test");
        }
    }
    public static void main(String[] args) {
       for (int i=0;i<20;i++){
           Thread thread = new Thread(new Runnable() {
               @Override
               public void run() {
                   TestSyn.test();
               }
           });
       }
    }
}
