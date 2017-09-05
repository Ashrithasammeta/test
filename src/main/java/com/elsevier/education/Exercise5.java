package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {

        private Singleton() {

        }

        public static Singleton getInstance() {
            return SingletonResourceHolder.INSTANCE;
        }

		public void doSomething() {
			System.out.println("Doing something....");
	    }

	    private static class SingletonResourceHolder {
            private static final Singleton INSTANCE = new Singleton();

            private SingletonResourceHolder() {

            }
        }
	}
		
	public static void main(String a[]){
		Singleton.getInstance().doSomething();
	}
}
