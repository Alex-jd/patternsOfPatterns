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
public class QuackCounter implements Quackable{
	Quackable duck;
	static int numberOfQuacks;
	
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}
	
	/* (non-Javadoc)
	 * @see service.Quackable#quack()
	 */
	@Override
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}

	public static int getQuacks() {
		return numberOfQuacks;
	}
	
	/* (non-Javadoc)
	 * @see service.QuackObservable#registerObserver(service.Observer)
	 */
	@Override
	public void registerObserver(Observer observer) {
		duck.registerObserver(observer);
	}

	/* (non-Javadoc)
	 * @see service.QuackObservable#notifyObservers()
	 */
	@Override
	public void notifyObservers() {
		duck.notifyObservers();
	}

	/* (non-Javadoc)
	 * @see service.QuackObservable#removeObserver()
	 */
	@Override
	public void removeObserver(Observer observer) {
		duck.removeObserver(observer);
	}
	

}
