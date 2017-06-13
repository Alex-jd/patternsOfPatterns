/**
 * 
 */
package implementation;

import service.Quackable;

/**
 * @author alex_jd
 *
 */
public class DuckCall implements Quackable{

	/* (non-Javadoc)
	 * @see service.Quackable#quack()
	 */
	@Override
	public void quack() {
		System.out.println("Kwak");
		
	}

}
