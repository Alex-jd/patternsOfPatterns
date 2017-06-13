/**
 * 
 */
package implementation;

import service.Quackable;

/**
 * @author alex_jd
 *
 */
public class RubberDuck implements Quackable{

	/* (non-Javadoc)
	 * @see service.Quackable#quack()
	 */
	@Override
	public void quack() {
		System.out.println("Squeak");
		
	}

}
