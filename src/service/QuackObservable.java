/**
 * 
 */
package service;

/**
 * @author alex_jd
 *
 */
public interface QuackObservable {
	public void registerObserver (Observer observer);
	public void notifyObservers();
	public void removeObserver(Observer observer);

}
