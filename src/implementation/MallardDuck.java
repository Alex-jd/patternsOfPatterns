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
public class MallardDuck implements Quackable{
	Observable observable;
	
	public MallardDuck() {
		observable = new Observable(this);
	}

	/* (non-Javadoc)
	 * @see service.Quackable#quack()
	 */
	@Override
	public void quack() {
		System.out.println("Quack");
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
