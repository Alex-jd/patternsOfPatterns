/**
 * 
 */
package implementation;

import service.AbstractDuckFactory;
import service.Quackable;

/**
 * @author alex_jd
 *
 */
public class CountingDuckFactory extends AbstractDuckFactory{

	/* (non-Javadoc)
	 * @see service.AbstractDuckFactory#createMallardDuck()
	 */
	@Override
	public Quackable createMallardDuck() {
		// TODO Auto-generated method stub
		return new QuackCounter(new MallardDuck());
	}

	/* (non-Javadoc)
	 * @see service.AbstractDuckFactory#createRedheadDuck()
	 */
	@Override
	public Quackable createRedheadDuck() {
		// TODO Auto-generated method stub
		return new QuackCounter(new RedheadDuck());
	}

	/* (non-Javadoc)
	 * @see service.AbstractDuckFactory#createDuckCall()
	 */
	@Override
	public Quackable createDuckCall() {
		// TODO Auto-generated method stub
		return new QuackCounter(new DuckCall());
	}

	/* (non-Javadoc)
	 * @see service.AbstractDuckFactory#createRubberdDuck()
	 */
	@Override
	public Quackable createRubberdDuck() {
		// TODO Auto-generated method stub
		return new QuackCounter(new RubberDuck());
	}

}
