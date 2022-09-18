/**
 * 
 */
package java8;

/**
 * @author HP
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.println(0.0%0.0!=0.0/0.0);
		
		new MyThread().start();
		new MyThread(new MyRunnable()).start();

	}

}
