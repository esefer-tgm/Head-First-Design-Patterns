/**
 * Durch das Vereinen von Observer Pattern und Factory Pattern
 * wird dieser Klasse ermöglicht die Anzahl der "Quack" zu zählen. 
 * 
 * Pattern: Observer, Factory 
 *
 * @author Sefer
 * @version 2016-06-11
 */

public class QuackCounter implements Quackable {
	Quackable duck;
	static int numberOfQuacks;
  
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}
  
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}
 
	public static int getQuacks() {
		return numberOfQuacks;
	}
 
	public void registerObserver(Observer observer) {
		duck.registerObserver(observer);
	}
 
	public void notifyObservers() {
		duck.notifyObservers();
	}
   
	public String toString() {
		return duck.toString();
	}
}
