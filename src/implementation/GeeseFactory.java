/**
 * 
 */
package implementation;

import service.AbstractGeeseFactory;
import service.Quackable;

/**
 * @author alex_jd
 *
 */
public class GeeseFactory extends AbstractGeeseFactory{

	/* (non-Javadoc)
	 * @see service.AbstractGeeseFactory#createGoose()
	 */
	@Override
	public Quackable createGoose() {
		// TODO Auto-generated method stub
		return new GooseAdapter(new Goose());
	}

}
