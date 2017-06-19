/**
 * 
 */
package implementation;

import service.Observer;
import service.Quackable;

/**
 * @author alex_jd
 *
 */
public class RubberDuck implements Quackable{
	Observable observable;
	
	public RubberDuck() {
		observable = new Observable(this);
	}

	/* (non-Javadoc)
	 * @see service.Quackable#quack()
	 */
	@Override
	public void quack() {
		System.out.println("Squeak");
		notifyObservers();
	}

	/* (non-Javadoc)
	 * @see service.QuackObservable#registerObserver(service.Observer)
	 */
	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	/* (non-Javadoc)
	 * @see service.QuackObservable#notifyObservers()
	 */
	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}

	/* (non-Javadoc)
	 * @see service.QuackObservable#removeObserver()
	 */
	@Override
	public void removeObserver(Observer observer) {
		observable.removeObserver(observer);
	}
	
}
