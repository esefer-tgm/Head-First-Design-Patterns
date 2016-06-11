/**
 * 
 * Diese Klasse erbt von der Klasse AbstractDuckFactory.
 * Es werden QuarkCounter Objekte erstellt, um die Anzahl der
 * "Quack" zu zählen. Diese Klasse dient dazu, um die Enten
 * zu konkretisieren. Die CountingDuckFactory erstellt Quackcounter, um 
 * die Anzahl der "Quack" zu zählen und DuckFactory erstellt die Enten.
 * 
 * Pattern: Factory 
 *
 * @author Sefer
 * @version 2016-06-11
 */

public class DuckFactory extends AbstractDuckFactory {
  
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}
  
	public Quackable createRedheadDuck() {
		return new RedheadDuck();
	}
  
	public Quackable createDuckCall() {
		return new DuckCall();
	}
   
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}
}
