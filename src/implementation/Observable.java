/**
 * 
 */
package implementation;

import java.util.ArrayList;
import java.util.Iterator;

import service.Observer;
import service.QuackObservable;

/**
 * @author alex_jd
 *
 */
public class Observable implements QuackObservable{
	ArrayList observers = new ArrayList();
	QuackObservable duck;
	
	public Observable (QuackObservable duck) {
		this.duck = duck;
	}

	/* (non-Javadoc)
	 * @see service.QuackObservable#registerObserver(java.util.Observer)
	 */
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	/* (non-Javadoc)
	 * @see service.QuackObservable#notifyObservers()
	 */
	@Override
	public void notifyObservers() {
		Iterator iterator = observers.iterator();
		while (iterator.hasNext()) {
			Observer observer = (Observer) iterator.next();
			observer.update(duck);
		}
	}

	/* (non-Javadoc)
	 * @see service.QuackObservable#removeObserver()
	 */
	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

}
