/**
 * 
 * Diese Klasse erbt von der Klasse AbstractDuckFactory.
 * Es werden QuarkCounter Objekte erstellt, um die Anzahl der
 * "Quack" zu zählen. Dadurch werden die Enten konkretisiert und diese
 * Klasse kann für jede Ente einen Quack-Counter erstellen.
 * 
 * Pattern: Factory 
 *
 * @author Sefer
 * @version 2016-06-11
 */
 
public class CountingDuckFactory extends AbstractDuckFactory {
  
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}
  
	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}
  
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}
   
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}
}
