/**
 * 
 */
package implementation;

import service.Quackable;

/**
 * @author alex_jd
 *
 */
public class GooseAdapter implements Quackable{
	Goose goose;
	
	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}

	/* (non-Javadoc)
	 * @see service.Quackable#quack()
	 */
	@Override
	public void quack() {
		goose.honk();
		
	}

}
