/**
 * Diese abstrakte Klasse AbstractDuck Factory definiert eine Familie von
 * zusammengehörigen Entenarten.
 * 
 * Pattern: Factory 
 *
 * @author Sefer
 * @version 2016-06-11
 */

public abstract class AbstractDuckFactory {
 
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
}
