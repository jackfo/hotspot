

public class Syn_study {
	public synchronized void Test(){
		System.out.println("test:"+Thread.currentThread().getName());
	}
	
	public static void main(String[] args){
		final Syn_study syn_study = new Syn_study();
		for(int i=0;i<10;i++){
			Thread thread = new Thread(new Runnable(){
				@Override
				public void run() {
					syn_study.Test();
					
				}
				
			},"Thread"+i);
			thread.start();
		}
	}
}
