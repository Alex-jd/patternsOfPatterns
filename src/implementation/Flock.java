/**
 * 
 */
package implementation;

import java.util.ArrayList;
import java.util.Iterator;

import service.Observer;
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

	/* (non-Javadoc)
	 * @see service.QuackObservable#registerObserver(service.Observer)
	 */
	@Override
	public void registerObserver(Observer observer) {
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = (Quackable) iterator.next();
			quacker.registerObserver(observer);
		}
	}

	/* (non-Javadoc)
	 * @see service.QuackObservable#notifyObservers()
	 */
	@Override
	public void notifyObservers() {
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = (Quackable) iterator.next();
			quacker.notifyObservers();;
		}
	}

	/* (non-Javadoc)
	 * @see service.QuackObservable#removeObserver(service.Observer)
	 */
	@Override
	public void removeObserver(Observer observer) {
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = (Quackable) iterator.next();
			quacker.removeObserver(observer);
		}
	}
	

}
