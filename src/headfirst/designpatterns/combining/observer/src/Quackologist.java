/**
 * Ist selbst ein Observer. 
 * Bei Änderungen wird Quackologist informiert und muss deswegen
 * nicht jedes Mal Observer fragen, ob die Informationen dem neusten
 * Stand entsprechen.
 * 
 * Pattern: Observer
 *
 * @author Sefer
 * @version 2016-06-11
 */

public class Quackologist implements Observer {
 
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: " + duck + " just quacked.");
	}
 
	public String toString() {
		return "Quackologist";
	}
}
