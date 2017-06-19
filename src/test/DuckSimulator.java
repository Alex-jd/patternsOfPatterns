/**
 * 
 */
package test;

import implementation.*;
import service.*;

/**
 * @author alex_jd
 *
 */
public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		AbstractGeeseFactory geeseFactory = new GeeseFactory();
		simulator.simulate(duckFactory);
		simulator.simulate(geeseFactory);
	}
	
	void simulate(AbstractDuckFactory duckFactory) {
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberdDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());
		
		Flock flockOfDucks = new Flock();
		
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);
		
		Flock flockOfMallards = new Flock();
		
		Quackable mallardOne = duckFactory.createMallardDuck();
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardFour = duckFactory.createMallardDuck();
		
		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);	
		flockOfMallards.add(mallardThree);	
		flockOfMallards.add(mallardFour);
		
		flockOfDucks.add(flockOfMallards);
		
		System.out.println("\nDuck Simulator: Whole Flock Simulator");
		simulate(flockOfDucks);
		
		System.out.println("\nDuck Simulator: Mallard Flock Simulator");
		simulate(flockOfMallards);
				
		System.out.println("The ducks quacked " +
							QuackCounter.getQuacks() + " times");
		
		System.out.println("\nDuck simulator: With Observer");
		Quackologist quackalogist = new Quackologist();
		flockOfDucks.registerObserver(quackalogist);
		
		simulate(flockOfDucks);
		
		System.out.println("\nThe ducks quacked " + 
							QuackCounter.getQuacks() + " times");
	}
	
	void simulate(AbstractGeeseFactory geeseFactory) {
		System.out.println("\nGoose Simulator");
		Quackable gooseDuck = geeseFactory.createGoose();
		
		simulate(gooseDuck);
	}
	
	void simulate(Quackable duck) {
		duck.quack();
	}

}
