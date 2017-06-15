/**
 * 
 */
package implementation;

import java.util.ArrayList;
import java.util.Iterator;

import service.Quackable;

/**
 * @author alex_jd
 *
 */
public class Flock implements Quackable{
	ArrayList<Quackable> quackers = new ArrayList<Quackable>();
	
	public void add(Quackable quacker) {
		quackers.add(quacker);
	}

	/* (non-Javadoc)
	 * @see service.Quackable#quack()
	 */
	@Override
	public void quack() {
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = (Quackable) iterator.next();
			quacker.quack();
		}
	}
	

}
