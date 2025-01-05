class threadexe extends Thread{
        private String name;
        public threadexe(){
            start();
        }
        @Override
        public void run() {
            for(int i=1;i<=10;i++){
            System.out.println(i+"Thread 1");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            }
        }
    }
public class thread extends Thread{

        public thread(){
            start();
        }
        public void run(){
            for(int i=1;i<=10;i++){
                System.out.println(i*i+" Thread 2");
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        public static void main(String[] args) {
            threadexe td=new threadexe();
            thread td2=new thread();
        }
}