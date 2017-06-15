/**
 * 
 */
package implementation;

import service.Observer;
import service.QuackObservable;

/**
 * @author alex_jd
 *
 */
public class Quackologist implements Observer{
	
	public void update(QuackObservable duck) {
		System.out.println("Quackologis: " + duck + " just quacked.");
	}

}
